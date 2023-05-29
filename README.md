# GuessCraft-Server

GuessCraft Server

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

Installation and Run

To clone and run this application, you'll need Git and IntelliJ IDEA or any similar IDE that supports Kotlin and Ktor. From your command line:

bash

# Clone this repository
$ git clone https://github.com/yourusername/GuessCraftServer.git

# Go into the repository
$ cd GuessCraftServer

# Build with Gradle
$ ./gradlew build

# Run the application
$ ./gradlew run
