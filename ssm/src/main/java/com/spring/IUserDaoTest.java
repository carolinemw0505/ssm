package com.spring;

import com.spring.dao.IUserDao;
import com.spring.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {
    @Autowired
    IUserDao userDao;

    @Test
    public void selectUser()throws Exception{
        User user=userDao.selectUser(1l);

        System.out.println("ip:"+user.getRegIp());
    }
}
