package com.mapper;

import com.entity.User;

public interface UserMapper {
		/**
		 * 根据用户账号或邮箱登录
		 * @param str 账号或密码
		 * @return 用户信息
		 */
		User getUserByNameOrEmail(String str);
}
