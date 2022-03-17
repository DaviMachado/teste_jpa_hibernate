package br.com.testeJpaHibernate.view.command.impl;

import br.com.testeJpaHibernate.core.fachada.IFachada;
import br.com.testeJpaHibernate.core.fachada.impl.Fachada;
import br.com.testeJpaHibernate.view.command.ICommand;

public abstract class AbstractCommand implements ICommand {
	
	protected IFachada fachada = new Fachada();
	
}
