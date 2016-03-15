package com.doudou.cn.test.service;

import com.doudou.cn.plateform.pojo.User;
import com.doudou.cn.test.pojo.UserT;

/**
 * Created by jinliang on 16/3/11.
 */
public interface ITestService {

    //	查询用户
    public UserT getUserById(int userId);

    // 添加用户
    public int inserUser(UserT user);

    public int insertSelective(UserT record);


}
