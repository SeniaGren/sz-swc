package com.xm.swc.service;



import com.xm.swc.dao.PortfoliopageMapper;
import com.xm.swc.pojo.po.Portfoliopage;
import com.xm.swc.pojo.po.PortfoliopageExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioPageService {

    @Autowired
    private PortfoliopageMapper portfoliopageMapper;

    public List<Portfoliopage> selectIndexPage(){
//        查询模板，查询的是所有数据
        PortfoliopageExample example = new PortfoliopageExample();
        PortfoliopageExample.Criteria criteria = example.createCriteria();
        criteria.andPortfolioidIsNotNull();
        List<Portfoliopage> portfoliopages = portfoliopageMapper.selectByExample(example);
//        System.out.println("这是AboutpageMapper service层打印");
        return portfoliopages;
    }
}
