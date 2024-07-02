/**
 * 
 */
package Projeto4.dao.jpa;

import Projeto4.dao.generic.jpa.IGenericJapDAO;
import Projeto4.domain.jpa.Persistente;

/**
 * @author Alan Vaz
 *
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long> {

}

