package com.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        System.out.println("Estoy en UserService");
        this.notificationService = notificationService;
    }
}
