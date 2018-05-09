package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pessoa")
public class Pessoa implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(length=60,nullable=false)
	private String nome;
	
	@Column
	private Date dataNascimento;
	
	@Column(length = 11, nullable = false)
	private String cpf;
	
	@ManyToOne
	private Estado estadoNascimento;
	
	@ManyToOne
	private Cidade cidadeNascimento;
	
	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento()
	{
		return dataNascimento;
	}
	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento)
	{
		this.dataNascimento = dataNascimento;
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
	 * @return the estadoNascimento
	 */
	public Estado getEstadoNascimento()
	{
		return estadoNascimento;
	}
	/**
	 * @param estadoNascimento the estadoNascimento to set
	 */
	public void setEstadoNascimento(Estado estadoNascimento)
	{
		this.estadoNascimento = estadoNascimento;
	}
	/**
	 * @return the cidadeNascimento
	 */
	public Cidade getCidadeNascimento()
	{
		return cidadeNascimento;
	}
	/**
	 * @param cidadeNascimento the cidadeNascimento to set
	 */
	public void setCidadeNascimento(Cidade cidadeNascimento)
	{
		this.cidadeNascimento = cidadeNascimento;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
