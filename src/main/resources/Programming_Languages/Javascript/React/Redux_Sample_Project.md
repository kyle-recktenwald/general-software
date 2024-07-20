### Advanced Redux Sample Project:
* `~/Desktop/Repositories/React/react-tutorial-projects/redux/01-starting-project_2`
* Install Redux & Redux Toolkit:
```
npm install redux
npm install @reduxjs/toolkit
```
* `src/App.js`:
```
import { useEffect, Fragment } from 'react';
import { useSelector, useDispatch } from 'react-redux';

import Cart from './components/Cart/Cart';
import Layout from './components/Layout/Layout';
import Products from './components/Shop/Products';
import Notification from './components/UI/Notification'
import { sendCartData, fetchCartData } from './store/cart-actions';

let isInitial = true;

function App() {
  const dispatch = useDispatch();
  const showCart = useSelector(state => state.ui.cartIsVisible);
  const cart = useSelector((state) => state.cart);
  const notification = useSelector(state => state.ui.notification)

  useEffect(() => {
    dispatch(fetchCartData());
  }, [dispatch])
  
  useEffect(() => {
    if (isInitial) {
      isInitial = false;
      return;
    }

    if(cart.changed){
      dispatch(sendCartData(cart));
    }
  }, [cart, dispatch]);

  return (
    <Fragment>
      {notification && <Notification status={notification.status} title={notification.title} message={notification.message} />}
      <Layout>
        {showCart && <Cart />}
        <Products />
      </Layout>
    </Fragment>
  );
}

export default App;
```
* `src/index.js`:
```
import ReactDOM from 'react-dom/client';
import { Provider } from 'react-redux';

import './index.css';
import App from './App';

import store from './store/index'

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Provider store={store}><App /></Provider>);
```
* `src/components/Cart/Cart.js`:
```
import { useSelector } from 'react-redux';

import Card from '../UI/Card';
import classes from './Cart.module.css';
import CartItem from './CartItem';

const Cart = (props) => {
  const cartItems = useSelector((state) => state.cart.items)
  
  return (
    <Card className={classes.cart}>
      <h2>Your Shopping Cart</h2>
      <ul>
        {cartItems.map((item) => (
        <CartItem
        
        key={item.id}
        item={{ 
          id: item.id,
          title: item.title, 
          quantity: item.quantity, 
          total: item.totalPrice, 
          price: item.price 
        }}
        />
      ))}
      </ul>
    </Card>
  );
};

export default Cart;
```
* `src/components/Cart/CartButton.js`:
```
import { useDispatch, useSelector } from 'react-redux';

import {uiActions} from '../../store/ui-slice';
import classes from './CartButton.module.css';

const CartButton = (props) => {
  const dispatch = useDispatch();
  const cartQuantity = useSelector((state) => state.cart.totalQuantity);

  const toggleCartHandler = () => {
    dispatch(uiActions.toggle())
  };

  return (
    <button className={classes.button} onClick={toggleCartHandler}>
      <span>My Cart</span>
      <span className={classes.badge}>{cartQuantity}</span>
    </button>
  );
};

export default CartButton;import { useDispatch, useSelector } from 'react-redux';

import {uiActions} from '../../store/ui-slice';
import classes from './CartButton.module.css';

const CartButton = (props) => {
  const dispatch = useDispatch();
  const cartQuantity = useSelector((state) => state.cart.totalQuantity);

  const toggleCartHandler = () => {
    dispatch(uiActions.toggle())
  };

  return (
    <button className={classes.button} onClick={toggleCartHandler}>
      <span>My Cart</span>
      <span className={classes.badge}>{cartQuantity}</span>
    </button>
  );
};

export default CartButton;
```
* `src/components/Cart/CartItem.js`:
```
import {useDispatch} from 'react-redux';

import classes from './CartItem.module.css';
import {cartActions} from '../../store/cart-slice'

const CartItem = (props) => {
  const dispatch = useDispatch();
  
  const { title, quantity, total, price, id } = props.item;

  const removeItemHandler = () => {
    dispatch(cartActions.removeItemFromCart(id))
  }

  const addItemHandler = () => {
    dispatch(cartActions.addItemToCart({
      id,
      title,
      price,
    }));
  }

  return (
    <li className={classes.item}>
      <header>
        <h3>{title}</h3>
        <div className={classes.price}>
          ${total.toFixed(2)}{' '}
          <span className={classes.itemprice}>(${price.toFixed(2)}/item)</span>
        </div>
      </header>
      <div className={classes.details}>
        <div className={classes.quantity}>
          x <span>{quantity}</span>
        </div>
        <div className={classes.actions}>
          <button onClick={removeItemHandler}>-</button>
          <button onClick={addItemHandler}>+</button>
        </div>
      </div>
    </li>
  );
};

export default CartItem;
```
* `src/components/Shop/ProductItem.js`:
```
import { useDispatch } from 'react-redux';

import { cartActions } from '../../store/cart-slice';
import Card from '../UI/Card';
import classes from './ProductItem.module.css';

const ProductItem = (props) => {
  const dispatch = useDispatch();
  
  const { title, price, description, id } = props;

  const addToCartHandler = () => {
    dispatch(cartActions.addItemToCart({
      id,
      title,
      price
    }));
  }
  
  return (
    <li className={classes.item}>
      <Card>
        <header>
          <h3>{title}</h3>
          <div className={classes.price}>${price.toFixed(2)}</div>
        </header>
        <p>{description}</p>
        <div className={classes.actions}>
          <button onClick={addToCartHandler}>Add to Cart</button>
        </div>
      </Card>
    </li>
  );
};

export default ProductItem;
```
* `src/components/Shop/Products.js`:
```
import ProductItem from './ProductItem';
import classes from './Products.module.css';

const DUMMY_PRODUCTS = [
  {
    id: 'p1', 
    price: 6, 
    title: 'My First Book', 
    description: 'The first book'
  },
  {
    id: 'p2', 
    price: 5, 
    title: 'My Second Book', 
    description: 'The second book'
  }
]

const Products = (props) => {
  return (
    <section className={classes.products}>
      <h2>Buy your favorite products</h2>
      <ul>
        {DUMMY_PRODUCTS.map((product) => (
        <ProductItem
        key={product.id}  
        id={product.id} 
        title={product.title}  
          price={product.price}  
          description={product.description}
        />
      ))}
      </ul>
    </section>
  );
};

export default Products;
```
* `src/components/UI/Notification.js`:
```
import classes from './Notification.module.css';

const Notification = (props) => {
  let specialClasses = '';

  if (props.status === 'error') {
    specialClasses = classes.error;
  }
  if (props.status === 'success') {
    specialClasses = classes.success;
  }

  const cssClasses = `${classes.notification} ${specialClasses}`;

  return (
    <section className={cssClasses}>
      <h2>{props.title}</h2>
      <p>{props.message}</p>
    </section>
  );
};

export default Notification;
```
* `src/components/UI/Notification.module.css`:
```
.notification {
    width: 100%;
    height: 3rem;
    background-color: #1a8ed1;
    display: flex;
    justify-content: space-between;
    padding: 0.5rem 10%;
    align-items: center;
    color: white;
  }
  
  .notification h2,
  .notification p {
    font-size: 1rem;
    margin: 0;
  }
  
  .error {
    background-color: #690000;
  }
  
  .success {
    background-color: #1ad1b9;
  }
```
* `src/store/cart-actions.js`:
```
import { uiActions } from './ui-slice';
import { cartActions } from './cart-slice';

export const fetchCartData = () => {
    return async (dispatch) => {
        const fetchData = async () => {
            const response = await fetch(
                'https://example.com/cart.json'
            );
            if (!response.ok) {
                throw new Error('Could not fetch cart data.');
            }
            const data = await response.json();

            return data;
        };

        try {
            const cartData = await fetchData();
            dispatch(cartActions.replaceCart({
                items: cartData.items || [],
                totalQuantity: cartData.totalQuantity
            }));
        } catch (error) {
            dispatch(
                uiActions.showNotification({
                    status: 'error',
                    title: 'Error',
                    message: 'Fetching cart data failed.',
                })
            )
        }

    }
};

export const sendCartData = (cart) => {
    return async (dispatch) => {
        dispatch(
            uiActions.showNotification({
                status: 'pending',
                title: 'Sending...',
                message: 'Sending cart data...',
            })
        );

        const sendRequest = async () => {
            const response = await fetch(
                'https://example.com/cart.json',
                {
                    method: 'PUT',
                    body: JSON.stringify({
                        items: cart.items,
                        totalQuantity: cart.totalQuantity
                    }),
                }
            );

            if (!response.ok) {
                throw new Error('Sending cart data failed.');
            }
        };
        try {
            await sendRequest();
            dispatch(
                uiActions.showNotification({
                    status: 'success',
                    title: 'Success',
                    message: 'Sent cart data successfully.',
                })
            )
        } catch (error) {
            dispatch(
                uiActions.showNotification({
                    status: 'error',
                    title: 'Error',
                    message: 'Sending cart data failed.',
                })
            )
        }
    };
};
```
* `src/store/cart-slice.js`:
```
import { createSlice } from '@reduxjs/toolkit'

const initialCartState = {
    items: [],
    totalQuantity: 0,
    changed: false
}

const cartSlice = createSlice({
    name: 'cart',
    initialState: initialCartState,
    reducers: {
        addItemToCart(state, action) {
            const newItem = action.payload;
            const existingItem = state.items.find(item => item.id === newItem.id);
            state.totalQuantity++;
            state.changed = true;
            if (!existingItem) {
                state.items.push({
                    id: newItem.id,
                    price: newItem.price,
                    quantity: 1,
                    totalPrice: newItem.price,
                    title: newItem.title
                });
            } else {
                existingItem.quantity++;
                existingItem.totalPrice = existingItem.totalPrice + newItem.price;
            }
        },
        removeItemFromCart(state, action) {
            const id = action.payload;
            const existingItem = state.items.find(item => item.id === id);
            state.totalQuantity--;
            if (existingItem.quantity === 1) {
                state.items = state.items.filter(item => item.id !== id);
            } else {
                existingItem.quantity--;
                existingItem.totalPrice = existingItem.totalPrice = existingItem.price;
            }
        }
    }
});

export const cartActions = cartSlice.actions;

export default cartSlice;
```
* `src/store/index.js`:
```
import { configureStore } from '@reduxjs/toolkit'
import uiSlice from './ui-slice'
import cartSlice from './cart-slice'

//Store:
const store = configureStore({
  reducer: {ui: uiSlice.reducer, cart: cartSlice.reducer}
});

export default store;
```
* `src/store/ui-slice.js`:
```
import { createSlice } from '@reduxjs/toolkit'

const initialUiState = {
    cartIsVisible: false,
    notification: null,
}

const uiSlice = createSlice({
    name: 'ui',
    initialState: initialUiState,
    reducers: {
        toggle(state){
            state.cartIsVisible = !state.cartIsVisible;
        },
        showNotification(state, action){
            state.notification = {
                status: action.payload.status, 
                title: action.payload.title, 
                message: action.payload.message }
        }
    } 
});

export const uiActions = uiSlice.actions;

export default uiSlice;
```