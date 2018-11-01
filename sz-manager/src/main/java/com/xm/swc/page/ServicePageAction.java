package com.xm.swc.page;

import com.alibaba.fastjson.JSONObject;
import com.xm.swc.pojo.dto.MessageResult;
import com.xm.swc.pojo.po.Pricingpage;
import com.xm.swc.pojo.po.Servicepage;
import com.xm.swc.service.interf.PricingPage;
import com.xm.swc.service.interf.ServicePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/service")
public class ServicePageAction {
    @Autowired
    private ServicePage servicePage;
    //增
    @ResponseBody
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insertServicePage(String service) {
//        (String serviceId, String serviceName, String serviceContent, String serviceIcon)
        System.out.println(service);
        String serviceId = JSONObject.parseObject(service).getString("serviceid");
        String serviceName = JSONObject.parseObject(service).getString("servicename");
        String serviceContent = JSONObject.parseObject(service).getString("servicecontent");
        String serviceIcon = JSONObject.parseObject(service).getString("serviceicon");

        return servicePage.insertServicePage(serviceId,serviceName,serviceContent,serviceIcon);
    }
    // 删
    @ResponseBody
    @RequestMapping(value = "/delect", method = RequestMethod.POST)
    public int delectServicePage(String serviceId) {
        return servicePage.delectServicePage(serviceId);
    }
    // 改
    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public int updateServicePage(String service) {
//        (String serviceId, String serviceName, String serviceContent, String serviceIcon)
        System.out.println(service);
        String serviceId = JSONObject.parseObject(service).getString("serviceid");
        String serviceName = JSONObject.parseObject(service).getString("servicename");
        String serviceContent = JSONObject.parseObject(service).getString("servicecontent");
        String serviceIcon = JSONObject.parseObject(service).getString("serviceicon");

        return servicePage.updateServicePage(serviceId,serviceName,serviceContent,serviceIcon);
    }
//    // 查所有
//    @ResponseBody
//    @RequestMapping(value = "/select", method = RequestMethod.GET)
//    public List<Servicepage> selectServicePage() {
//        return servicePage.selectServicePage();
//    }

    @ResponseBody
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public MessageResult<Servicepage> selectServicePage() {
        MessageResult<Servicepage> messageResult = new MessageResult<Servicepage>();
        try {
            List<Servicepage> data = servicePage.selectServicePage();
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
