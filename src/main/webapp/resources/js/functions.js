/***
 * Cuidado com nomes de variáveis, javascript não tem escopo bem definido de variáveis. Você pode ter problemas ao utilizar variáveis assim de forma global
 * Outro ponto, tente dar nomes mais intuitivos para as suas varáveis. 
 */
var v_obj;
var v_fun;

/***
 * Responsável por somar os valor dos campos e colocar numa label
 */
function somarValores()
{
	/**Buscando todos os elementos que tenham a classe valor*/
	var listaDeValores = document.querySelectorAll(".valor");
	var total = 0;
	
	/**Percorrendo todos os elementos que tem a classe valor*/
	for (var i = 0 ; i < listaDeValores.length ; i++)
	{
		
		/**Obtendo valor contido no elemento*/
		var valorEmTextoComMascara = listaDeValores[i].value;
		
		/**Chamando function para remover a mascara monetária*/
		var valorEmTextoSemMascara = removerMascaraMoneteria(valorEmTextoComMascara);
		
		/**Convertendo texto pata número e de fato efetuando a soma...*/
		total = total + Number(valorEmTextoSemMascara);
	}
	
	/**Buscando o elemento que exibe o total através do id*/
	var outputLabelTotal = document.querySelector("#label-valor-total");
	
	/**Caso seja necessário que tenha mais casas após a vírgula basta troca o 2 pela quantidade de casas necessárias*/
	total = total.toFixed(2);
	
	/**Alterando o texto do elemento que exibe o total*/
	outputLabelTotal.innerHTML = "Total: " + colocarMascaraMonetaria(total); 
}

/**
 * Responsável por remover máscara financeira
 * @param stringComMascara
 * @returns
 */
function removerMascaraMoneteria(textoComMascara)
{
	/**Removendo as virgula e colocando ponto para que não tenha problemas na conversao para Number*/
	var textoSemMascara = textoComMascara.replace(",",".");
	return textoSemMascara;		
}

/***
 * Responsável por colocar máscara montária
 * @param valorNumber
 * @returns
 */
function colocarMascaraMonetaria(valorNumber)
{
	/**Convertendo número para texto*/
	var result = "" + valorNumber;
	/**Removendo o ponto e colocando vírgula no lugar*/
	result = result.replace(".",",");
	return result;
}


function mascara(elemento, funcaoCallback) 
{
    v_obj = elemento
    v_fun = funcaoCallback
    setTimeout("execmascara()", 1)
}

function execmascara() 
{
    v_obj.value = v_fun(v_obj.value)
}

function moeda(value) 
{
    value = value.replace(/\D/g, ""); // permite digitar apenas numero
    value = value.replace(/(\d{1})(\d{1,2})$/, "$1,$2") // coloca virgula antes dos ultimos 2 digitos
    return value;
}