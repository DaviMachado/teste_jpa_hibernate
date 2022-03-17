package br.com.testeJpaHibernate.view.command;

import br.com.testeJpaHibernate.core.dominio.EntidadeDominio;
import br.com.testeJpaHibernate.core.dominio.Resultado;

public interface ICommand {
	
	public Resultado execute (EntidadeDominio entidade);
	
}
