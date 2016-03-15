package com.doudou.cn.test.service.impl;

import com.doudou.cn.test.dao.UserTMapper;
import com.doudou.cn.test.pojo.UserT;
import com.doudou.cn.test.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by jinliang on 16/3/11.
 */


@Service("testService")
public class TestServiceImpl implements ITestService {

    @Autowired
    private UserTMapper userTMapper;

    @Override
    public UserT getUserById(int userId) {
        return userTMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int inserUser(UserT user) {
        return userTMapper.insert(user);
    }

    @Override
    public int insertSelective(UserT record) {
        return userTMapper.insertSelective(record);
    }
}
