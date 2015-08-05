package br.com.sistemarural.cidade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.sistemarural.model.entidade.Cidade;
import br.com.sistemarural.model.entidade.Estado;

public class SalvarCidade {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();

		Cidade cidade = new Cidade();
		Estado estado = em.find(Estado.class, 31);

		cidade.setNome("Campo Grande");
		cidade.setEstado(estado);

		em.getTransaction().begin();
		em.persist(cidade);
		em.getTransaction().commit();

		System.out.println("Cidade Salvo com Sucesso" + cidade.getNome() + " " + cidade.getEstado().getNomeCompleto());

		// em.close();
	}

}
