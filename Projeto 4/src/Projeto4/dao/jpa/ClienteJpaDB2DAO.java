/**
 * 
 */
package Projeto4.dao.jpa;

import Projeto4.dao.generic.jpa.GenericJpaDB2DAO;
import Projeto4.domain.jpa.ClienteJpa;

/**
 * @author Alan Vaz
 *
 */
public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
