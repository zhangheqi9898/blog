package com.service;

import com.entity.User;

public interface UserService {

	User getUserByNameOrEmail(String str);

}
