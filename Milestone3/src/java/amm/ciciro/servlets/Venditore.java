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
import amm.ciciro.classi.Venditoree;
import amm.ciciro.classi.Oggetto;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ciro
 */
@WebServlet(name = "Venditore", urlPatterns = {"/venditore.html"})
public class Venditore extends HttpServlet {

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
        
        HttpSession session  = request.getSession();
        
        if(session != null){
         if(session.getAttribute("venditore_autenticato") != null){
             request.setAttribute("venditore",session.getAttribute("venditore_autenticato"));
               if(request.getParameter("InserisciOggetto") != null){
                   int quantità = 0;
                   String nome = request.getParameter("nomeOggetto");
                   String descrizione = request.getParameter("descrizioneOggetto");
                   double prezzo = 0;
                   String url = request.getParameter("urlOggetto");
                   if (request.getParameter("quantitàOggetto") != null){
                        quantità = Integer.parseInt(request.getParameter("quantitàOggetto"));
                   }
                    if (request.getParameter("prezzoOggetto") != null){
                        prezzo = Double.parseDouble(request.getParameter("itemPrice"));
                    }
                   if(quantità > 0 && nome != null && descrizione != null && prezzo > 0 && url != null){
                       Oggetto oggettoPostato =  new Oggetto(quantità, 100, 100, prezzo, nome, url, descrizione);
                       request.setAttribute("oggettoPostato", oggettoPostato);
                       request.setAttribute("venditore", true);
                       request.getRequestDispatcher("venditore.jsp").forward(request, response);
                   }
                  
                   else{
                        request.setAttribute("error",true);
                        request.getRequestDispatcher("venditore.jsp").forward(request, response);
                   } 
               }
                else{
                       request.getRequestDispatcher("venditore.jsp").forward(request, response);
                   }
               
           } 
         else{
             request.setAttribute("errore", true);
             request.getRequestDispatcher("venditore.jsp").forward(request, response);
         }
        
            
        }
        else{
            request.setAttribute("errore", true);
            request.getRequestDispatcher("venditore.jsp").forward(request, response);
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
