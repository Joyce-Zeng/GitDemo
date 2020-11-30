package cn.smbms.test;

import java.util.ArrayList;
import java.util.List;
import cn.smbms.dao.user.UserMapper;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.smbms.pojo.User;
import cn.smbms.service.user.UserService;

public class UserTest {

    private Logger logger = Logger.getLogger(UserTest.class);

    @Test
    public void testGetUserList() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        List<User> userList = new ArrayList<User>();
        User userCondition = new User();
        userCondition.setUserName("赵");
        userCondition.setUserRole(3);
        userList = userService.findUsersWithConditions(userCondition);

        for (User userResult : userList) {
            logger.debug("testGetUserList userCode: "
                    + userResult.getUserCode() + " and userName: "
                    + userResult.getUserName() + " and userRole: "
                    + userResult.getUserRole() + " and userRoleName: "
                    + userResult.getUserRoleName() + " and address: "
                    + userResult.getAddress());
        }
    }
    @Test
    public void testSqlSessionDaoSupport() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        List<User> userList = new ArrayList<User>();
        User userCondition = new User();
        userCondition.setUserName("赵");
        userCondition.setUserRole(3);
        userList = userService.findUsersWithConditions(userCondition);

        for (User userResult : userList) {
            logger.debug("testGetUserList userCode: "
                    + userResult.getUserCode() + " and userName: "
                    + userResult.getUserName() + " and userRole: "
                    + userResult.getUserRole() + " and userRoleName: "
                    + userResult.getUserRoleName() + " and address: "
                    + userResult.getAddress());
        }
    }
    @Test
    public void testAdd() {
        ApplicationContext ac = new ClassPathXmlApplicationContext(
                "applicationContext002.xml");
        UserService userService = (UserService) ac.getBean("userService");
        User user=new User();
        boolean result=userService.addNewUser(user);
        logger.debug("testAdd result:"+result);
    }
    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext(
                "application-mybatis-demo.xml");
        UserMapper userService = (UserMapper) ac.getBean("userMapper");
        User user=new User();
        int result=userService.add(user);
        logger.info("testAdd result:"+result);
    }
}
