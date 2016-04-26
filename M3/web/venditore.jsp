<%-- 
    Document   : venditore
    Created on : Apr 21, 2016, 7:16:54 PM
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
      <title>Venditore</title>
      <meta name="keywords" content="gioco d'azzardo,donne,CiCiro,cerca,informazioni">
      <meta name="description" content="sito di E-commerce">
      <meta name="author" content="Ciro Borrelli">
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
   <body>
      <div class="page">
          <%@ include file="header.jsp"%>
              <h1>Vendi</h1>
          <%@ include file="sidebar.jsp"%>
      <div class="content">
         <div class="vendform">
            <form method="get">
               <div class="text-input">
                  <label for ="nomeogg"> Articolo: </label>
                  <input type="text" id="nomeogg" name="nomeogg">
               </div>
               <div class="text-input">
                  <label for ="immagine"> Immagine: </label>
                  <input type="url" id="immagine" name="immagine">
               </div>
               <div class="text-input">
                  <label for ="quantità"> Quantità:</label>
                  <input type="number" id="quantità" name="quantità" min="1" max="100" step="1">
               </div>
               <div class="text-input">
                  <label for ="prezzo"> Prezzo:</label>
                  <input type="number" id="prezzo" name="prezzo" min="0">
               </div>
               <div class="text-input">
                  <label for ="descrizione"> Descrizione: </label>            
                  <textarea id="descrizione" name="descrizione" rows="15" cols="30"></textarea>
               </div>
               <input type="submit" value="INSERISCI OGGETTO" class="btn">
            </form>
         </div>
      </div>
      <%@ include file="footer.jsp"%>
      </div>
   </body>
</html>