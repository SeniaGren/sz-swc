package com.xm.swc.service.impl;

import com.xm.swc.dao.UserdataCustmerMapper;
import com.xm.swc.dao.UserdataMapper;
import com.xm.swc.pojo.po.Userdata;
import com.xm.swc.pojo.po.UserdataExample;
import com.xm.swc.service.interf.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userLoginImpl implements UserLogin {

    @Autowired
    private UserdataCustmerMapper userMapper;
    @Override
    public List<Userdata> queryUser(String userName ,String password) {

        return userMapper.selectUser(userName,password);
    }

    @Override
    public List<Userdata> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public int insertUser(String uid, String userName, String password) {
        return userMapper.insertUser(uid,userName,password);
    }

    @Override
    public int delectUser(String uid) {
        return userMapper.delectUser(uid);
    }

    @Override
    public int updateUser(String uid, String userName, String password) {
        return userMapper.updateUser(uid,userName,password);
    }
}
