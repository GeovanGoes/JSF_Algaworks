package bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import repository.PessoaRepository;
import util.JpaUtil;
import model.Lancamento;
import model.Pessoa;

public class CadastroLancamentoBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Lancamento lancamento = new Lancamento();
	private List<Pessoa> pessoas;
	
	public void prepararCadastro(){
		EntityManager entityManager = JpaUtil.getEntityManager();
		try{
			PessoaRepository pessoaRepository = new PessoaRepository(entityManager);
			this.pessoas = pessoaRepository.todas();
		}finally{
			entityManager.close();
		}		
	}
	
	public void salvar(){
		
	}
	
}
