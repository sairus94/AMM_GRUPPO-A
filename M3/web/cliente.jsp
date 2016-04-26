<%-- 
    Document   : cliente
    Created on : Apr 21, 2016, 7:16:33 PM
    Author     : Ciro
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
   <head>
      <link rel="stylesheet" type="text/css" href="style.css"
         media="screen">
      <title>Cliente</title>
      <meta name="keywords" content="gioco d'azzardo,donne,CiCiro,">
      <meta name="description" content="sito di E-commerce">
      <meta name="author" content="Ciro Borrelli">
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
   <body>
       <div class="page">
           <%@ include file="header.jsp"%>
               <h1>Acquista</h1>
      <%@ include file="sidebar.jsp"%>
      <div class="content">
         <div class="tb">
            <table>
               <tr>
                  <td>  
                    <img src="./img/chips.jpg" alt="sorry wait" width="210" height="210"/>
                  </td>
                  <td>
                     <h4>Set di chips</h4>
                     <p>Prezzo: 149€</p>
                     <p>Disponibilità: 7</p>
                     <a href="cliente.html"><button class="btn">Aggiungi al carrello</button></a>
                  </td>
                  <td>
                     <img src="./img/donne.jpg" alt="sorry wait" width="210" height="210"/>
                  </td>
                  <td>
                     <h4>Donna dell'est</h4>
                     <p>Prezzo: 70€ all'ora</p>
                     <p>Disponibilità: Esaurito</p>
                      <a href="cliente.html"><button class="btn">Aggiungi al carrello</button></a>
                  </td>
               </tr>
               <tr>
                  <td>
                     <a href="cliente.html"><img src="./img/cards.jpg" alt="sorry wait" width="210" height="210"/></a>
                  </td>
                  <td>
                     <h4>Mazzo di carte</h4>
                     <p>Prezzo: 99€</p>
                     <p>Disponibilità: 5</p>
                      <a href="cliente.html"><button class="btn">Aggiungi al carrello</button></a>
                  </td>
                  <td>
                     <a href="cliente.html"><img src='./img/tavolo.jpg' alt="sorry wait" width="210" height="210"/></a>
                  </td>
                  <td>
                     <h4>Tavolo da poker</h4>
                     <p>Prezzo: 299€</p>
                     <p>Disponibilità: 6</p>
                      <a href="cliente.html"><button class="btn">Aggiungi al carrello</button></a>
                  </td>
               </tr>
               <tr>
                  <td>
                     <a href="cliente.html"> <img src="./img/pistola.jpg" alt="sorry wait" width="210" height="210"/></a>
                  </td>
                  <td>
                     <h4>Pistola contro i bari</h4>
                     <p>Prezzo: 499€</p>
                     <p>Disponibilità: Esaurito</p>
                      <a href="cliente.html"><button class="btn">Aggiungi al carrello</button></a>
                  </td>
                  <td>
                     <a href="cliente.html"> <img src="./img/slot.jpg" alt="sorry wait" width="210" height="210"/></a>
                  </td>
                  <td>
                     <h4>Slot machine</h4>
                     <p>Prezzo: 999€</p>
                     <p>Disponibilità: 2</p>
                      <a href="cliente.html"><button class="btn">Aggiungi al carrello</button></a>
                  </td>
               </tr>
            </table>
         </div>
      </div>
      <%@ include file="footer.jsp"%>
       </div>
   </body>
</html>
