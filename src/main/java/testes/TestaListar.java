package testes;

import java.util.List;

import model.Lancamento;
import bean.ConsultaLancamentosBean;

public class TestaListar {
	public static void main (String[] args){
		ConsultaLancamentosBean consultaLancamentosBean = new ConsultaLancamentosBean();
		consultaLancamentosBean.consultar();
		
		for(Lancamento l: consultaLancamentosBean.getLancamentos()){
			System.out.println(l.getId());
		}
	}
}
