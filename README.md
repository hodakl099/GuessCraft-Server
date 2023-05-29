# GuessCraft-Server

This is the server-side component for the GuessCraft game, an engaging multiplayer word guessing game. It handles various server-side functionalities such as room creation, managing player connections, and disconnections.

Technical Stack

    Ktor
    Kotlin
    Sessions
    WebSockets
    Routing
    Content Negotiation
    Call Logging

Used Ktor Features

    -Sessions: Used to handle session management. Cookie-based sessions are implemented in this server.
    -Interception: This server intercepts every call to check if the session exists or not. If not, a new session is created with the given client_id.
    -WebSockets: The server uses the WebSocket protocol for real-time bidirectional communication between the server and clients.
    -Routing: Defines endpoints for creating and joining rooms and also for handling WebSocket connections for the game.
    -Content Negotiation: The server uses Gson to convert Kotlin objects to JSON and vice versa.
    -Call Logging: Logs all HTTP requests and responses, providing useful debugging information.

## Installation

To clone and run this application, you'll need [Git](https://git-scm.com) and [Android Studio](https://developer.android.com/studio) installed on your computer. From your command line:

```bash
# Clone this repository
$ git clone https://github.com/hodakl099/GuessCraft-Server.git

# Install dependencies
$ ./gradlew build

# Clone client-side android application
$ git clone https://github.com/hodakl099/GuessCraft.git


# Run the server and client on the same IP and port
$ git clone https://github.com/hodakl099/GuessCraft.git

# GuessCraft - Server and Client Communication Setup Guide

In order to have both the GuessCraft Server and Android application communicate with each other, they need to be configured to use the same port number. Additionally, the specific IP address used will depend on whether you're using an Android emulator or a physical Android device.
# Server Setup

The Ktor server typically runs on localhost and a specified port. In your application.conf file (or wherever you have your Ktor server set up), make sure the port is set to 8001.

Here's an example of what the application.conf file may look like:
```
ktor {
    deployment {
        port = 8001
        port = ${?PORT}
    }
    application {
        modules = [ com.mahmoud.ApplicationKt.module ]
    }
}
```

In this file, the server is configured to run on port `8001`.

# Android Application Setup

Your Android application needs to be set up to communicate with the server. This involves setting the correct IP address and port number.

If you're running your app on an Android emulator, the IP address 10.0.2.2 is used to access your machine's local loopback interface. Therefore, your base URLs will look like this:

kotlin
```
const val HTTP_BASE_URL_LOCALHOST = "http://10.0.2.2:8001/"
const val WS_BASE_URL_LOCALHOST = "ws://10.0.2.2:8001/ws/draw"
```

Note: For WebSocket connections, the scheme should be either ws:// for unsecured or wss:// for secured connections.

If you're running the app on a physical Android device that's connected to the same local network as your server, you should use your machine's local network IP address. To find your local network IP address on most machines, you can run ipconfig (Windows) or ifconfig (Mac/Linux) in a terminal/command prompt, and look for the IPv4 Address.

Once you have your local network IP address, you can replace 10.0.2.2 in the above URLs with that address. Here's an example:

kotlin
```
const val HTTP_BASE_URL = "http://192.168.1.5:8001/"
const val WS_BASE_URL = "ws://192.168.1.5:8001/ws/draw"
```

Final Note

This setup ensures that both your server and your Android application are communicating on the same port, and that they can find each other on the network. Be aware that the specific IP address and port you use can depend on your network setup.


