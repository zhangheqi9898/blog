package com.service.impl;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.entity.User;
import com.mapper.UserMapper;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper; 

	public User getUserByNameOrEmail(String str) {
		return userMapper.getUserByNameOrEmail(str);
	}
}
