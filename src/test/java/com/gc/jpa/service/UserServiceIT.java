package com.gc.jpa.service;

import com.gc.jpa.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/META-INF/context.xml"})
public class UserServiceIT {

    @Resource
    private UserService userService;

    @Test
    public void testSave() throws Exception {

        User user = new User();
        user.setUserName("abc");
        userService.save(user);

    }
}