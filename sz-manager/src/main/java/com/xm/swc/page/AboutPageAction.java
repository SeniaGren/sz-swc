package com.xm.swc.page;

import com.alibaba.fastjson.JSONObject;
import com.xm.swc.pojo.dto.MessageResult;
import com.xm.swc.pojo.po.Aboutpage;
import com.xm.swc.service.interf.AboutPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/about")
public class AboutPageAction {
    @Autowired
    private AboutPage aboutPage;
    //增
    @ResponseBody
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insertAboutPage(String about){
        System.out.println(about);
        String aboutId = JSONObject.parseObject(about).getString("aboutid");
        String aboutName = JSONObject.parseObject(about).getString("aboutname");
        String aboutContent = JSONObject.parseObject(about).getString("aboutcontent");
        return aboutPage.insertAboutPage(aboutId,aboutName,aboutContent);
    }
    // 删
    @ResponseBody
    @RequestMapping(value = "/delect", method = RequestMethod.POST)
    public int delectAboutPage(String aboutId){
        return aboutPage.delectAboutPage(aboutId);
    }
    // 改
    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public int updateAboutPage(String about){
        System.out.println(about+" about页面的修改信息");
        String aboutId = JSONObject.parseObject(about).getString("aboutid");
        String aboutName = JSONObject.parseObject(about).getString("aboutname");
        String aboutContent = JSONObject.parseObject(about).getString("aboutcontent");

        return aboutPage.updateAboutPage(aboutId,aboutName,aboutContent);
//        return 2;
    }
    // 查所有

    public List<Aboutpage> selectAboutPage(){
        return aboutPage.selectAboutPage();
    }

    @ResponseBody
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public MessageResult<Aboutpage> listItemsByPage() {
        MessageResult<Aboutpage> messageResult = new MessageResult<Aboutpage>();
        try {
            //code,msg,count,data
            //代码，消息，符合条件的记录数，指定页码的记录集合
            List<Aboutpage> data = aboutPage.selectAboutPage();
            //给结果集赋值
            messageResult.setCode(0);
            messageResult.setMsg("success");
            messageResult.setData(data);
        } catch (Exception e) {
//            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return messageResult;
    }
}
