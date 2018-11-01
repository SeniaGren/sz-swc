package com.xm.swc.service;



import com.xm.swc.dao.IndexpageMapper;
import com.xm.swc.pojo.po.Indexpage;
import com.xm.swc.pojo.po.IndexpageExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexPageService {

    @Autowired
    private IndexpageMapper indexpageMapper;

    public List<Indexpage> selectIndexPage(){
        IndexpageExample example = new IndexpageExample();
        IndexpageExample.Criteria criteria = example.createCriteria();
        criteria.andIndexidIsNotNull();
        List<Indexpage> indexpages = indexpageMapper.selectByExample(example);
        System.out.println("这是service层打印");
        return indexpages;
    }
}
