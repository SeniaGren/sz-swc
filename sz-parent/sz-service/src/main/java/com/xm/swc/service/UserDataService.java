package com.xm.swc.service;



import com.xm.swc.dao.UserdataMapper;
import com.xm.swc.pojo.po.Userdata;
import com.xm.swc.pojo.po.UserdataExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDataService {

    @Autowired
    private UserdataMapper userdataMapper;

    public List<Userdata> selectIndexPage(String uname){
//        通过名字进行查找数据
        UserdataExample example = new UserdataExample();
        UserdataExample.Criteria criteria = example.createCriteria();
        criteria.andUnameEqualTo(uname);
        List<Userdata> userdata = userdataMapper.selectByExample(example);
//        System.out.println(" service层打印");
        return userdata;
    }
}
