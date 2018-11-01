package com.xm.swc.service;



import com.xm.swc.dao.TbconnectionMapper;
import com.xm.swc.pojo.po.Tbconnection;
import com.xm.swc.pojo.po.TbconnectionExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbconnectService {

    @Autowired
    private TbconnectionMapper tbconnectionMapper;

    public List<Tbconnection> selectIndexPage(){
//        查询模板，查询的是所有数据
        TbconnectionExample example = new TbconnectionExample();
        TbconnectionExample.Criteria criteria = example.createCriteria();
        criteria.andConnectidIsNotNull();
        List<Tbconnection> tbconnections = tbconnectionMapper.selectByExample(example);
//        System.out.println(" service层打印");
        return tbconnections;
    }
}
