package br.com.testeJpaHibernate.view.command.impl;

import br.com.testeJpaHibernate.core.dominio.EntidadeDominio;
import br.com.testeJpaHibernate.core.dominio.Resultado;

public class ExcluirCommand extends AbstractCommand {

	@Override
	public Resultado execute(EntidadeDominio entidade) {
		return fachada.excluir(entidade);
	}

}
