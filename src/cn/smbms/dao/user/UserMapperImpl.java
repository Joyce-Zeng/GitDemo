package cn.smbms.dao.user;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import cn.smbms.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserMapperImpl extends  SqlSessionDaoSupport implements UserMapper {
    private SqlSessionTemplate sqlSession;

    @Override
    public List<User> getUserList(User user) {
        return sqlSession.selectList(
                "cn.smbms.dao.user.UserMapper.getUserList", user);
    }

    @Override
    public int add(User user) {
        return 0;
    }

  /*  public SqlSessionTemplate getSqlSession() {
        return sqlSession;
    }

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }*/

}
