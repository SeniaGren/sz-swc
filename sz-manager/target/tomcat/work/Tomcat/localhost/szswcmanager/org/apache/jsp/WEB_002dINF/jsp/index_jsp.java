/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-10-22 08:43:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>后台管理-后台管理系统-Admin 1.0</title>\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0\">\r\n");
      out.write("    <meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/css/font.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/css/weadmin.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/lib/layui/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 顶部开始 -->\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"logo\">\r\n");
      out.write("        <a href=\"./index\">Admin v1.0</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"left_open\">\r\n");
      out.write("        <i title=\"展开左侧栏\" class=\"iconfont\">&#xe699;</i>\r\n");
      out.write("    </div>\r\n");
      out.write("    <ul class=\"layui-nav left fast-add\" lay-filter=\"\">\r\n");
      out.write("        <li class=\"layui-nav-item\">\r\n");
      out.write("            <a href=\"javascript:;\">+新增</a>\r\n");
      out.write("            <dl class=\"layui-nav-child\">\r\n");
      out.write("                <!-- 二级菜单 -->\r\n");
      out.write("                <dd>\r\n");
      out.write("                    <a onclick=\"WeAdminShow('资讯','http://www.baidu.com')\"><i class=\"iconfont\">&#xe6a2;</i>资讯</a>\r\n");
      out.write("                </dd>\r\n");
      out.write("                <dd>\r\n");
      out.write("                    <a onclick=\"WeAdminShow('图片','http://www.baidu.com')\"><i class=\"iconfont\">&#xe6a8;</i>图片</a>\r\n");
      out.write("                </dd>\r\n");
      out.write("                <dd>\r\n");
      out.write("                    <a onclick=\"WeAdminShow('用户','http://www.baidu.com')\"><i class=\"iconfont\">&#xe6b8;</i>用户</a>\r\n");
      out.write("                </dd>\r\n");
      out.write("            </dl>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul class=\"layui-nav right\" lay-filter=\"\">\r\n");
      out.write("        <li class=\"layui-nav-item\">\r\n");
      out.write("            <a href=\"javascript:;\">Admin</a>\r\n");
      out.write("            <dl class=\"layui-nav-child\">\r\n");
      out.write("                <!-- 二级菜单 -->\r\n");
      out.write("                <dd>\r\n");
      out.write("                    <a onclick=\"WeAdminShow('个人信息','http://www.baidu.com')\">个人信息</a>\r\n");
      out.write("                </dd>\r\n");
      out.write("                <dd>\r\n");
      out.write("                    <a onclick=\"WeAdminShow('切换帐号','./login')\">切换帐号</a>\r\n");
      out.write("                </dd>\r\n");
      out.write("                <dd>\r\n");
      out.write("                    <a class=\"loginout\" href=\"./login\">退出</a>\r\n");
      out.write("                </dd>\r\n");
      out.write("            </dl>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"layui-nav-item to-index\">\r\n");
      out.write("            <a href=\"http://localhost:83/szswc\">前台首页</a>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 顶部结束 -->\r\n");
      out.write("<!-- 中部开始 -->\r\n");
      out.write("<!-- 左侧菜单开始 -->\r\n");
      out.write("<div class=\"left-nav\">\r\n");
      out.write("    <div id=\"side-nav\">\r\n");
      out.write("\r\n");
      out.write("        <ul id=\"nav\">\r\n");
      out.write("\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"javascript:;\">\r\n");
      out.write("                    <i class=\"iconfont\">&#xe6b8;</i>\r\n");
      out.write("                    <cite>管理员账号</cite>\r\n");
      out.write("                    <i class=\"iconfont nav_right\">&#xe697;</i>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"sub-menu\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a _href=\"./pages/myself/list\">\r\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\r\n");
      out.write("                            <cite>我的信息</cite>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"javascript:;\">\r\n");
      out.write("                    <i class=\"iconfont\">&#xe6b8;</i>\r\n");
      out.write("                    <cite>页面设置</cite>\r\n");
      out.write("                    <i class=\"iconfont nav_right\">&#xe697;</i>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"sub-menu\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a _href=\"./pages/service/list\">\r\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\r\n");
      out.write("                            <cite>service页面</cite>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a _href=\"./pages/about/list\">\r\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\r\n");
      out.write("                            <cite>about页面</cite>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a _href=\"./pages/pricing/list\">\r\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\r\n");
      out.write("                            <cite>pricing页面</cite>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a _href=\"./pages/contact/list\">\r\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\r\n");
      out.write("                            <cite>contant页面</cite>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a _href=\"./pages/portfolio/list\">\r\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\r\n");
      out.write("                            <cite>portfolio页面</cite>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a _href=\"./pages/index/list\">\r\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\r\n");
      out.write("                            <cite>index页面</cite>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- <div class=\"x-slide_left\"></div> -->\r\n");
      out.write("<!-- 左侧菜单结束 -->\r\n");
      out.write("<!-- 右侧主体开始 -->\r\n");
      out.write("<div class=\"page-content\">\r\n");
      out.write("    <div class=\"layui-tab tab\" lay-filter=\"wenav_tab\" id=\"WeTabTip\" lay-allowclose=\"true\">\r\n");
      out.write("        <ul class=\"layui-tab-title\">\r\n");
      out.write("            <li>我的桌面</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"layui-tab-content\">\r\n");
      out.write("            <div class=\"layui-tab-item layui-show\">\r\n");
      out.write("                <iframe src='./pages/welcome' frameborder=\"0\" scrolling=\"yes\" class=\"weIframe\"></iframe>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"page-content-bg\"></div>\r\n");
      out.write("<!-- 右侧主体结束 -->\r\n");
      out.write("<!-- 中部结束 -->\r\n");
      out.write("<!-- 底部开始 -->\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("    <div class=\"copyright\">Copyright ©2018 Admin v1.0 All Rights Reserved</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 底部结束 -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    layui.config({\r\n");
      out.write("        base: './static/js/'\r\n");
      out.write("        ,version: '101100'\r\n");
      out.write("    }).use('admin');\r\n");
      out.write("    layui.use(['jquery','admin'], function(){\r\n");
      out.write("        var $ = layui.jquery;\r\n");
      out.write("        $(function(){\r\n");
      out.write("            var login = JSON.parse(localStorage.getItem(\"login\"));\r\n");
      out.write("            if(login){\r\n");
      out.write("                if(login=0){\r\n");
      out.write("                    window.location.href='./login';\r\n");
      out.write("                    return false;\r\n");
      out.write("                }else{\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("            }else{\r\n");
      out.write("                window.location.href='./login';\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("<!--Tab菜单右键弹出菜单-->\r\n");
      out.write("<ul class=\"rightMenu\" id=\"rightMenu\">\r\n");
      out.write("    <li data-type=\"fresh\">刷新</li>\r\n");
      out.write("    <li data-type=\"current\">关闭当前</li>\r\n");
      out.write("    <li data-type=\"other\">关闭其它</li>\r\n");
      out.write("    <li data-type=\"all\">关闭所有</li>\r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}