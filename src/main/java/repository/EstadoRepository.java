/**
 * 
 */
package repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Estado;

/**
 * @author geovan.goes
 *
 */
public class EstadoRepository implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -968690833790201302L;
	
	private EntityManager entityManager;

	public EstadoRepository(EntityManager entityManager)
	{
		super();
		this.entityManager = entityManager;
	}
	
	/***
	 * 
	 * @return
	 */
	public List<Estado> getAllEstados()
	{
		TypedQuery<Estado> query = entityManager.createQuery("from Estado", Estado.class);
		return query.getResultList();
	}

}
