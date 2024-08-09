# React Keycloak Adapter:

### Setup:
* **Create a new App:**
```
npx create-react-app react-keycloak
```

* **Install Keycloak Javascript Adapter:**
```
npm install keycloak-js
```

* Install React Router:
```
npm install react-router-dom
```

* Create a Keycloak Configuration File:
```
import Keycloak from 'keycloak-js';

const keycloak = new Keycloak({
  url: 'https://your-keycloak-server/auth',
  realm: 'your-realm',
  clientId: 'your-client-id'
});

export default keycloak;
```


