package br.com.sistemarural.estado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.sistemarural.model.entidade.Estado;

public class BuscandoEstadoJPA {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		
		Estado estado = em.find(Estado.class, 31);
		
		if(estado!= null){
		
		System.out.println("Estado ID: " + estado.getCodigo());
		System.out.println("Estado Sigla: " + estado.getSigla());
		System.out.println("Estado Nome: " + estado.getNomeCompleto());
		}else{
			System.out.println("Estao nao encontrado!!");
		}
		System.exit(0);

		//em.close();
	}

}
