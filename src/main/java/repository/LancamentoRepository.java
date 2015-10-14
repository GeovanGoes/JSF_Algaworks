package repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Lancamento;

public class LancamentoRepository implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private EntityManager entityManager;
	
	public LancamentoRepository(EntityManager entityManager){
		this.entityManager = entityManager;
	}
	
	public void adicionar(Lancamento lancamento){
		this.entityManager.persist(lancamento);
	}
	
	public List<Lancamento> todos(){
		TypedQuery<Lancamento> query = entityManager.createQuery(
				"from Lancamento", Lancamento.class);
				return query.getResultList();
	}
	
}
