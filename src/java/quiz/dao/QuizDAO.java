/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import quiz.entites.Quiz;

/**
 *
 * @author admin
 */
public class QuizDAO {
    public void ajouterQuiz(Quiz quiz){
        EntityManager em = Persistence.createEntityManagerFactory("QuizPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(quiz);
        em.getTransaction().commit();
    }
    
}
