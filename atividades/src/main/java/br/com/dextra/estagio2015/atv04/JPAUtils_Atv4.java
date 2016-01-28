package br.com.dextra.estagio2015.atv04;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils_Atv4 {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dextragiarios");

	private static EntityManager em = JPAUtils_Atv4.getEM();
	
	public static EntityManager getEM() {
		return emf.createEntityManager();
	}

	public static Object merge(Object obj) {
		em.getTransaction().begin();
		obj = em.merge(obj);
		em.getTransaction().commit();
		//em.close();		
		return obj;
	}
}