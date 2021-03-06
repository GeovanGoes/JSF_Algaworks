package service;

import java.io.Serializable;
import java.util.Date;

import repository.LancamentoRepository;
import model.Lancamento;

public class CadastroLancamentos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private LancamentoRepository lancamentoRepository;
	
	public CadastroLancamentos(LancamentoRepository lancamentoRepository){
		this.lancamentoRepository = lancamentoRepository;
	}
	
	public void salvar (Lancamento lancamento) throws NegocioException{
		if(lancamento.getDataPagamento()!=null && 
				lancamento.getDataPagamento().after(new Date())){
			throw new NegocioException("Data de pagamento não pode ser uma data futura");
		}
		this.lancamentoRepository.adicionar(lancamento);
	}
	
}
