package cliente.carro;

import es.antrob.Carro;

public class Principal {

	public static void main(String[] args) {
		
		boolean constroiBem = testarConstrucaoCarro();
		
		if( constroiBem )
			System.out.println("Carro bem constru�do");
		else 
			System.out.println("Carro mal constru�do");
		

	}
	
	private static boolean testarConstrucaoCarro() {
		
		Carro carroTeste = new Carro();
		
		if ((carroTeste.getCapacidadeDeposito()==40.0) && (carroTeste.getQuantidadeCombustivel()==0) )
			return true;
		else		
			return false;
	}
	
	private static boolean testarMeterCombustivelcomQuantidade() {
		
		// Considerar 3 casos 
		
		// Dando uma quantidade que faria transbordar o dep�sito
		
		// Dando a exacta quantidade para atestar o dep�sito 
		
		// Dando uma quantidade que aumentaria o n�vel de combust�vel sem encher por completo o dep�sito
		
		return false;
	}
	
	private static boolean testarMeterCombustivelAtestar() {
		
		return false;
	}
	
	private static boolean testarAndar() {
		
		// 3 casos 
		
		// Recendo uma dist�ncia dentro da autonomia do carro 
		
		// Recebendo uma dist�ncia superior � autonomia do carro 
		
		// Recebendo uma dist�ncia igual � autonomia do carro 
		
		return false;
	}
	
	
	
	

}
