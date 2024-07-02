/**
 * 
 */
package Projeto4.dao.jpa;

import Projeto4.dao.generic.jpa.GenericJpaDB1DAO;
import Projeto4.domain.jpa.ClienteJpa;

/**
 * @author Alan Vaz
 *
 */
public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
