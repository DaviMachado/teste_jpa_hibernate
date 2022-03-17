package br.com.testeJpaHibernate.core.strategy;

import br.com.testeJpaHibernate.core.dominio.EntidadeDominio;

public interface IStrategy {
	
	public String validar (EntidadeDominio entidade);
	
}
