package ru.gb.Seminar3_hometask.services;

import org.springframework.stereotype.Service;
import ru.gb.Seminar3_hometask.domain.User;

@Service
public class NotificationService {
    // уведомление о создании пользователя
    public void notifyUser(User user) {
        System.out.println("A new user has been created: " + user.getName());
    }

    // отправка уведомления
    public void sendNotification(String string) {
        System.out.println();
    }
}
