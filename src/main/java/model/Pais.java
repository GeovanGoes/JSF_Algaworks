/**
 * 
 */
package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author geovan.goes
 *
 */
@Entity
public class Pais implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6535221342277661751L;
	
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String nome;
	@Column
	private String sigla;
	
	@OneToMany(mappedBy = "pais")
	private List<Estado> estados;
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
	 * @return the sigla
	 */
	public String getSigla()
	{
		return sigla;
	}
	/**
	 * @param sigla the sigla to set
	 */
	public void setSigla(String sigla)
	{
		this.sigla = sigla;
	}
}
