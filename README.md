# Real-Time Chat Application

This is a simple real-time chat application built using Spring Boot and WebSockets with SockJS and STOMP for real-time messaging. The frontend uses HTML, JavaScript, and Bootstrap for styling. This app allows users to send and receive messages in real-time.

## Features
- Real-time messaging using WebSocket and STOMP
- Simple chat interface with message input and display
- Sender name input for message customization
- Bootstrap-based UI

## Technologies Used
- **Backend**: 
  - Spring Boot
  - WebSocket (STOMP)
  - Spring Messaging
  - Spring Web
- **Frontend**:
  - HTML
  - JavaScript (with SockJS and STOMP.js)
  - Bootstrap for styling

## Installation

### Prerequisites
Ensure that you have the following installed:
- **Java 17+**
- **Maven** for building the project

### Steps to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/tarikii/app-chat-realtime-springboot
   cd app-chat-realtime-springboot
   ```
   
2. **Open the application and hit play**:
   Once the application is running, open two browsers tab and navigate to http://localhost:8080/chat. This will load the chat application in 2 different pages.

3. **Start chatting:**
   - Enter your name in the "Enter name" input field.
   - Type a message in the "Type a message" input field and click "Send Message" to send the message.
   - The messages will appear in real-time in both chats windows.

### Architecture

**WebSocket Configuration (WebSocketConfig.java)**:
  - Configures WebSocket with STOMP protocol using SockJS for fallback options.
  - Registers the /chat WebSocket endpoint.
  - Configures message broker with /topic prefix for subscription and /app for message sending.

**Controller (ChatController.java)**:
  - Handles the sending of chat messages.
  - Maps the /sendMessage endpoint to handle messages, broadcasting them to all subscribers via /topic/messages.

** Model (ChatMessage.java)**:
  - Represents a chat message with sender and content fields.
  - Uses @JsonProperty to map JSON properties to Java fields.

**Frontend (HTML/JavaScript)**:
  - The frontend contains an HTML structure with Bootstrap styling.
  - It uses SockJS and STOMP.js to establish a WebSocket connection and communicate with the backend.

### Workflow
  1. When a user sends a message, the JavaScript sendMessage function sends the message to the backend using the STOMP protocol.
  2. The message is handled by the sendMessage method in the ChatController, which broadcasts the message to all connected clients via the /topic/messages topic.
  3. The frontend listens for new messages on /topic/messages and dynamically displays them in the chat window.

### Author

Tarik Aabouch -> [https://github.com/tarikii](https://github.com/tarikii)
