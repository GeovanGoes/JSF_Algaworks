/**
 * 
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import model.Cidade;
import model.Estado;
import repository.EstadoRepository;
import util.JpaUtil;

/**
 * @author geovan.goes
 *
 */
@ManagedBean
@RequestScoped
public class FormularioPessoasBean implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -313642116206195995L;
	private String nome;
	private String sobrenome;
	private Date data;
	private String cpf;
	private Map<String, Long> estados;
	private Map<String, Long> cidades;
	private List<Estado> listaEstados;
	
	private Long estadoSelecionado;
	private Long cidadeSelecionada;
	
	@PostConstruct
    public void init() 
	{
		this.listaEstados = new EstadoRepository(JpaUtil.getEntityManager()).getAllEstados();
		estados = new HashMap<String, Long>();
		for (Estado estado : this.listaEstados)
		{
			estados.put(estado.getNome(), estado.getId());
		}
	}

	public void salvar()
	{
		System.out.println("Bateu aqui hein" + this.nome);
	}
	
	public void onEstadoChange()
	{
		System.out.println("hey");
		if (listaEstados != null && estadoSelecionado != null && estadoSelecionado.longValue() != 0)
		{
			for (Estado estado : listaEstados)
			{
				if (estado.getId().equals(estadoSelecionado))
				{
					this.cidades = new HashMap<String, Long>();
					
					for (Cidade cidade : estado.getCidades())
					{
						cidades.put(cidade.getNome(), cidade.getId());
					}
				}
			}			
		}
	}
	
	/**
	 * @return the estadao
	 */
	public Long getEstadao()
	{
		return estadoSelecionado;
	}

	/**
	 * @param estadao the estadao to set
	 */
	public void setEstadao(Long estadao)
	{
		this.estadoSelecionado = estadao;
	}

	/**
	 * @return the nome
	 */
	public String getNome()
	{
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	/**
	 * @return the sobrenome
	 */
	public String getSobrenome()
	{
		return sobrenome;
	}
	/**
	 * @param sobrenome the sobrenome to set
	 */
	public void setSobrenome(String sobrenome)
	{
		this.sobrenome = sobrenome;
	}
	/**
	 * @return the data
	 */
	public Date getData()
	{
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Date data)
	{
		this.data = data;
	}
	/**
	 * @return the cpf
	 */
	public String getCpf()
	{
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}
	
	
	/**
	 * @return the estados
	 */
	public Map<String, Long> getEstados()
	{
		return estados;
	}

	/**
	 * @param estados the estados to set
	 */
	public void setEstados(Map<String, Long> estados)
	{
		this.estados = estados;
	}
	
	/**
	 * @return the estadoSelecionado
	 */
	public Long getEstadoSelecionado()
	{
		return estadoSelecionado;
	}

	/**
	 * @param estadoSelecionado the estadoSelecionado to set
	 */
	public void setEstadoSelecionado(Long estadoSelecionado)
	{
		this.estadoSelecionado = estadoSelecionado;
	}

	/**
	 * @return the cidadeSelecionada
	 */
	public Long getCidadeSelecionada()
	{
		return cidadeSelecionada;
	}

	/**
	 * @param cidadeSelecionada the cidadeSelecionada to set
	 */
	public void setCidadeSelecionada(Long cidadeSelecionada)
	{
		this.cidadeSelecionada = cidadeSelecionada;
	}

	/**
	 * @return the cidades
	 */
	public Map<String, Long> getCidades()
	{
		return cidades;
	}

	/**
	 * @param cidades the cidades to set
	 */
	public void setCidades(Map<String, Long> cidades)
	{
		this.cidades = cidades;
	}
	
	
}
