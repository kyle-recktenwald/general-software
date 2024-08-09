# React Animations:

### Flipping an Arrow with CSS:
* **CSS File:**
```
.challenge-item-details-icon {
  display: inline-block;
  font-size: 0.85rem;
  margin-left: 0.25rem;
  transition: transform 0.3s ease-out;
}

.challenge-item-details.expanded .challenge-item-details-icon {
  transform: rotate(180deg);
}
```
* **Javascript:**
```
<div className={`challenge-item-details ${isExpanded ? 'expanded' : ''}`}>
```

### Moving a Modal Up Slightly with CSS:
* **CSS File:**
```
.modal {
  top: 10%;
  border-radius: 6px;
  padding: 1.5rem;
  width: 30rem;
  max-width: 90%;
  z-index: 10;
  animation: slide-up-fade-in 0.3s ease-out forwards;
}

@keyframes slide-up-fade-in {
  0% {
    transform: translateY(30px);
    opacity: 0;
  }
  100% {
    transform: translateY(0);
    opacity: 1;
  }
}
```

### Framer Motion:

* **To Install Framer Motion:**
```
npm install framer-motion
```

### **Flipping an Arrow with Framer Motion:**
```
<div className="challenge-item-details">
  <p>
    <button onClick={onViewDetails}>
      View Details{' '}
      <motion.span animate={{rotate: isExpanded ? 180: 0}} className="challenge-item-details-icon">&#9650;</motion.span>
    </button>
  </p>

  {isExpanded && (
    <div>
      <p className="challenge-item-description">
        {challenge.description}
      </p>
    </div>
  )}
</div>
```

### Moving a Modal Up/Down on Open/Close:
* **Modal File:**
```
import { createPortal } from 'react-dom';
import {motion} from 'framer-motion';

export default function Modal({ title, children, onClose }) {
  return createPortal(
    <>
      <div className="backdrop" onClick={onClose} />
      <motion.dialog 
      initial={{opacity: 0, y: 30}}
      animate={{opacity: 1, y: 0}}
      exit={{opacity: 0, y: 30}}
      open className="modal">
        <h2>{title}</h2>
        {children}
      </motion.dialog>
    </>,
    document.getElementById('modal')
  );
}
```
* **JS File:**
```
<AnimatePresence>
        {isCreatingNewChallenge && <NewChallenge onDone={handleDone} />}
      </AnimatePresence>
```

### Making a Button Pop on Hover:
```
<header id="main-header">
    <h1>Your Challenges</h1>
        <motion.button 
            whileHover={{scale: 1.1}}
            transition={{type: 'spring', stiffness: 500}}
            onClick={handleStartAddNewChallenge} className="button">
              Add Challenge
        </motion.button>
</header>
```