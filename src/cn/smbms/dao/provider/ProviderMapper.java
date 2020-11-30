package cn.smbms.dao.provider;

import cn.smbms.pojo.Provider;
import cn.smbms.pojo.User;

import java.util.List;

/**
 * @Description
 * @Author Joyce
 * @Date 2020/11/16  16:09
 * @Version 1.0
 */
public interface ProviderMapper {
    /**
     * 查询供应商列表
     * @param
     * @return
     */
    public List<Provider> getProviderList();
}
