<%-- 
    Document   : ajout_quiz
    Created on : 24 juin 2016, 15:06:32
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>quiz ajouter</title>
    </head>
    <body>
        <h1>Quiz ajouté avec succès</h1>
         <form method="POST" action="ajout_quiz">
            <label for="nom">Nom de Quiz</label><input  name="nom"  type="text" width="150"><br />
            <input type="submit" value="VALIDER" />
         </form>
            
        
    </body>
</html>
