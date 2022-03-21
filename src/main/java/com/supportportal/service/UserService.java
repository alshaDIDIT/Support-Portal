package com.supportportal.service;

import com.supportportal.domain.AppUser;
import com.supportportal.exception.domain.EmailExistException;
import com.supportportal.exception.domain.UsernameExistException;

import java.util.List;

public interface UserService {

    AppUser register(String firstName, String lastName, String username, String email) throws EmailExistException, UsernameExistException;

    List<AppUser> getUsers();

    AppUser findUserByUsername(String username);

    AppUser findUserByEmail(String email);
}
