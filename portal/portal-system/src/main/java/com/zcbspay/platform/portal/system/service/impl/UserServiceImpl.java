package com.zcbspay.platform.portal.system.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zcbspay.platform.portal.system.api.bean.UserBean;
import com.zcbspay.platform.portal.system.api.service.UserService;
import com.zcbspay.platform.portal.system.dao.UserDao;
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public String login(UserBean userbean) {
		return userDao.login(userbean);
		
	}

	@Override
	public Map<String, Object> queryUsers(UserBean userBean, String page, String rows) {
		Map<String, Object> userList= userDao.queryUsers(userBean,page,rows);
		return userList;
	}

	@Override
	public String saveUser(UserBean userBean) {
		return userDao.saveUser(userBean);
	}

	@Override
	public String updateUser(UserBean userBean) {
		return userDao.updateUser(userBean);
	}
	
}