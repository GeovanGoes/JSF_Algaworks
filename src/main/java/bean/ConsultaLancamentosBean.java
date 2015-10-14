package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import util.JpaUtil;
import model.Lancamento;
import repository.LancamentoRepository;

@ManagedBean
@ViewScoped
public class ConsultaLancamentosBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Lancamento> lancamentos = new ArrayList<Lancamento>();
	
	public ConsultaLancamentosBean(){
		consultar();
	}

	public void consultar (){
		EntityManager entityManager = JpaUtil.getEntityManager();
		
		LancamentoRepository lancamento = new LancamentoRepository(entityManager);
		
		this.lancamentos = lancamento.todos();
		
		entityManager.close();
		
	}
	
	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}
}
