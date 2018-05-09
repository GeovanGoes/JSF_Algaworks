/**
 * 
 */
package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author geovan.goes
 *
 */
@Entity
public class Cidade implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1179658705876600669L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(length = 120 ,nullable = false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "estado")
	private Estado estado;
	
	

	public Cidade()
	{
		super();
	}

	public Cidade(Long id, String nome)
	{
		super();
		this.id = id;
		this.nome = nome;
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
}
