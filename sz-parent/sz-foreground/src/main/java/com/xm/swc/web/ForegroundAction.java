package com.xm.swc.web;
import com.xm.swc.pojo.po.Indexpage;
import com.xm.swc.pojo.po.Tbimage;
import com.xm.swc.service.IndexPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class ForegroundAction {

    @Autowired
    private IndexPageService indexPageService;


    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public List<Indexpage> selectIndexPage(HttpServletRequest request, HttpServletResponse response ) {
        List<Indexpage> indexpages = indexPageService.selectIndexPage();
//        request.setAttribute("contentList",tbimages);
        return indexpages;
    }
}
