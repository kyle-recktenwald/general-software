# Security Overview:

### Overview:

### OAuth 2.0:
* **OAuth 2.0** is an **open standard** for **access delegation**, commonly used as a **framework for authorization**
* It allows **users** to **grant limited access to their resources on one site to another site without sharing their 
  credentials**
* OAuth 2.0 is widely adopted by many organizations and companies for **securing APIs** and allowing **controlled access 
  to resources**
* **Key Concepts of OAuth 2.0:**
  * **Roles:**
    * **Resource Owner:**
      * The **user** who **owns the data being accessed**
    * **Client:**
      * The **application seeking access** to the **user's data**
    * **Resource Server:**
      * The **server** hosting the protected resources (data)
    * **Authorization Server:**
      * **Handles authentication and authorization** of the **client's access** to the **resource owner's data**
  * **Authorization Grant Types:**
    * **Authorization Code:**
      * Used by **web and mobile apps**, involves **exchanging an authorization code for an access token**
    * **Implicit:**
      * **Simplified flow** typically used by **browser-based applications**
    * **Client Credentials:**
      * **Direct exchange** of **client credentials** (such as **API key**) **for an access token**
    * **Resource Owner Password Credentials:**
      * **Resource owner's username and password** **exchanged** for an **access token**
  * **Tokens:**
    * **Access Token:**
      * Represents the **authorization granted** to **access specific resources**
      * It's **sent with each request** to **access protected resources**
    * **Refresh Token:**
      * **Optionally issued** to allow the client to **obtain a new access token without requiring the user to 
        reauthenticate**
    * **ID Token:**
      * In **OpenID Connect** (**built on top of OAuth 2.0**), this token **contains identity information** about the 
        **authenticated user**
  * **Workflow:**
    * A **client requests authorization** from the **resource owner** through the **authorization server**
    * **Upon approval**, the **authorization server** provides the **client** with an **access token**
    * The **client** presents the **access token** to the **resource server** to **access the protected resources**
    * The **resource server validates the token** and **grants or denies access** to the **requested resources**
* OAuth 2.0 is **versatile** and **widely used** in various scenarios, from **securing APIs and mobile applications** to 
  **granting access to third-party services** using protocols like **OAuth 2.0 with OpenID Connect** for 
  **authentication and authorization combined**

### Scope in OAuth 2.0:
* In OAuth 2.0, a "scope" is a parameter used to define the specific permissions and access rights requested by a 
  client application when it seeks authorization to access protected resources on behalf of a user
* Scopes in OAuth 2.0:
  * Request for Access:
    * When a client application initiates the authorization process, it includes a list of requested scopes indicating 
      the level of access it needs to specific resources or actions
    * Scopes are typically specified as space-separated strings, indicating different levels or types of access
  * **Examples of Scopes:**
    * `profile`:
      * Access to basic profile information of the user
    * `email`:
      * Permission to access the user's email address
    * `read` or `write`:
      * Read or write access to specific resources or APIs
    * **Custom scopes:**
      * Applications can define and request custom scopes relevant to their functionalities
  * **Authorization Process:**
    * The user is presented with the requested scopes during the authorization prompt, where they grant or deny access 
      to these scopes
    * After the user grants authorization, the issued access token will contain the approved scopes, indicating the 
      level of access the client application has been granted
  * **Scope Limitations:**
    * OAuth 2.0 allows the authorization server to enforce limitations on the scopes a client application can request 
      based on its configuration and the user's consent
    * Users can approve or deny specific scopes requested by the client application, providing granularity in access 
      control
  * Scopes play a crucial role in the OAuth 2.0 authorization flow by allowing clients to request access to specific 
    resources or actions and enabling users to control and grant appropriate permissions
  * They help define the boundaries of access and enhance the security of APIs and resources by ensuring that only 
    authorized and necessary access levels are granted

### Claims in OAuth 2.0:
* A "claim" refers to a piece of information asserted about a subject
* Claims are statements made about the user or the entity associated with the token
* They can contain information such as user ID, roles, permissions, email, or any custom information relevant to the
  application's context
* Claims are essential components of tokens (like JWTs) generated during the OAuth 2.0 flow
* These claims are digitally signed by the authorization server and can be used by the resource server (or any
  consuming party) to make access control decisions, personalize user experiences, or perform various other actions
  based on the received claims
* Common types of claims found in OAuth 2.0 and JWTs include:
  * **Reserved Claims:**
    * **`iss` (Issuer):**
      * Identifies the issuer of the token
    * **`sub` (Subject):**
      * Represents the subject of the token, often the user ID
    * **`aud` (Audience):**
      * Specifies the intended audience for the token
    * **`exp` (Expiration Time):**
      * Indicates the token's expiration time
    * **`iat` (Issued At):**
      * Shows the time at which the token was issued
    * **`nbf` (Not Before):**
      * Specifies the time before which the token should not be accepted for processing
  * **Custom Claims:**
    * These are additional claims that can be defined based on the application's needs
    * For instance, user-specific data like user roles, permissions, profile information, etc.
* Claims play a crucial role in ensuring the integrity, authenticity, and authorization of requests
* They help in making informed decisions regarding whether to grant access to certain resources or functionalities
  based on the information embedded within the token
* Access decisions can be made by validating these claims against predefined policies or rules established by the
  resource server

