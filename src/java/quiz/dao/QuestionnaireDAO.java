/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import quiz.entites.Questionnaire;

/**
 *
 * @author admin
 */
public class QuestionnaireDAO {
    
    //AJOUTER QUESTIONNAIRE A LA BD
    public void ajouterQuestionnaire(Questionnaire questionnaire){
        
        EntityManager em =Persistence.createEntityManagerFactory("QuizPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(questionnaire);
        em.getTransaction().commit();
    }
    
}
