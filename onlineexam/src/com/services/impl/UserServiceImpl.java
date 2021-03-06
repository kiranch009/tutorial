package com.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.User;
import com.beans.UserAddress;
import com.dao.UserDao;
import com.services.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public Integer saveUserAddress(UserAddress userAddress) {
		return userDao.saveUserAddress(userAddress);
	}

	@Override
	public UserAddress getUserAddress(Integer addressId) {
		return userDao.getUserAddress(addressId);
	}

	@Override
	public void saveUser(User user) {
		userDao.saveUser(user);

	}

	@Override
	public User getUser(String userName, String password) {
		return userDao.getUser(userName, password);
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);		
	}

}
