package br.com.sistemarural.estado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.sistemarural.model.entidade.Estado;

public class RemoverEstadoJPA {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		
		Estado estado = em.find(Estado.class, 30);
		em.getTransaction().begin();
		em.remove(estado);
		em.getTransaction().commit();
		
		
		System.out.println("Estado de Removido");
	}

}
