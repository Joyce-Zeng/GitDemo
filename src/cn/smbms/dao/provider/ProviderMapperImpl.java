package cn.smbms.dao.provider;

import cn.smbms.dao.user.UserMapper;
import cn.smbms.pojo.Provider;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @Description
 * @Author Joyce
 * @Date 2020/11/16  16:11
 * @Version 1.0
 */
public class ProviderMapperImpl extends SqlSessionDaoSupport implements ProviderMapper{
    private SqlSessionTemplate sqlSession;


    public SqlSessionTemplate getSqlSession() {
        return sqlSession;
    }

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<Provider> getProviderList() {
        return sqlSession.getMapper(ProviderMapper.class).getProviderList();
    }
}
