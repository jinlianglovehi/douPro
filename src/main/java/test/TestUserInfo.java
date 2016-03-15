package test;

import com.doudou.cn.test.service.ITestService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by jinliang on 16/3/11.
 * 进行单元测试的方法.
 */

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestUserInfo {

    private ApplicationContext ac = null;
    @Resource
    private ITestService userService = null;

    @Before
    public void before() {
        ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        userService = (ITestService) ac.getBean("testService");
    }

    @Test
    public void test1() {


        userService.getUserById(1);


    }
}