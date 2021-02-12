package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Preguntas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <header class=\"jumbotron\" style=\"background:#FCEBDA\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row no-gutters\">\n");
      out.write("                        <div class=\"col-12 columna\">\n");
      out.write("                            <!-- \n");
      out.write("                                    mx-auto\n");
      out.write("                                    rounded\n");
      out.write("                            -->\n");
      out.write("                            <img class=\"float-left \" width=\"300\" src=\"Imagenes/logo2.png  \" alt=\"\">\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                     <h1 class=\"h4  \">Test 16PF</h1>\n");
      out.write("                    <p class=\"h6\">Por favor lea con atención las 187 preguntas de este Test y escoja una de las 3 opciones que\n");
      out.write("                        se presentan como alternativas de respuesta.\n");
      out.write("                        Seleccione A, B o C como respuesta.\n");
      out.write("                        Recuerde contestar TODAS las preguntas de manera SINCERA</p>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("        </header>      \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <form action=\"\">\n");
      out.write("                        <table class=\"table  table-success table-striped table-hover table-bordered table-responsive-lg\">\n");
      out.write("                            <tbody>\n");
      out.write("                                <!-- .table-active -->\n");
      out.write("                                <!-- .table-success -->\n");
      out.write("                                <!-- .table-warning -->\n");
      out.write("                                <!-- .table-danger -->\n");
      out.write("                                <!-- .table-info -->\n");
      out.write("                                <tr >                                                 \n");
      out.write("                                    <td>1)¿He comprendido bien las instrucciones para contestar al cuestionario? A) Sí  B) No estoy seguro C) No</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"1\" value=\"1\">\n");
      out.write("                                            A\n");
      out.write("                                        </label>\n");
      out.write("\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"1\" value=\"2\">\n");
      out.write("                                            B\n");
      out.write("                                        </label>\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"1\" value=\"3\">\n");
      out.write("                                            C\n");
      out.write("                                        </label>  \n");
      out.write("                                    </td>\n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                                <tr >                                                 \n");
      out.write("                                    <td>1)¿He comprendido bien las instrucciones para contestar al cuestionario? A) Sí  B) No estoy seguro C) No</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"2\" value=\"1\">\n");
      out.write("                                            A\n");
      out.write("                                        </label>\n");
      out.write("\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"2\" value=\"2\">\n");
      out.write("                                            B\n");
      out.write("                                        </label>\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"2\" value=\"3\">\n");
      out.write("                                            C\n");
      out.write("                                        </label>  \n");
      out.write("                                    </td>\n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                                <tr >                                                 \n");
      out.write("                                    <td>1)¿He comprendido bien las instrucciones para contestar al cuestionario? A) Sí  B) No estoy seguro C) No</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"sexo\" value=\"1\">\n");
      out.write("                                            A\n");
      out.write("                                        </label>\n");
      out.write("\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"sexo\" value=\"2\">\n");
      out.write("                                            B\n");
      out.write("                                        </label>\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"sexo\" value=\"3\">\n");
      out.write("                                            C\n");
      out.write("                                        </label>  \n");
      out.write("                                    </td>\n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                                <tr >                                                 \n");
      out.write("                                    <td>1)¿He comprendido bien las instrucciones para contestar al cuestionario? A) Sí  B) No estoy seguro C) No</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"sexo\" value=\"1\">\n");
      out.write("                                            A\n");
      out.write("                                        </label>\n");
      out.write("\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"sexo\" value=\"2\">\n");
      out.write("                                            B\n");
      out.write("                                        </label>\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"sexo\" value=\"3\">\n");
      out.write("                                            C\n");
      out.write("                                        </label>  \n");
      out.write("                                    </td>\n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                                <tr >                                                 \n");
      out.write("                                    <td>1)¿He comprendido bien las instrucciones para contestar al cuestionario? A) Sí  B) No estoy seguro C) No</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"sexo\" value=\"1\">\n");
      out.write("                                            A\n");
      out.write("                                        </label>\n");
      out.write("\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"sexo\" value=\"2\">\n");
      out.write("                                            B\n");
      out.write("                                        </label>\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"sexo\" value=\"3\">\n");
      out.write("                                            C\n");
      out.write("                                        </label>  \n");
      out.write("                                    </td>\n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                                <tr >                                                 \n");
      out.write("                                    <td>1)¿He comprendido bien las instrucciones para contestar al cuestionario? A) Sí  B) No estoy seguro C) No</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"sexo\" value=\"1\">\n");
      out.write("                                            A\n");
      out.write("                                        </label>\n");
      out.write("\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"sexo\" value=\"2\">\n");
      out.write("                                            B\n");
      out.write("                                        </label>\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"sexo\" value=\"3\">\n");
      out.write("                                            C\n");
      out.write("                                        </label>  \n");
      out.write("                                    </td>\n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js\" ></script>   \n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js\" ></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js\" ></script>\n");
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
