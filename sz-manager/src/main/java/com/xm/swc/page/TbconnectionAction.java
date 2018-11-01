package com.xm.swc.page;

import com.alibaba.fastjson.JSONObject;
import com.xm.swc.pojo.dto.MessageResult;
import com.xm.swc.pojo.po.Pricingpage;
import com.xm.swc.pojo.po.Servicepage;
import com.xm.swc.service.interf.Tbconnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/tbconnection")
public class TbconnectionAction {
    @Autowired
    private Tbconnection tbconnection;
    //增
    @ResponseBody
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insertTbconnection(String connect){
//        (String connectId, String qqNumber, String wechatNumber, String weiBoNumber, String mailNumber, String telephone)
        System.out.println(connect);
        String connectId = JSONObject.parseObject(connect).getString("connectid");
        String qqNumber = JSONObject.parseObject(connect).getString("qqnumber");
        String wechatNumber = JSONObject.parseObject(connect).getString("wechatnumber");
        String weiBoNumber = JSONObject.parseObject(connect).getString("weibonumber");
        String mailNumber = JSONObject.parseObject(connect).getString("mailnumber");
        String telephone = JSONObject.parseObject(connect).getString("telephone");

        return tbconnection.insertTbconnection(connectId,qqNumber,wechatNumber,weiBoNumber,mailNumber,telephone);
    }
    // 删
    @ResponseBody
    @RequestMapping(value = "/delect", method = RequestMethod.POST)
    public int delectTbconnection(String connectId) {
        return tbconnection.delectTbconnection(connectId);
    }
    // 改
    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public int updateTbconnection(String connect){
//        (String connectId, String qqNumber, String wechatNumber, String weiBoNumber, String mailNumber, String telephone)
        System.out.println(connect);
        String connectId = JSONObject.parseObject(connect).getString("connectid");
        String qqNumber = JSONObject.parseObject(connect).getString("qqnumber");
        String wechatNumber = JSONObject.parseObject(connect).getString("wechatnumber");
        String weiBoNumber = JSONObject.parseObject(connect).getString("weibonumber");
        String mailNumber = JSONObject.parseObject(connect).getString("mailnumber");
        String telephone = JSONObject.parseObject(connect).getString("telephone");

        return tbconnection.updateTbconnection(connectId,qqNumber,wechatNumber,weiBoNumber,mailNumber,telephone);
    }
    // 查所有
//    @ResponseBody
//    @RequestMapping(value = "/select", method = RequestMethod.GET)
//    public List<Pricingpage> selectTbconnection() {
//        return tbconnection.selectTbconnection();
//    }

    @ResponseBody
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public MessageResult<com.xm.swc.pojo.po.Tbconnection> selectTbconnection() {
        MessageResult<com.xm.swc.pojo.po.Tbconnection> messageResult = new MessageResult<com.xm.swc.pojo.po.Tbconnection>();
        try {
            List<com.xm.swc.pojo.po.Tbconnection> data = tbconnection.selectTbconnection();
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
