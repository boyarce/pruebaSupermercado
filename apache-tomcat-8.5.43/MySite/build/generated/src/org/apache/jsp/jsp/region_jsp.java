package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class region_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>REGION</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/jsp/template/header.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/jsp/template/menu.jsp", out, false);
      out.write("\n");
      out.write("        <h1 class=\"text-center\">REGION</h1>\n");
      out.write("\n");
      out.write("        <form id=\"frm-login\" action=\"\" method=\"POST\">\n");
      out.write("            <div class=\"container\" style=\"margin-top: 50px; max-width: 500px\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"form-group col-sm-12\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txt-id\" placeholder=\"ID\"\n");
      out.write("                               name=\"id\">\n");
      out.write("                    </div>                \n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"form-group col-sm-12\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txt-nombre\" placeholder=\"NOMBRE\"\n");
      out.write("                               name=\"nombre\">\n");
      out.write("                    </div>                \n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"form-group col-sm-12\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txt-descripcion\" placeholder=\"DESCRIPCION\"\n");
      out.write("                               name=\"descripcion\">\n");
      out.write("                    </div>                \n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"form-group col-sm-12\">                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group col-sm-8\">\n");
      out.write("                        <button id=\"btn-crear\" type=\"submit\" class=\"btn btn-success col-sm-12\">CREAR</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
