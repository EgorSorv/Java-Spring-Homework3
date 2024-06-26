package ru.gb.Seminar3_hometask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.Seminar3_hometask.domain.User;

@Service
public class UserService {
    @Autowired
    private NotificationService notificationService;

    // создание пользователя
    public User createUser(String name, int age, String email) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);

        // отправляем уведомление о создании нового пользователя
        notificationService.notifyUser(user);

        return user;
    }
}
