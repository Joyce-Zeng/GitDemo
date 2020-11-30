package cn.smbms.service.user;

import java.util.List;
import cn.smbms.dao.user.UserMapper;
import cn.smbms.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
//@Service
public class UserServiceImpl implements UserService {
    /*@Autowired *///或@Resource
    private UserMapper userMapper;

    @Transactional(propagation = Propagation.SUPPORTS,rollbackForClassName="Exception")
    @Override
    public List<User> findUsersWithConditions(User user) {
        try {
            return userMapper.getUserList(user);
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw e;
        }
    }
    @Transactional(propagation = Propagation.SUPPORTS,rollbackForClassName="Exception")
    @Override
    public boolean addNewUser(User user) {
        boolean result = false;
        try {
            if (userMapper.add(user) == 1)
                result = true;
            // int i = 1 / 0;
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw e;
        }
        return result;
    }


//    public UserMapper getUserMapper() {
//        return userMapper;
//    }
//
//    public void setUserMapper(UserMapper userMapper) {
//        this.userMapper = userMapper;
//    }

}
