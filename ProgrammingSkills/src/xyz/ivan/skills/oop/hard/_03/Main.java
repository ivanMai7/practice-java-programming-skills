package xyz.ivan.skills.oop.hard._03;

import java.util.List;
import java.util.ArrayList;

/**
 * Design a multi-user chat system
 * 
 * Create a User class that includes the user's name and a method to receive messages: receive_message(message).
 * Create a ChatRoom class that includes methods:
 * - add_user(user): to add a user.
 * - send_message(sender, message): to broadcast a message to all users (except the sender).
 */

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Charlie");

        chatRoom.add_user(user1);
        chatRoom.add_user(user2);
        chatRoom.add_user(user3);

        chatRoom.send_message(user1, "Hello everyone!");
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void receive_message(String message) {
        System.out.println(name + " received: " + message);
    }

    public String getName() {
        return name;
    }
}

class ChatRoom {
    private List<User> users = new ArrayList<>();

    public void add_user(User user) {
        users.add(user);
    }

    public void send_message(User sender, String message) {
        for (User user : users) {
            if (!user.getName().equals(sender.getName())) {
                user.receive_message(message);
            }
        }
    }
}
