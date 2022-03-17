package br.com.testeJpaHibernate.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.testeJpaHibernate.core.dominio.TesteAluno;

public class CadastroAluno {

	public static void main(String[] args) {
		TesteAluno aluno = new TesteAluno();
		aluno.setNome("momo");
		aluno.setDtNascimento("2022-03-17");
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("teste_arquivo_persistenceXML");
		
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(aluno);
		em.getTransaction().commit();
		em.close();
	}

}
