/**
 * 
 */
package bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

/**
 * @author geovan.goes
 *
 */

@ManagedBean
public class SomaValoresBean implements Serializable
{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1144184491509014935L;
	
	private Double valorUm;
	private Double valorDois;
	private Double valorTres;
	private Double valorQuatro;
	
	private Double total;
	
	public void soma()
	{
		total = valorUm + valorDois + valorTres + valorQuatro;
	}
	
	/**
	 * @return the total
	 */
	public Double getTotal()
	{
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(Double total)
	{
		this.total = total;
	}

	/**
	 * @return the valorUm
	 */
	public Double getValorUm()
	{
		return valorUm;
	}
	/**
	 * @param valorUm the valorUm to set
	 */
	public void setValorUm(Double valorUm)
	{
		this.valorUm = valorUm;
	}
	/**
	 * @return the valorDois
	 */
	public Double getValorDois()
	{
		return valorDois;
	}
	/**
	 * @param valorDois the valorDois to set
	 */
	public void setValorDois(Double valorDois)
	{
		this.valorDois = valorDois;
	}
	/**
	 * @return the valorTres
	 */
	public Double getValorTres()
	{
		return valorTres;
	}
	/**
	 * @param valorTres the valorTres to set
	 */
	public void setValorTres(Double valorTres)
	{
		this.valorTres = valorTres;
	}
	/**
	 * @return the valorQuatro
	 */
	public Double getValorQuatro()
	{
		return valorQuatro;
	}
	/**
	 * @param valorQuatro the valorQuatro to set
	 */
	public void setValorQuatro(Double valorQuatro)
	{
		this.valorQuatro = valorQuatro;
	}
}
