package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.MoneyEntity;

/**
 * Session Bean implementation class moneyEJB
 */
@Stateless
@LocalBean
public class moneyEJB {

	@PersistenceContext
	private EntityManager em;
	
    public moneyEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void addNew(MoneyEntity moneyEntity) {
    	System.out.println("===============adding records to the database================");
    	em.persist(moneyEntity);
    }

}
