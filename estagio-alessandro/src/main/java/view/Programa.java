package view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Documento;

public class Programa {
	public static void main(String[] args) {
		Documento d = new Documento(null, "pdf", "");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		EntityManager em = emf.createEntityManager();
		
		em.close();
		emf.close();
	}
}