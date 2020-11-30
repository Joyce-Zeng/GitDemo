package cn.smbms.test;

import cn.smbms.dao.provider.ProviderMapper;
import cn.smbms.dao.user.UserMapper;
import cn.smbms.pojo.Provider;
import cn.smbms.pojo.User;
import cn.smbms.service.provider.ProviderService;
import cn.smbms.service.provider.ProviderServiceImpl;
import cn.smbms.service.user.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author Joyce
 * @Date 2020/11/16  16:08
 * @Version 1.0
 */
public class ProviderTest {
    private Logger logger = Logger.getLogger(ProviderTest.class);
    /**
     * 练习1：实现供应商表的查询操作
     * 需求说明
     * 在超市订单系统中实现供应商表的查询操作
     * 根据整合步骤实现Spring和MyBatis的整合
     * 查询出全部供应商数据
     * 直接注入SqlSessionTemplate实现
     */
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProviderMapper providerMapper = (ProviderMapper) ac.getBean("providerMapper");
        List<Provider> providerList=providerMapper.getProviderList();
        for (Provider provider:providerList){
            System.out.println("供应商名称："+provider.getProName()+"------"+"供应商电话"+provider.getProPhone());
        }
    }
    /**练习2：根据名称查询供应商信息
     *需求说明
     * 在上一练习基础上增加按照供应商名称模糊查询供应商信息的功能
     * 要求：直接注入SqlSessionTemplate实现
     */
    @Test
    public void test02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        ProviderService providerService = (ProviderServiceImpl) ac.getBean("providerService");
        List<Provider> providerList=new ArrayList<Provider>();
        Provider proCondition = new Provider();
        proCondition.setProName("贸");
        proCondition.setProCode("ZJ_GYS002");
        providerList = providerService.findProviderWithConditions(proCondition);

        for (Provider providerResult : providerList) {
            logger.debug("ProviderTest 供应商名称:"+providerResult.getProName()+"供应商描述:"+providerResult.getProDesc()
                    +"供应商编码："+providerResult.getProCode()+"供应商地址:"+providerResult.getProAddress());
        }
    }
    /**
     *
     */
 }


