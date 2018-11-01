package com.xm.swc.service.interf;

import com.xm.swc.pojo.po.Aboutpage;
import com.xm.swc.pojo.po.Userdata;

import java.util.List;

public interface UserLogin {
    List<Userdata> queryUser(String userName,String password);
    List<Userdata> selectAll();
    //增
    int insertUser(String uid,  String userName,  String password);
    // 删
    int delectUser(String uid);
    // 改
    int updateUser(String uid, String userName, String password);
    // 查所有
//    List<Userdata> selectUser();
}
