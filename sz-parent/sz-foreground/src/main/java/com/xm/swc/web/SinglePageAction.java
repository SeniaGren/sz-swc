package com.xm.swc.web;

import com.xm.swc.pojo.po.*;
import com.xm.swc.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 进行单页处理，加入从数据库查询数据到requestz中
 * 时间：2018年10月8日
 *
 */
@Controller
public class SinglePageAction {

    @Autowired
    private AboutPageService aboutPageService;

    @Autowired
    private TbconnectService tbconnectService;
    @Autowired
    private TbimagesService tbimagesService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        //1 调用业务逻辑层进行查询
        //2 存放request域中
        //3 转发到下一个页面
        List<Indexpage> indexpages = indexPageService.selectIndexPage();
        //2 存放request域中
        request.setAttribute("indexpages",indexpages);

//        通用页面角标的域名设置
        List<Tbconnection> tbconnections = tbconnectService.selectIndexPage();//这是联系方式号码
        List<Tbimage> tbimages = tbimagesService.selectIndexPage();//这是联系图片的方式
        request.setAttribute("tbimages",tbimages);
        request.setAttribute("tbconnections",tbconnections);
        return   "index";
    }

    @RequestMapping(value = "/about",method = RequestMethod.GET)
    public String aboutPage(HttpServletRequest request){
        //0 获取配置文件中的信息
        //1 调用业务逻辑层进行查询
        List<Aboutpage> aboutpages = aboutPageService.selectIndexPage();
        //2 存放request域中
        request.setAttribute("aboutpages",aboutpages);

//        通用页面角标的域名设置
        List<Tbconnection> tbconnections = tbconnectService.selectIndexPage();//这是联系方式号码
        List<Tbimage> tbimages = tbimagesService.selectIndexPage();//这是联系图片的方式
        request.setAttribute("tbimages",tbimages);
        request.setAttribute("tbconnections",tbconnections);
        //3 转发到下一个页面
        return "about";
    }

    @Autowired
    private IndexPageService indexPageService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String indexPage(HttpServletRequest request){
        //0 获取配置文件中的信息
        //1 调用业务逻辑层进行查询
        List<Indexpage> indexpages = indexPageService.selectIndexPage();
        //2 存放request域中
        request.setAttribute("indexpages",indexpages);

//        通用页面角标的域名设置
        List<Tbconnection> tbconnections = tbconnectService.selectIndexPage();//这是联系方式号码
        List<Tbimage> tbimages = tbimagesService.selectIndexPage();//这是联系图片的方式
        request.setAttribute("tbimages",tbimages);
        request.setAttribute("tbconnections",tbconnections);
        //3 转发到下一个页面
        return "index";
    }

  @RequestMapping(value = "/contact",method = RequestMethod.GET)
    public String contactPage(HttpServletRequest request){

      //        通用页面角标的域名设置
      List<Tbconnection> tbconnections = tbconnectService.selectIndexPage();//这是联系方式号码
      List<Tbimage> tbimages = tbimagesService.selectIndexPage();//这是联系图片的方式
      request.setAttribute("tbimages",tbimages);
      request.setAttribute("tbconnections",tbconnections);
      request.setAttribute("tbconn",tbconnections.get(0));
      return "contact";
  }

    @Autowired
    private PortfolioPageService portfolioPageService;
    @RequestMapping(value = "/portfolio",method = RequestMethod.GET)
    public String portfolioPage(HttpServletRequest request){
        List<Portfoliopage> portfoliopages = portfolioPageService.selectIndexPage();
        request.setAttribute("portfoliopages",portfoliopages);
        //        通用页面角标的域名设置
        List<Tbconnection> tbconnections = tbconnectService.selectIndexPage();//这是联系方式号码
        List<Tbimage> tbimages = tbimagesService.selectIndexPage();//这是联系图片的方式
        request.setAttribute("tbimages",tbimages);
        request.setAttribute("tbconnections",tbconnections);
        return "portfolio";
    }

    @Autowired
    private PricingPageService pricingPageService;

    @RequestMapping(value = "/pricing",method = RequestMethod.GET)
    public  String pricingPage(HttpServletRequest request){
        List<Pricingpage> pricingpages = pricingPageService.selectIndexPage();
        request.setAttribute("pricingpages",pricingpages);
        //        通用页面角标的域名设置
        List<Tbconnection> tbconnections = tbconnectService.selectIndexPage();//这是联系方式号码
        List<Tbimage> tbimages = tbimagesService.selectIndexPage();//这是联系图片的方式
        request.setAttribute("tbimages",tbimages);
        request.setAttribute("tbconnections",tbconnections);
        return "pricing";
    }

    @Autowired
    private ServicePageService servicePageService;

    @RequestMapping(value = "/service",method = RequestMethod.GET)
    public  String servicePage(HttpServletRequest request){
        List<Servicepage> servicepages = servicePageService.selectIndexPage();
        request.setAttribute("servicepages",servicepages);
        //        通用页面角标的域名设置
        List<Tbconnection> tbconnections = tbconnectService.selectIndexPage();//这是联系方式号码
        List<Tbimage> tbimages = tbimagesService.selectIndexPage();//这是联系图片的方式
        request.setAttribute("tbimages",tbimages);
        request.setAttribute("tbconnections",tbconnections);
        return "service";
    }

}
