<%-- 
    Document   : ajout_question
    Created on : 24 juin 2016, 15:48:59
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ajouter une Question</h1>
        <form method="POST" action="ajout_question">
            <label for="titre"> Titre</label><input  name="titre"  type="text" width="150"><br />
            <label for="order">Order</label><input  name="order"  type="text" width="150"><br />
            <label for="reponse1">Reponse1</label><input  name="reponse1"  type="text" width="150"><br />
            <label for="reponse2">Reponse2</label><input  name="reponse2"  type="text" width="150"><br />
            <label for="reponse3">Reponse3</label><input  name="reponse3"  type="text" width="150"><br />
            <label for="reponse4">Reponse4</label><input  name="reponse4"  type="text" width="150"><br />
            <label for="numrepCorrect">Numero de Reponse Correcte</label><input    name="numrepCorrect"  type="text" width="150"><br />
            <input type="submit" value="VALIDER" />
         </form>
    </body>
</html>
