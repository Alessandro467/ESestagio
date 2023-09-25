package view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Documento;
import model.Vaga;

public class Programa {
	public static void main(String[] args) {
		Vaga v = new Vaga(1, "vaga estagio", "Arinaldo",10, "Estagio 2", 111,222);
				
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(v);

		em.getTransaction().commit();
		
	}
}
