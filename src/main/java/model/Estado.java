/**
 * 
 */
package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author geovan.goes
 *
 */
@Entity
public class Estado implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3334609222138833116L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(length = 120 , nullable = false)
	private String nome;
	
	@Column(length = 2, nullable = false)
	private String uf;
	
	@ManyToOne
	@JoinColumn(name = "pais")
	private Pais pais;
	
	@OneToMany(mappedBy = "estado", fetch = FetchType.EAGER)
	private List<Cidade> cidades;
	
	
	/**
	 * @return the cidades
	 */
	public List<Cidade> getCidades()
	{
		return cidades;
	}

	/**
	 * @param cidades the cidades to set
	 */
	public void setCidades(List<Cidade> cidades)
	{
		this.cidades = cidades;
	}

	/**
	 * @return the id
	 */
	public Long getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id)
	{
		this.id = id;
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
	 * @return the uf
	 */
	public String getUf()
	{
		return uf;
	}

	/**
	 * @param uf the uf to set
	 */
	public void setUf(String uf)
	{
		this.uf = uf;
	}

	/**
	 * @return the pais
	 */
	public Pais getPais()
	{
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(Pais pais)
	{
		this.pais = pais;
	}
}

