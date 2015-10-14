package repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Pessoa;


public class PessoaRepository implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private EntityManager entityManager;
	
	public PessoaRepository(EntityManager entityManager){
		this.entityManager = entityManager;
	}
	
	public Pessoa pessoaPorId(Integer id){
		return entityManager.find(Pessoa.class,id);
	}
	
	public List<Pessoa> todas(){
		TypedQuery<Pessoa> query = entityManager.createQuery("from Pessoa",Pessoa.class);
		return query.getResultList();
	}
}
