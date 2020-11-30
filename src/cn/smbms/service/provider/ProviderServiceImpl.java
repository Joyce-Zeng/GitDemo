package cn.smbms.service.provider;

import cn.smbms.dao.provider.ProviderMapper;
import cn.smbms.pojo.Provider;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description
 * @Author Joyce
 * @Date 2020/11/16  16:28
 * @Version 1.0
 */
public class ProviderServiceImpl implements ProviderService{
    private ProviderMapper providerMapper;


    @Override
    public List<Provider> findProviderWithConditions(Provider provider) {
        try {
            return providerMapper.getProviderList();
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public ProviderMapper getProviderMapper() {
        return providerMapper;
    }

    public void setProviderMapper(ProviderMapper providerMapper) {
        this.providerMapper = providerMapper;
    }
}
