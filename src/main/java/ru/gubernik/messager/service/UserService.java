package ru.gubernik.messager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.gubernik.messager.controller.model.UserData;
import ru.gubernik.messager.repository.UserRepository;

import java.util.List;

@Component
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(UserData userData) {

        if (userData.getEmail().equals("")) {
            throw new RuntimeException();
        }
        if (userData.getLogin().equals("")) {
            throw new RuntimeException();
        }

        userRepository.addUser(userData);
    }

    public List<UserData> getList() {
        return userRepository.getList();
    }
}
