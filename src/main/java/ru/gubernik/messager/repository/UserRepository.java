package ru.gubernik.messager.repository;

import org.springframework.stereotype.Component;
import ru.gubernik.messager.controller.model.UserData;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

    private final List<UserData> userList = new ArrayList<>();

    public void addUser(UserData userData) {
        userList.add(userData);
    }

    public List<UserData> getList() {
        return userList;
    }
}
