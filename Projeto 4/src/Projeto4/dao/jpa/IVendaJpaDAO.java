/**
 * 
 */
package Projeto4.dao.jpa;

import Projeto4.dao.generic.jpa.IGenericJapDAO;
import Projeto4.domain.jpa.VendaJpa;
import Projeto4.exceptions.DAOException;
import Projeto4.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Alan Vaz
 *
 */
public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long> {

	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

	/**
	 * Usando este método para evitar a exception
	 * org.hibernate.LazyInitializationException Ele busca todos os dados de objetos
	 * que tenham colletion pois a mesma por default é lazy Mas você pode configurar
	 * a propriedade da collection como fetch = FetchType.EAGER na
	 * anotação @OneToMany e usar o consultar genérico normal
	 * 
	 * OBS: Não é uma boa prática utiliar FetchType.EAGER pois ele sempre irá trazer
	 * todos os objetos da collection mesmo sem precisar utilizar.
	 * 
	 * 
	 * @see VendaJpa produtos
	 * 
	 * @param id
	 * @return
	 */
	public VendaJpa consultarComCollection(Long id);
}
