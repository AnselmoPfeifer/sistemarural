package br.com.sistemarural.estado;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.sistemarural.model.entidade.Estado;

public class ListaTodosEstados {
	public static void main(String[] args) {
		
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
	EntityManager em = emf.createEntityManager();
	
	List<Estado> estados = em.createQuery("from Estado", Estado.class).getResultList();
	
	for (Estado estado: estados) {
		System.out.println(estado.getCodigo() + " " + estado.getSigla() + " " + estado.getNomeCompleto() );
		
	}
	}
}
