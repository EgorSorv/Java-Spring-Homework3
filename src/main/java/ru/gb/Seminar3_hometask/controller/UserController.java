package ru.gb.Seminar3_hometask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.gb.Seminar3_hometask.domain.User;
import ru.gb.Seminar3_hometask.services.RegistrationService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private RegistrationService service;

    // вывод всех пользователей
    @GetMapping
    public List<User> userList() {
        return service.getDataProcessingService().getRepository().getUsers();
    }

    // добавление пользователя POST запросом
    @PostMapping("/body")
    public String userAddFromBody(@RequestBody User user) {
        service.getDataProcessingService().getRepository().getUsers().add(user);
        return "User added from body!";
    }
}
