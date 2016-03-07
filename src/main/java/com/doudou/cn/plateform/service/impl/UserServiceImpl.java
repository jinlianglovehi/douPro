package com.doudou.cn.plateform.service.impl;

import javax.annotation.Resource;

import com.doudou.cn.plateform.dao.IUserDao;
import com.doudou.cn.plateform.pojo.User;
import com.doudou.cn.plateform.service.IUserService;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
