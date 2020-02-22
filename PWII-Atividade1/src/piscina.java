
public class piscina {

	
	public static void main(String[] args) {
		int diametro = 6;
		int custo = 75;
		int larguraTerreno =20;
		int comprimentoTerreno = 20;
		double porcentagemConstruida = 50;
		int custoCasa = 60;
		
		
		
		System.out.println("o valor do raio e:" + raio(diametro));
		System.out.println("o valor da area do projeto e : " + areaProjeto(diametro));
		System.out.println("o valor  total e de :" + total(diametro));
		System.out.println("o valor total da casa sera de  :" + valorTotalCasa(larguraTerreno , comprimentoTerreno , porcentagemConstruida , custoCasa ));
		System.out.println("o valor total da obra" + custoTotal(larguraTerreno , comprimentoTerreno , porcentagemConstruida , custoCasa , diametro ));
	}

	
	public static int raio (int diametro) {
		int valorRaio = diametro /2;
		return valorRaio;	
	}
	
	public static double areaProjeto(int diametro) {
		double ap = Math.PI * Math.pow(raio(diametro),2);
		return ap;
	}
	
	public static double total(int diametro) {
		double valorTotal = areaProjeto(diametro) * 75;
		return valorTotal;
	}
	
	public static double valorTotalCasa(int larguraTerreno , int comprimentoTerreno , double porcentagemConstruida , int custoCasa ) {
		
		double valorTotalPago = (larguraTerreno * comprimentoTerreno) /2 *60;
		return valorTotalPago;
	}
	
	
	public static double custoTotal(int larguraTerreno , int comprimentoTerreno , double porcentagemConstruida , int custoCasa , int diametro ) {
		
		double custoTotalCasa = valorTotalCasa(larguraTerreno , comprimentoTerreno , porcentagemConstruida ,custoCasa) + total(diametro);
		return  custoTotalCasa;
	}
	 
}
