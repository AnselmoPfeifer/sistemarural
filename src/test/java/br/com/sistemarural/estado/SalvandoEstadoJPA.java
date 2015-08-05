package br.com.sistemarural.estado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.sistemarural.model.entidade.Estado;

public class SalvandoEstadoJPA {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		
		Estado estado = new Estado();
		estado.setSigla("TE");
		estado.setNomeCompleto("Teste");
		
		em.getTransaction().begin();
		em.persist(estado);
		em.getTransaction().commit();
		
		System.out.println("Estado Salvo com Sucesso");

		//em.close();
	}

}
