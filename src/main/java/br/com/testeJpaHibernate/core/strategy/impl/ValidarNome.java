package br.com.testeJpaHibernate.core.strategy.impl;

import br.com.testeJpaHibernate.core.dominio.Aluno;
import br.com.testeJpaHibernate.core.dominio.EntidadeDominio;
import br.com.testeJpaHibernate.core.strategy.IStrategy;

/**
 * Classe para validar o campo nome do Aluno
 * @author Davi Machado
 * @date 16/03/2022
 */
public class ValidarNome implements IStrategy {

	@Override
	public String validar(EntidadeDominio entidade) {
		
		Aluno aluno = (Aluno) entidade;
		
		if(aluno.getNome() == null || aluno.getNome().equals("")) {
			return ("Favor insira um nome.");
		}
		else {
			return null;
		}
	}

}
