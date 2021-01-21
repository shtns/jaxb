package com.sh.jaxb;

import com.sh.jaxb.test.JaxbUtil;
import com.sh.jaxb.test.ObjectFactory;
import com.sh.jaxb.test.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JaxbApplicationTests {

    @Test
    public void contextLoads() {
        ObjectFactory objectFactory = new ObjectFactory();
        User user = objectFactory.createUser();
        user.setUserId(1);
        user.setUserName("测试");
        user.setPassword("123");
        user.setMoney(1.1f);
        String s = JaxbUtil.converTomXml(user);
        System.out.println(s);
        System.out.println(JaxbUtil.converyToJavaBean(s, User.class));
    }
}
