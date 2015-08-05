package br.com.sistemarural.estado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.sistemarural.model.entidade.Estado;

public class AtualizandoEstadoJPA {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		
		Estado estado = em.find(Estado.class, 31);
		em.getTransaction().begin();
		estado.setSigla("RR");
		estado.setNomeCompleto("Atualizando Nome");
		em.getTransaction().commit();
		System.out.println("Estado de Atualizado");
	}

}
