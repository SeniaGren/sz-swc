/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-10-22 08:44:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.pages.myself;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>添加订单-后台管理系统-Admin 1.0</title>\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <meta name=\"viewport\"\r\n");
      out.write("          content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/css/font.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/css/weadmin.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/css/treeselect.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/lib/layui/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/treeselect.js\"\r\n");
      out.write("            charset=\"utf-8\"></script>\r\n");
      out.write("    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/html5shiv/r29/html5.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"weadmin-body\">\r\n");
      out.write("    <form class=\"layui-form\" action=\"/userdata/update\">\r\n");
      out.write("        <div class=\"layui-form-item\" hidden>\r\n");
      out.write("            <label class=\"layui-form-label\">uid</label>\r\n");
      out.write("            <div class=\"layui-input-block\">\r\n");
      out.write("                <input type=\"text\" name=\"uid\" id=\"uid\"  autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <label class=\"layui-form-label\">uname</label>\r\n");
      out.write("            <div class=\"layui-input-block\">\r\n");
      out.write("                <input type=\"text\" name=\"userName\" id=\"userName\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <label class=\"layui-form-label\">upassword</label>\r\n");
      out.write("            <div class=\"layui-input-block\">\r\n");
      out.write("                <input type=\"text\" name=\"password\" id=\"password\" autocomplete=\"off\"  class=\"layui-input\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <label for=\"add\" class=\"layui-form-label\">\r\n");
      out.write("            </label>\r\n");
      out.write("            <button id=\"add\" class=\"layui-btn\" lay-filter=\"add\" lay-submit=\"\">修改</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("    layui.extend({\r\n");
      out.write("        admin: '{/}../../static/js/admin',\r\n");
      out.write("        treeselect: '{/}../../static/js/treeselect'\r\n");
      out.write("    });\r\n");
      out.write("    layui.use(['form', 'admin', 'jquery', 'table', 'layer', 'layedit', 'treeselect'], function () {\r\n");
      out.write("        var form = layui.form,\r\n");
      out.write("            admin = layui.admin,\r\n");
      out.write("            $ = layui.jquery,\r\n");
      out.write("            table = layui.table,\r\n");
      out.write("            layer = layui.layer,\r\n");
      out.write("            layedit = layui.layedit,\r\n");
      out.write("            treeselect = layui.treeselect;\r\n");
      out.write("\r\n");
      out.write("        //监听提交\r\n");
      out.write("        form.on('submit(add)', function (data) {\r\n");
      out.write("            console.log(data);\r\n");
      out.write("            var userdata = JSON.stringify(data.field);\r\n");
      out.write("            // alert();\r\n");
      out.write("            //发异步，\r\n");
      out.write("            $.post(\r\n");
      out.write("                //url:这次异步请求提交到后台给谁处理\r\n");
      out.write("                '../../userdata/update',\r\n");
      out.write("                //data:这次异步请求携带了什么数据给后台处理\r\n");
      out.write("                {'userdata':userdata},\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                //success:这次异步请求处理成功的回调函数\r\n");
      out.write("                function (data) {\r\n");
      out.write("                    if (data > 0) {\r\n");
      out.write("                        //删除后停留在原来页面\r\n");
      out.write("                        $('.layui-laypage-btn').click();\r\n");
      out.write("                        layer.msg('修改成功', {\r\n");
      out.write("                            icon: 1\r\n");
      out.write("                        });\r\n");
      out.write("\r\n");
      out.write("                    } else {\r\n");
      out.write("                        //提示用户删除失败\r\n");
      out.write("                        layer.msg('修改失败', {\r\n");
      out.write("                            icon: 2\r\n");
      out.write("                        });\r\n");
      out.write("                    }\r\n");
      out.write("                    window.parent.location.reload();\r\n");
      out.write("                    var index=parent.layer.getFrameIndex(window.name);\r\n");
      out.write("                    parent.layer.close(index);\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            );\r\n");
      out.write("            // layer.alert(\"增加成功\", {\r\n");
      out.write("            //     icon: 6\r\n");
      out.write("            // }, function () {\r\n");
      out.write("            //     // 获得frame索引\r\n");
      out.write("            //     var index = parent.layer.getFrameIndex(window.name);\r\n");
      out.write("            //     //关闭当前frame\r\n");
      out.write("            //     parent.layer.close(index);\r\n");
      out.write("            // });\r\n");
      out.write("            return false;\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
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