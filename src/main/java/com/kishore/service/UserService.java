package com.kishore.service;

import java.util.List;

import com.kishore.model.User;

public interface UserService {

    User save(User user);

    List<User> findAll();

    void delete(long id);
}
