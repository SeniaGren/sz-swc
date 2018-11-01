package com.xm.swc.page;

import com.alibaba.fastjson.JSONObject;
import com.xm.swc.pojo.dto.MessageResult;
import com.xm.swc.pojo.po.Aboutpage;

import com.xm.swc.pojo.po.Indexpage;
import com.xm.swc.service.interf.IndexPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/index")
public class IndexPageAction {
    @Autowired
    private IndexPage indexPage;
    //增
    @ResponseBody
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insertIndexPage(String index){
//         Integer indexId, String indexName, String IndexContent
        System.out.println(index);
        Integer indexId = JSONObject.parseObject(index).getInteger("indexid");
        String indexName = JSONObject.parseObject(index).getString("indexcontent");
        String IndexContent = JSONObject.parseObject(index).getString("indexname");
        return indexPage.insertIndexPage(indexId,indexName,IndexContent);
    }
    // 删
    @ResponseBody
    @RequestMapping(value = "/delect", method = RequestMethod.POST)
    public int delectIndexPage(Integer indexId){
        return indexPage.delectIndexPage(indexId);
    }
    // 改
    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public int updateIndexPage(String index){
//         Integer indexId, String indexName, String IndexContent
        System.out.println(index);
        Integer indexId = JSONObject.parseObject(index).getInteger("indexid");
        String indexName = JSONObject.parseObject(index).getString("indexcontent");
        String IndexContent = JSONObject.parseObject(index).getString("indexname");
        return indexPage.updateIndexPage(indexId,indexName,IndexContent);
    }
//    // 查所有
//    @ResponseBody
//    @RequestMapping(value = "/select", method = RequestMethod.GET)
//    public List<Indexpage> selectIndexPage(){
//        return indexPage.selectIndexPage();
//    }


    @ResponseBody
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public MessageResult<Indexpage> selectIndexPage() {
        MessageResult<Indexpage> messageResult = new MessageResult<Indexpage>();
        try {
            List<Indexpage> data = indexPage.selectIndexPage();
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
