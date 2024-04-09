package ru.gb.Seminar3_hometask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.Seminar3_hometask.domain.User;
import ru.gb.Seminar3_hometask.repository.UserRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataProcessingService {
    @Autowired
    private UserRepository repository;

    public UserRepository getRepository() {
        return repository;
    }

    // добавления пользователя в список
    public void addUserToList(User user) {
        repository.getUsers().add(user);
    }

    // сортировка пользователей по возрасту
    public List<User> sortUsersByAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList());
    }

    // исключение пользователей младше заданного возраста из списка
    public List<User> filterUsersByAge(List<User> users, int age) {
        return users.stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }

    // средний возраст всех пользователей
    public double calculateAverageAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);
    }
}
