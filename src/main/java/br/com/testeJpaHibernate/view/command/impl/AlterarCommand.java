package br.com.testeJpaHibernate.view.command.impl;

import br.com.testeJpaHibernate.core.dominio.EntidadeDominio;
import br.com.testeJpaHibernate.core.dominio.Resultado;

public class AlterarCommand extends AbstractCommand {

	@Override
	public Resultado execute(EntidadeDominio entidade) {
		return fachada.alterar(entidade);
	}

}
