/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.service;

import quiz.dao.QuizDAO;
import quiz.entites.Quiz;

/**
 *
 * @author admin
 */
public class QuizService {
    
    public void ajouterQuiz(Quiz quiz){
        QuizDAO dao = new QuizDAO();
        dao.ajouterQuiz(quiz);
        
    }
    
}
