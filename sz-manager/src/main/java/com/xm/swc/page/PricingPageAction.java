package com.xm.swc.page;

import com.alibaba.fastjson.JSONObject;
import com.xm.swc.pojo.dto.MessageResult;
import com.xm.swc.pojo.po.Portfoliopage;
import com.xm.swc.pojo.po.Pricingpage;
import com.xm.swc.service.interf.PortfolioPage;
import com.xm.swc.service.interf.PricingPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/pricing")
public class PricingPageAction {
    @Autowired
    private PricingPage pricingPage;
    //增
    @ResponseBody
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insertPricingPage(String pricing){
//        (String pricingId, String pricingName, String pricingContent, String pricingPrice, String pricingSelect)
        System.out.println(pricing);
        String pricingId = JSONObject.parseObject(pricing).getString("pricingid");
        String pricingName = JSONObject.parseObject(pricing).getString("pricingname");
        String pricingContent = JSONObject.parseObject(pricing).getString("pricingcontent");
        String pricingPrice = JSONObject.parseObject(pricing).getString("pricingprice");
        String pricingSelect = JSONObject.parseObject(pricing).getString("pricingselect");

        return pricingPage.insertPricingPage(pricingId,pricingName,pricingContent,pricingPrice,pricingSelect);
    }
    // 删
    @ResponseBody
    @RequestMapping(value = "/delect", method = RequestMethod.POST)
    public int delectPricingPage(String pricingId) {
        return pricingPage.delectPricingPage(pricingId);
    }
    // 改
    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public int updatePricingPage(String pricing){
//        (String pricingId, String pricingName, String pricingContent, String pricingPrice, String pricingSelect)
        System.out.println(pricing);
        String pricingId = JSONObject.parseObject(pricing).getString("pricingid");
        String pricingName = JSONObject.parseObject(pricing).getString("pricingname");
        String pricingContent = JSONObject.parseObject(pricing).getString("pricingcontent");
        String pricingPrice = JSONObject.parseObject(pricing).getString("pricingprice");
        String pricingSelect = JSONObject.parseObject(pricing).getString("pricingselect");

        return pricingPage.updatePricingPage(pricingId,pricingName,pricingContent,pricingPrice,pricingSelect);
    }
//    // 查所有
//    @ResponseBody
//    @RequestMapping(value = "/select", method = RequestMethod.GET)
//    public List<Pricingpage> selectPricingPage() {
//        return pricingPage.selectPricingPage();
//    }
//

    @ResponseBody
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public MessageResult<Pricingpage> selectPricingPage() {
        MessageResult<Pricingpage> messageResult = new MessageResult<Pricingpage>();
        try {
            List<Pricingpage> data = pricingPage.selectPricingPage();
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
