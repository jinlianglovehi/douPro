package com.doudou.cn.plateform.service;

import com.doudou.cn.plateform.pojo.User;

public interface IUserService {
    //	查询用户
    public User getUserById(int userId);

    // 添加用户
    public int inserUser(User user);

    public int insertSelective(User record);
}
