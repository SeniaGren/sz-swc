package com.xm.swc.service;



import com.xm.swc.dao.TbimageMapper;
import com.xm.swc.pojo.po.Tbimage;
import com.xm.swc.pojo.po.TbimageExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbimagesService {

    @Autowired
    private TbimageMapper tbimageMapper;

    public List<Tbimage> selectIndexPage(){
//        查询模板，查询的是所有数据
        TbimageExample example = new TbimageExample();
        TbimageExample.Criteria criteria = example.createCriteria();
        criteria.andImgidIsNotNull();
        List<Tbimage> tbimages = tbimageMapper.selectByExample(example);
//        System.out.println(" service层打印");
        return tbimages;
    }
}
