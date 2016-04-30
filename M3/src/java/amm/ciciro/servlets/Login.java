/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.ciciro.servlets;

import amm.ciciro.classi.Compratore;
import amm.ciciro.classi.CompratoreFactory;
import amm.ciciro.classi.Venditoree;
import amm.ciciro.classi.VenditoreeFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ciro
 */
@WebServlet(name = "Login", urlPatterns = {"/login.html"})
public class Login extends HttpServlet {

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
       
            HttpSession session = request.getSession(true);

            
            //Login del compratore
            
        if(request.getParameter("Submit") != null)    
        {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            ArrayList<Compratore> compratoreList = CompratoreFactory.getInstance().getCompratoreList();
            for(Compratore c : compratoreList)
                  
            {
                    if(c.getUsername().equals(username)&&
                       c.getPassword().equals(password))
                    {
                      session.setAttribute("Utente", c);
                      response.sendRedirect("cliente.html");
                      return;
                      //Manca la servlet 
                    }
            }
        } 
        else {
            request.setAttribute("Login_Fallito", true);
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
                  
        
        // Login del venditore
        
           if(request.getParameter("Submit") != null)    
        {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            ArrayList<Venditoree> venditoreList = VenditoreeFactory.getInstance().getVenditoreList();
            for(Venditoree v : venditoreList)
                  
            {
                    if(v.getUsername().equals(username)&&
                       v.getPassword().equals(password))
                        
                    {
                      session.setAttribute("Utente", v);
                      response.sendRedirect("venditore.html");
                      return;
                       
                    }
            }
            
        } 
        
            request.getRequestDispatcher("login.jsp").forward(request, response);
        
           
        
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


