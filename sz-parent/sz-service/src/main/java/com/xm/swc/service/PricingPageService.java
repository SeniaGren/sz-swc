package com.xm.swc.service;



import com.xm.swc.dao.PricingpageMapper;
import com.xm.swc.pojo.po.Pricingpage;
import com.xm.swc.pojo.po.PricingpageExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PricingPageService {

    @Autowired
    private PricingpageMapper pricingpageMapper;

    public List<Pricingpage> selectIndexPage(){
//        查询模板，查询的是所有数据
        PricingpageExample example = new PricingpageExample();
        PricingpageExample.Criteria criteria = example.createCriteria();
        criteria.andPricingidIsNotNull();
        List<Pricingpage> pricingpages = pricingpageMapper.selectByExample(example);
//        System.out.println(" service层打印");
        return pricingpages;
    }
}
