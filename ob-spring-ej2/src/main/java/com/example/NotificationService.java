package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public NotificationService(){
        System.out.println("Estoy en NotificationService");
    }
    public String imprimirSaludo(){
        return "Esto es un saludo";
    }
}
