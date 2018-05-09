/**
 * 
 */
package repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * @author geovan.goes
 *
 */
public class Repository<T>
{

	private EntityManager em;
	
	public Repository(EntityManager em)
	{
		super();
		this.em = em;
	}

	public void insert (Object object)
	{
		EntityTransaction transaction = em.getTransaction();
		try 
		{
			transaction.begin();
			em.persist(object);
			transaction.commit();
		}
		catch (Exception e)
		{
			defaultActionForProblemInTransaction(transaction);
		}
		finally
		{
			defaultActionForProblemInClose();
		}
	}
	
	/***
	 * 
	 * @return
	 */
	public List<T> list()
	{
		return null;
	}

	/**
	 * 
	 */
	private void defaultActionForProblemInClose()
	{
		try
		{
			em.close();
		}
		catch (Exception e2)
		{
			e2.printStackTrace();
		}
	}

	/**
	 * @param transaction
	 */
	private void defaultActionForProblemInTransaction(EntityTransaction transaction)
	{
		try
		{
			transaction.rollback();
		}
		catch (Exception e2)
		{
			e2.printStackTrace();
		}
	}
		
}