### OpenID:
* OpenID is an **open standard** and **decentralized authentication protocol** that allows users to be **authenticated 
  by websites and applications** using a **single set of login credentials**
* It enables users to use **one set of login credentials** (such as **username** and **password**) to **access multiple 
  websites or services**, **eliminating the need to create separate accounts for each**
* **Key Components of OpenID:**
  * **OpenID Provider (OP):**
    * The **service responsible** for **authenticating users** and **providing their identity information**
    * Issues an **identity token** to the user **after successful authentication**
  * **OpenID Relying Party (RP):**
    * The **website** or **application** that **allows users to authenticate using OpenID**
    * **Relies on the OpenID Provider** to **verify the user's identity**
  * **Identity Token:**
    * A **token issued by the OpenID Provider** that contains information about the user (claims) and is digitally signed
    * Contains information such as user ID, name, email, and other profile-related data
  * Claims:
    * Pieces of information about the user provided by the OpenID Provider
    * Can include standard claims (like user ID, name, email) and custom claims based on the user's profile
  * OpenID enables Single Sign-On (SSO) functionality, allowing users to log in to multiple websites and services using 
    their OpenID credentials
  * It provides a standardized and secure way to authenticate users across different domains without sharing passwords 
    between sites
  * OpenID Connect (OIDC) is an identity layer built on top of OAuth 2.0 and provides additional features like 
    authentication, userinfo endpoint, and standardization of identity tokens
  * OIDC specifies how to obtain identity information in a standardized format, enhancing security and interoperability 
    compared to the original OpenID protocol
  * In summary, OpenID is a user-centric identity framework that allows users to authenticate across multiple websites 
    and services using a single set of credentials, enhancing convenience and security while reducing the need for 
    multiple usernames and passwords

### Auth 0:
* **Auth0** is a popular **identity and access management (IAM) platform** that provides **authentication**, 
  **authorization**, and **other identity-related services** for web, mobile, and legacy applications
* It's a **comprehensive solution** that allows developers to implement secure and seamless **user authentication and 
  authorization** without having to build these functionalities from scratch
* Key components and features of Auth0 include:
  * **Authentication:**
    * Auth0 supports various authentication methods such as username/password, social logins (e.g., Google, Facebook, 
      Twitter), multi-factor authentication (MFA), and passwordless authentication
    * It provides a unified authentication experience across multiple platforms and devices
  * **Authorization:**
    * Offers fine-grained access control with role-based access and attribute-based access control
    * Manages user permissions and access policies for different resources and APIs
  * **User Management:**
    * Allows for user registration, profile management, password management, and user metadata storage
    * Provides user lifecycle management features
  * **Extensibility:**
    * Auth0 allows developers to extend its functionalities using custom scripts (rules) and integrations with other 
      services
    * Supports custom workflows and rules to tailor authentication and authorization processes
  * **Identity Providers Integration:**
    * Integrates with various identity providers like Active Directory, LDAP, OAuth, and SAML for seamless user 
      authentication
  * **Single Sign-On (SSO):**
    * Enables users to access multiple applications with a single set of login credentials
  * **Security:**
    * Provides security features such as anomaly detection, brute force protection, and threat intelligence to protect 
      against common security threats
  * **APIs and SDKs:**
    * Offers APIs and SDKs for different programming languages and platforms to easily integrate Auth0 into applications
* Auth0 is designed to simplify identity management for developers, enabling them to focus on building core 
  functionalities of their applications without worrying extensively about authentication and authorization 
  complexities
* It's widely used by companies of varying sizes and industries to secure their applications and APIs while 
  providing a seamless user experience

### JSON Web Token:
* JSON Web Token (JWT) is a type of token commonly used in authentication and authorization protocols, including 
  OAuth 2.0.
* A JWT Access Token is a specific type of token that securely transmits information between two parties as a JSON 
  object
* It consists of three encoded parts separated by dots: the header, payload, and signature
  * **Header:**
    * Contains metadata about the type of token and the signing algorithm used (e.g., HMAC SHA256 or RSA)
    * Typically looks like: { "alg": "HS256", "typ": "JWT" }
  * **Payload:**
    * Contains the claims or statements about the user or entity (subject), including user ID, expiration time, issuer, 
      audience, and any custom claims
    * Example: { "sub": "1234567890", "name": "John Doe", "exp": 1637058800 }
  * **Signature:**
    * Created by encoding the header and payload with a secret key or a private key (in asymmetric encryption) using 
      the specified algorithm
    * Ensures the token's integrity and authenticity
    * If the token is tampered with, the signature will no longer be valid
* JWT Access Tokens are used in OAuth 2.0 to represent the authorization granted to a client application to access 
  protected resources on behalf of a user
* When a **user** successfully **authenticates and authorizes a client application**, the **authorization server issues 
  a JWT Access Token**
* Key characteristics of JWT Access Tokens:
  * **Statelessness:**
    * Since the token contains all necessary information within itself, servers don't need to store token 
      state
    * This simplifies scalability in distributed systems
  * **Self-Contained:**
    * All required information is embedded in the token itself, reducing the need to query a database or make 
      additional calls to the authorization server during token validation
  * **Cryptographically Signed:**
    * The signature ensures that the token hasn't been tampered with or altered
    * During API requests, the client includes the JWT Access Token in the Authorization header of the HTTP request 
      to access protected resources
    * The resource server validates the token's signature, checks its expiration, and verifies the claims to 
      authorize or deny access to the requested resources