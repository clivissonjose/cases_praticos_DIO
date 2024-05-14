package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	analisarCandidato(1890);
		analisarCandidato(2000);
		analisarCandidato(3000);  */
		
		selecaoCandidatos();
		

	}
	
	static void selecaoCandidatos() {
		
		String [] candidatos = {"Clívisson", "Rafaela", "Nayara", "Kaik", "Jackson", "Alice", "Augusto", "Clivia"};
		
		double salarioBase =  2000;
		int candidatosSelecionados = 0;
		int indice = 0;
		
		while(candidatosSelecionados < 5 && indice < candidatos.length) {
			String candidato = candidatos[indice];
			
			double valor = valorPretendido();
			
			if(salarioBase >= valor) {
				System.out.println("O(a) candidato(a) " +candidato +" esta aprovado com salario " + valor);
				candidatosSelecionados++;
			}else {
				System.out.println("O(a) candidato " +candidato +" não foi aprovado! queria um salario de " + valor);
			}
	       indice++;
			
		}
		
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200); 
	}
	
	static void analisarCandidato(double salarioPretendido) {
		
		double salarioBase = 2000.00;
		
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if( salarioBase ==  salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA!");
		}else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS!");
		}
	}

}
