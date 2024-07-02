/**
 * 
 */
package dao;

import Projeto4.dao.jpa.IVendaJpaDAO;
import Projeto4.domain.jpa.VendaJpa;
import Projeto4.exceptions.DAOException;
import Projeto4.exceptions.TipoChaveNaoEncontradaException;
import Projeto4.dao.generic.jpa.GenericJpaDB1DAO;

/**
 * @author Alan Vaz
 *
 *         Classe utilizada somente no teste para fazer a exclusão das vendas
 *
 */
public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}

