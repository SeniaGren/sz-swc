package com.xm.swc.web;

import com.xm.swc.User;
import com.xm.swc.pojo.po.Userdata;
import com.xm.swc.service.interf.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class LoginAction {

    @Autowired
    private UserLogin userLogin;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String userLogin(User user) {
        List<Userdata> userdata;
        try {
            userdata = userLogin.queryUser(user.getUsername(),user.getPassword());
            if(userdata.size() !=  0 ){
                System.out.println(userdata);
               System.out.println("请求成功");
                return "index";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("请求失败");
        return "login";
    }

}
