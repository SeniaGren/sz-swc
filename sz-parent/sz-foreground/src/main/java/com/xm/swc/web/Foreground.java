package com.xm.swc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: DHC
 * Date: 2018/4/24
 * Time: 15:23
 * Version:V1.0
 */
@Controller
public class Foreground {



    //已经在spring-mvc.xml中配置过pages,因此请求不需要加入pages
//    @RequestMapping(value = "/{pageName}", method = RequestMethod.GET)
//    public String forwardOne(@PathVariable String pageName) {
//        return  pageName;
//    }

    @RequestMapping(value = "/{pageName1}/{pageName2}", method = RequestMethod.GET)
    public String forwardTwo(@PathVariable String pageName1, @PathVariable String pageName2) {
        return pageName1 + "/" + pageName2;
    }
}
