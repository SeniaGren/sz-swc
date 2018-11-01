package com.xm.swc.page;

import com.alibaba.fastjson.JSONObject;
import com.xm.swc.pojo.dto.MessageResult;
import com.xm.swc.pojo.po.Indexpage;
import com.xm.swc.pojo.po.Pricingpage;
import com.xm.swc.pojo.po.Userdata;
import com.xm.swc.service.interf.Tbconnection;
import com.xm.swc.service.interf.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/userdata")
public class UserdataAction {
    @Autowired
    private UserLogin userLogin;
    //增
    @ResponseBody
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insertUser(String userdata) {
        String uid = JSONObject.parseObject(userdata).getString("uid");
        String userName = JSONObject.parseObject(userdata).getString("userName");
        String password = JSONObject.parseObject(userdata).getString("password");
        System.out.println(uid+"111"+" "+userName+"222 "+password);
        return userLogin.insertUser(uid,userName,password);
    }
    // 删
    @ResponseBody
    @RequestMapping(value = "/delect", method = RequestMethod.POST)
    public int delectUser(String uid) {
        System.out.println(uid+"32332");
        return userLogin.delectUser(uid);
    }
    // 改
    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public int updateUser(String userdata) {
//        String uid = JSONObject.parseObject(userdata).getString("uid");
//        String userName = JSONObject.parseObject(userdata).getString("uname");
//        String password = JSONObject.parseObject(userdata).getString("upassword");
        String uid = JSONObject.parseObject(userdata).getString("uid");
        String userName = JSONObject.parseObject(userdata).getString("userName");
        String password = JSONObject.parseObject(userdata).getString("password");
        System.out.println(uid+"111"+"改 "+userName+"222改 "+password);
        return userLogin.updateUser(uid,userName,password);
    }
    // 查
    @ResponseBody
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public List<Userdata> queryUser(String userName , String password) {
        return userLogin.queryUser(userName,password);
    }

    @ResponseBody
    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    public MessageResult<Userdata> selectAll() {
        MessageResult<Userdata> messageResult = new MessageResult<Userdata>();
        try {
            List<Userdata> data = userLogin.selectAll();
            //给结果集赋值
            messageResult.setCode(0);
            messageResult.setMsg("success");
            messageResult.setData(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return messageResult;
    }
}
