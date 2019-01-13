package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domino.Pessoa;

public class App {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null, "Primeira Pessoa", "pes_1@mail.com");
		Pessoa p2 = new Pessoa(null, "Segunda Pessoa", "pes_2@mail.com");
		Pessoa p3 = new Pessoa(null, "Terceira Pessoa", "pes_3@mail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		
		EntityManager em = emf.createEntityManager();
		/* em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		em.getTransaction().commit();

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		*/
		
		Pessoa p = em.find(Pessoa.class, 3);
		System.out.println(p);
		
	}
}
