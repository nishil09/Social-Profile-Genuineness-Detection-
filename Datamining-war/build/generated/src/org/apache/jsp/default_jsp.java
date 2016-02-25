package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class default_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"newjsp.jsp\" method=\"POST\">\n");
      out.write("        first name :- <input type=\"text\" name =\"fname\" /><br/>\n");
      out.write("        Last name :- <input type=\"text\" name =\"lname\" /><br/>\n");
      out.write("        Email :- <input type=\"text\" name =\"email\" /><br/>\n");
      out.write("\n");
      out.write("        Date Of birth :- <input type=\"text\" name =\"dob\" /> format : (dd/mm/yyyy)<br/>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("        Username :- <input type=\"text\" name =\"uname\" /><br/>\n");
      out.write("        Password :- <input type=\"text\" name =\"pass\" /><br/>\n");
      out.write("      \n");
      out.write("        street :- <input type=\"text\" name =\"street\" /><br/>\n");
      out.write("        state :- <input type=\"text\" name =\"state\" /><br/>\n");
      out.write("        Country :- <input type=\"text\" name =\"country\" /><br/>\n");
      out.write("        Interests:- <input type=\"text\" name =\"interest\" /><br/>\n");
      out.write("        School :- <input type=\"text\" name =\"school\" /><br/>\n");
      out.write("         Photos :- <input type=\"text\" name =\"photo\" /><br/>\n");
      out.write("          friends :- <input type=\"text\" name =\"friends\" /><br/>\n");
      out.write("           groups :- <input type=\"text\" name =\"groups\" /><br/>\n");
      out.write("            videos :- <input type=\"text\" name =\"videos\" /><br/>\n");
      out.write("\n");
      out.write("        <input type=\"submit\" value=\"submit\" />\n");
      out.write("        </form>\n");
      out.write("        <h1></h1>\n");
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
