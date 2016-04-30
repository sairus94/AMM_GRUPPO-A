/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.ciciro.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import amm.ciciro.classi.Account;
import amm.ciciro.classi.AccountFactory;
import amm.ciciro.classi.Compratore;
import amm.ciciro.classi.Oggetto;
import amm.ciciro.classi.OggettoFactory;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ciro
 */
@WebServlet(name = "Cliente", urlPatterns = {"/cliente.html"})
public class Cliente extends HttpServlet {

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
        
            HttpSession session = request.getSession();
       
            if(session != null){
                 ArrayList<Oggetto> OggettoList = OggettoFactory.getInstance().getOggettoList();
                 if(request.getParameter("Acquisto") != null){
                   int OggettoId = 0;
                   double OggettoPrezzo = 0;
                   OggettoFactory.getInstance().getoggettoById(OggettoId).getPrezzo();
                   int OggettoQuantità = 0;
                   OggettoFactory.getInstance().getoggettoById(OggettoId).getQuantità();
                   double Soldi = 0;
                   AccountFactory.getIstance().getaccountById(OggettoId).getSoldi();
                   
                   if(OggettoPrezzo < Soldi && OggettoQuantità > 0){
                       request.setAttribute("Complimenti", true);
                       request.getRequestDispatcher("cliente.jsp").forward(request, response);    
                   }
                   else {
                       request.setAttribute("Riprova", true);
                       request.getRequestDispatcher("cliente.jsp").forward(request, response);
                   }
                   
                 }
            }
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
        processRequest(request, response);
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
