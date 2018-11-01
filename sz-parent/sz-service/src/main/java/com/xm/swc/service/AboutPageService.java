package com.xm.swc.service;



import com.xm.swc.dao.AboutpageMapper;
import com.xm.swc.pojo.po.Aboutpage;
import com.xm.swc.pojo.po.AboutpageExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutPageService {

    @Autowired
    private AboutpageMapper aboutpageMapper;

    public List<Aboutpage> selectIndexPage(){
//        查询模板，查询的是所有数据
        AboutpageExample example = new AboutpageExample();
        AboutpageExample.Criteria criteria = example.createCriteria();
        criteria.andAboutidIsNotNull();
        List<Aboutpage> aboutpages = aboutpageMapper.selectByExample(example);
//        System.out.println("这是AboutpageMapper service层打印");
        return aboutpages;
    }
}
