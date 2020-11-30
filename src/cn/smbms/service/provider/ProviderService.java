package cn.smbms.service.provider;

import cn.smbms.dao.provider.ProviderMapper;
import cn.smbms.dao.user.UserMapper;
import cn.smbms.pojo.Provider;


import java.util.List;

/**
 * @Description
 * @Author Joyce
 * @Date 2020/11/16  16:27
 * @Version 1.0
 */
public interface ProviderService {

    public List<Provider> findProviderWithConditions(Provider provider);
}
