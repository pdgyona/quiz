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
import quiz.entites.Questionnaire;
import quiz.entites.Quiz;
import quiz.service.QuestionnaireService;
import quiz.service.QuizService;

/**
 *
 * @author admin
 */
@WebServlet(name = "QuizServlet", urlPatterns = {"/ajout_question"})
public class QuestionnaireServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //Reccuperation de parametre
       
       String titre = req.getParameter("titre");
       int ordre = Integer.parseInt(req.getParameter(titre));
       String reponse1 = req.getParameter("reponse1");
       String reponse2 = req.getParameter("reponse2");
       String reponse3 = req.getParameter("reponse3");
       String reponse4 = req.getParameter("reponse");
       
       Questionnaire questionnaire =new Questionnaire(); 
        
        questionnaire.setTitre(titre);
        questionnaire.setReponse1(reponse1);
        questionnaire.setReponse2(reponse2);
        questionnaire.setReponse3(reponse3);
        questionnaire.setReponse4(reponse4);
       
        
       QuestionnaireService  questtionservice= new QuestionnaireService();
       questtionservice.ajouterQuestionnaire(questionnaire);
       
       
       
       resp.sendRedirect("homepage.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.getRequestDispatcher("ajout_question.jsp").forward(req, resp);
    }
    
    
}
