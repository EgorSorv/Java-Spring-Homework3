package ru.gb.Seminar3_hometask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.Seminar3_hometask.domain.User;

@Service
public class RegistrationService {
    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    @Autowired
    private DataProcessingService dataProcessingService;

    public UserService getUserService() {
        return userService;
    }

    @Autowired
    private UserService userService;

    public NotificationService getNotificationService() {
        return notificationService;
    }

    @Autowired
    private NotificationService notificationService;

    // регистрация пользователя
    public User processRegistration(String name, int age, String email) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);

        notificationService.notifyUser(user);

        return user;
    }
}
