# Jenkins Overview:

### Installing Jenkins Locally on a Mac:
* Taken from `https://www.macminivault.com/installing-jenkins-on-macos/`
* **To Install with Homebrew:**
```
brew install jenkins-lts
```
* **To Start Jenkins:**
```
brew services start jenkins-lts
```
* We want the Jenkins web interface to be accessible from anywhere (not just on the local machine), so we’re going to 
  open up the config file:
```
sudo nano /usr/local/opt/jenkins-lts/homebrew.mxcl.jenkins-lts.plist
```
* Find This Line:
```
<string>--httpListenAddress=127.0.0.1</string>
```
* Change it to:
```
<string>--httpListenAddress=0.0.0.0</string>
```
* To exit out of nano after making the change, hit Ctrl+X, hit Y to save the changes and hit Enter
* To start Jenkins and set it to run automatically when the system is rebooted:
```
brew services start jenkins-lts
```
* Go to `http://localhost:8080`
* **To Obtain the Admin Password:**
```
cat ~/.jenkins/secrets/initialAdminPassword
```
* Select `Install suggested plugins`
* Create an Admin User
* Set the URL that users will be using to log in to Jenkins
* If users will be connecting to the server remotely, it’s best to set up an A record (like jenkins.yourdomain.com) and 
set the Jenkins URL to http://jenkins.yourdomain.com:8080. Click Save and Finish:
* Locally:
```
http://localhost:8081/
```
* **To Restart Jenkins:**
```
brew services restart jenkins-lts
```
* **To Change the Jenkins Local Port:**
```
brew services stop jenkins-lts
open /usr/local/Cellar/jenkins-lts/2.440.3/homebrew.mxcl.jenkins-lts.plist
brew services start jenkins-lts
```