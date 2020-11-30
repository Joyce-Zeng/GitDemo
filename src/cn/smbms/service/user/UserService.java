package cn.smbms.service.user;

import java.util.List;
import cn.smbms.pojo.User;

public interface UserService {
    /**
     * 根据条件找到用户
     * @param user
     * @return
     */
    public List<User> findUsersWithConditions(User user);

    /**
     * 增加时，判断用户是否存在
     * @param user
     * @return
     */
    public boolean addNewUser(User user);
}
