package com.shakhawat.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shakhawat.model.User;
import com.shakhawat.repository.UserRepository;
import com.shakhawat.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public Integer getSum(int a, int b) {
		return userRepository.getSum(a,b);
	}

}
