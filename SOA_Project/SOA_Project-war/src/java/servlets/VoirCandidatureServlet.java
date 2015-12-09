/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yann
 */
public class VoirCandidatureServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String voircandidat=""
                + "<tr class=\"warning\">\n" +
"                                        <td><a href=\"Description.jsp\">Chef de projet</a></td>\n" +
"                                        <td>Altren</td>\n" +
"                                        <td>Paris</td>\n" +
"                                        <td>Bac+5</td>\n" +
"                                        <td>$1000</td>\n" +
"                                        <td>N/A</td>\n" +
"                                        <td>\n" +
"                                            <form method=\"POST\" action=\"ValiderServlet\">\n" +
"                                                <label class=\"radio-inline\">\n" +
"                                                    <input type=\"radio\" name=\"optionsRadiosInline\" id=\"optionsRadiosInline1\" value=\"option1\" checked>accepter\n" +
"                                                </label>\n" +
"                                                <label class=\"radio-inline\">\n" +
"                                                    <input type=\"radio\" name=\"optionsRadiosInline\" id=\"optionsRadiosInline2\" value=\"option2\">refuser\n" +
"                                                </label>\n" +
"                                                <label> </label>\n" +
"                                                <button type=\"submit\" class=\"btn btn-default\" >Valider</button>\n" +
"                                            </form>\n" +
"                                        </td>\n" +
"                                        \n" +
"                                    </tr>\n" +
"                                    <tr class=\"danger\">\n" +
"                                        <td><a href=\"Description.jsp\">Architecte Reseau</a></td>\n" +
"                                        <td>Orange</td>\n" +
"                                        <td>Blagnac</td>\n" +
"                                        <td>Bac+5</td>\n" +
"                                        <td>$1500</td>\n" +
"                                        <td>N/A</td>\n" +
"                                        <td>\n" +
"                                            <form method=\"POST\" action=\"ValiderServlet\">\n" +
"                                                <label class=\"radio-inline\">\n" +
"                                                    <input type=\"radio\" name=\"optionsRadiosInline\" id=\"optionsRadiosInline1\" value=\"option1\" checked>accepter\n" +
"                                                </label>\n" +
"                                                <label class=\"radio-inline\">\n" +
"                                                    <input type=\"radio\" name=\"optionsRadiosInline\" id=\"optionsRadiosInline2\" value=\"option2\">refuser\n" +
"                                                </label>\n" +
"                                                <label> </label>\n" +
"                                                <button type=\"submit\" class=\"btn btn-default\">Valider</button>\n" +
"                                            </form>\n" +
"                                        </td>\n" +
"                                    </tr>\n" +
"                                    <tr>\n" +
"                                        <td><a href=\"Description.jsp\">Ingenieur Cloud</a></td>\n" +
"                                        <td>IBM</td>\n" +
"                                        <td>Montpellier</td>\n" +
"                                        <td>Bac+5</td>\n" +
"                                        <td>$1200</td>\n" +
"                                        <td>N/A</td>\n" +
"                                        <td>\n" +
"                                            <form method=\"POST\" action=\"ValiderServlet\">\n" +
"                                                <label class=\"radio-inline\">\n" +
"                                                    <input type=\"radio\" name=\"optionsRadiosInline\" id=\"optionsRadiosInline1\" value=\"option1\" checked>accepter\n" +
"                                                </label>\n" +
"                                                <label class=\"radio-inline\">\n" +
"                                                    <input type=\"radio\" name=\"optionsRadiosInline\" id=\"optionsRadiosInline2\" value=\"option2\">refuser\n" +
"                                                </label>\n" +
"                                                <label> </label>\n" +
"                                                <button type=\"submit\" class=\"btn btn-default\">Valider</button>\n" +
"                                            </form>\n" +
"                                        </td>\n" +
"                                    </tr>";
            request.setAttribute("candidat", voircandidat); // This will be available as ${candidat}
            RequestDispatcher rd = request.getRequestDispatcher("voir-candidatures.jsp");
            rd.forward(request, response); 
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
