package ru.gubernik.messager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.gubernik.messager.controller.model.UserData;
import ru.gubernik.messager.service.UserService;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public void addUser(@RequestBody UserData userData) { //Важно добавлять аннотацию RequestBody
        userService.addUser(userData);
    }

    @GetMapping("/user/list")
    public List<UserData> getUserList() {
        return userService.getList();
    }
}
