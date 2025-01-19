package com.atm.service;

import java.util.List;

import com.atm.entity.User;

public interface UserService {
	
    User createUser(User user);
    
    User updateUser(Long id, User user);
    
    void deleteUser(Long id);
    
    List<User> getAllUsers();
    
    User getUserById(Long id);
}

