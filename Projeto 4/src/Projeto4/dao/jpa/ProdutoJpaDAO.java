/**
 * 
 */
package Projeto4.dao.jpa;

import Projeto4.dao.generic.jpa.GenericJpaDB1DAO;
import Projeto4.domain.jpa.ProdutoJpa;

/**
 * @author Alan Vaz
 *
 */
public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
