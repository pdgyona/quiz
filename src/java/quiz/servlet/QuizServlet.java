/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import quiz.entites.Quiz;
import quiz.service.QuizService;

/**
 *
 * @author admin
 */
@WebServlet(name = "QuizServlet", urlPatterns = {"/ajout_quiz"})
public class QuizServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //Reccuperation de parametre
       
       String nom = req.getParameter("nom");
        
        Quiz quiz = new Quiz();
       quiz.setNom(nom);
       
       QuizService quizservice =  new QuizService();
       quizservice.ajouterQuiz(quiz);
       
       resp.sendRedirect("homepage.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.getRequestDispatcher("ajout_quiz.jsp").forward(req, resp);
    }
    
    
}
