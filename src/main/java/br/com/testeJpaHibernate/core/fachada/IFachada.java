package br.com.testeJpaHibernate.core.fachada;

import br.com.testeJpaHibernate.core.dominio.EntidadeDominio;
import br.com.testeJpaHibernate.core.dominio.Resultado;

public interface IFachada {
	
	public Resultado salvar(EntidadeDominio entidade);
    public Resultado alterar(EntidadeDominio entidade);
    public Resultado excluir(EntidadeDominio entidade);
    public Resultado consultar(EntidadeDominio entidade);
	
}
