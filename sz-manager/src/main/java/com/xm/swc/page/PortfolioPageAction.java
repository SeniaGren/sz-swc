package com.xm.swc.page;

import com.alibaba.fastjson.JSONObject;
import com.xm.swc.pojo.dto.MessageResult;
import com.xm.swc.pojo.po.Indexpage;
import com.xm.swc.pojo.po.Portfoliopage;
import com.xm.swc.service.interf.IndexPage;
import com.xm.swc.service.interf.PortfolioPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/portfolio")
public class PortfolioPageAction {
    @Autowired
    private PortfolioPage portfolioPage;
    //增
    @ResponseBody
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insertPortfolioPage(String profolio){
//        (String profolioId, String portfolioName, String portfolioimgs, String portfolioOccupation)
        System.out.println(profolio);

        String profolioId = JSONObject.parseObject(profolio).getString("portfolioid");
        String portfolioName = JSONObject.parseObject(profolio).getString("portfolioname");
        String portfolioimgs = JSONObject.parseObject(profolio).getString("portfolioimgs");
        String portfolioOccupation = JSONObject.parseObject(profolio).getString("portfoliooccupation");
        return portfolioPage.insertPortfolioPage(profolioId,portfolioName,portfolioimgs,portfolioOccupation);
    }
    // 删
    @ResponseBody
    @RequestMapping(value = "/delect", method = RequestMethod.POST)
    public int delectPortfolioPage(String profolioId) {
        return portfolioPage.delectPortfolioPage(profolioId);
    }
    // 改
    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public int updatePortfolioPage(String profolio){
//        (String profolioId, String portfolioName, String portfolioimgs, String portfolioOccupation)
        System.out.println(profolio);
        String profolioId = JSONObject.parseObject(profolio).getString("portfolioid");
        String portfolioName = JSONObject.parseObject(profolio).getString("portfolioname");
        String portfolioimgs = JSONObject.parseObject(profolio).getString("portfolioimgs");
        String portfolioOccupation = JSONObject.parseObject(profolio).getString("portfoliooccupation");

        return portfolioPage.updatePortfolioPage(profolioId,portfolioName,portfolioimgs,portfolioOccupation);
    }
    // 查所有
//    @ResponseBody
//    @RequestMapping(value = "/select", method = RequestMethod.GET)
//    public List<Portfoliopage> selectPortfolioPage(){
//        return portfolioPage.selectPortfolioPage();
//    }

    @ResponseBody
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public MessageResult<Portfoliopage> selectPortfolioPage() {
        MessageResult<Portfoliopage> messageResult = new MessageResult<Portfoliopage>();
        try {
            List<Portfoliopage> data = portfolioPage.selectPortfolioPage();
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
