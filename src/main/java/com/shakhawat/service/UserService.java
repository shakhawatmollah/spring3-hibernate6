package com.shakhawat.service;

import java.util.List;

import com.shakhawat.model.User;

public interface UserService {

	User save(User user);

    List<User> findAll();

    Integer getSum(int a, int b);
}
