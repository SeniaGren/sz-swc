package com.xm.swc.page;

import com.alibaba.fastjson.JSONObject;
import com.xm.swc.pojo.dto.MessageResult;
import com.xm.swc.pojo.po.Indexpage;
import com.xm.swc.pojo.po.Pricingpage;
import com.xm.swc.pojo.po.Tbimage;
import com.xm.swc.service.interf.Tbconnection;
import com.xm.swc.service.interf.Tbimages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/tbimages")
public class TbimagesAction {
    @Autowired
    private Tbimages tbimages;
    //增
    @ResponseBody
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insertTbimage(String img) {
//        (String imgId, String imgUrl, String imgUid)
        System.out.println(img);
        String imgId = JSONObject.parseObject(img).getString("imgid");
        String imgUrl = JSONObject.parseObject(img).getString("imgurl");
        String imgUid = JSONObject.parseObject(img).getString("imguid");

        return tbimages.insertTbimage(imgId,imgUrl,imgUid);
    }
    // 删
    @ResponseBody
    @RequestMapping(value = "/delect", method = RequestMethod.POST)
    public int delectTbimage(String imgId) {
        return tbimages.delectTbimage(imgId);
    }
    // 改
    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public int updateTbimage(String img) {
//        (String imgId, String imgUrl, String imgUid)
        System.out.println(img);
        String imgId = JSONObject.parseObject(img).getString("imgid");
        String imgUrl = JSONObject.parseObject(img).getString("imgurl");
        String imgUid = JSONObject.parseObject(img).getString("imguid");

        return tbimages.updateTbimage(imgId,imgUrl,imgUid);
    }
    // 查所有
//    @ResponseBody
//    @RequestMapping(value = "/select", method = RequestMethod.GET)
//    public List<Indexpage> selectTbimage() {
//        return tbimages.selectTbimage();
//    }

    @ResponseBody
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public MessageResult<Tbimage> selectTbimage() {
        MessageResult<Tbimage> messageResult = new MessageResult<Tbimage>();
        try {
            List<Tbimage> data = tbimages.selectTbimage();
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
