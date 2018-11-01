package com.xm.swc.service;



import com.xm.swc.dao.ServicepageMapper;
import com.xm.swc.pojo.po.Servicepage;
import com.xm.swc.pojo.po.ServicepageExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicePageService {

    @Autowired
    private ServicepageMapper servicepageMapper;

    public List<Servicepage> selectIndexPage(){
//        查询模板，查询的是所有数据
        ServicepageExample example = new ServicepageExample();
        ServicepageExample.Criteria criteria = example.createCriteria();
        criteria.andServiceidIsNotNull();
        List<Servicepage> servicepages = servicepageMapper.selectByExample(example);
//        System.out.println(" service层打印");
        return servicepages;
    }
}
