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
public abstract class GenericJpaDB1DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB1DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre1");
	}

}
