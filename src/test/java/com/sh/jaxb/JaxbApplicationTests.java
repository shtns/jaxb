package com.sh.jaxb;

import com.sh.jaxb.javabean.*;
import com.sh.jaxb.util.JaxbUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JaxbApplicationTests {

    @Test
    public void conversionJavaBean() {

        //创建对象工厂
        ObjectFactory objectFactory = new ObjectFactory();

        //创建用户信息、并赋值
        UserInfo userInfo = objectFactory.createUserInfo();
        userInfo.setUserId(1);
        userInfo.setLoginAccount("zhangSan");
        userInfo.setPassword(123456);
        //创建地址信息、并赋值
        AddressInfo addressInfo = objectFactory.createAddressInfo();
        addressInfo.setAddressTest("addressTest");
        addressInfo.setAddressDetails("addressDetails");
        userInfo.setAddressInfo(addressInfo);

        //创建地址信息、并赋值
        RoleInfo roleInfo = objectFactory.createRoleInfo();
        roleInfo.setRoleId(1);
        roleInfo.setRoleName("管理员");
        roleInfo.setRoleNameEn("admin");

        //创建菜单信息、并赋值
        MenuInfo menuInfo = objectFactory.createMenuInfo();
        menuInfo.setMenuId(1);
        menuInfo.setMenuName("测试菜单");
        menuInfo.setMenuPath("/test");

        //创建组织信息，赋值用户、角色、菜单信息
        Organization organization = objectFactory.createOrganization();
        organization.setUserInfo(userInfo);
        organization.setRoleInfo(roleInfo);
        organization.setMenuInfo(menuInfo);

        //转为xml
        String organizationXml = JaxbUtil.conversionXml(organization);
        System.out.println("xml：".concat(organizationXml));
        System.out.println("----------------------------------------------------------");

        //转javaBean
        System.out.println("javaBean：" + JaxbUtil.conversionJavaBean(organizationXml, Organization.class));
    }
}
