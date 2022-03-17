package br.com.testeJpaHibernate.core.strategy.impl;

import br.com.testeJpaHibernate.core.dominio.Aluno;
import br.com.testeJpaHibernate.core.dominio.EntidadeDominio;
import br.com.testeJpaHibernate.core.strategy.IStrategy;

/**
 * Classe para validar o campo data nascimento do Aluno
 * @author Davi Machado
 * @date 16/03/2022
 */
public class ValidarDataNascimento implements IStrategy {

	@Override
	public String validar(EntidadeDominio entidade) {
		
		Aluno aluno = (Aluno) entidade;
		
		if(aluno.getDtNascimento() == null || aluno.getDtNascimento().equals("")) {
			return ("Favor insira uma Data de Nascimento.");
		}
		else {
			return null;
		}
	}

}
