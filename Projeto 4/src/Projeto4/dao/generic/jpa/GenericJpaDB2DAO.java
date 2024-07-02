/**
 * 
 */
package Projeto4.dao.generic.jpa;

import java.io.Serializable;

import Projeto4.domain.jpa.Persistente;

/**
 * @author Alan Vaz
 *
 */
public abstract class GenericJpaDB2DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB2DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre2");
	}

}
