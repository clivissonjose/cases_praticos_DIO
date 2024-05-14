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
		String[] candidatosAprovados = new String[5];
		
		double salarioBase =  2000;
		int candidatosSelecionados = 0;
		int indice = 0;
		int indiceCandidatoAprovado = 0;
		
		while(candidatosSelecionados < 5 && indice < candidatos.length) {
			String candidato = candidatos[indice];
			
			double valor = valorPretendido();
			
			if(salarioBase >= valor) {
				System.out.println("O(a) candidato(a) " + candidato +" esta aprovado com salario " + valor);
				candidatosSelecionados++;
				candidatosAprovados[indiceCandidatoAprovado] = candidato;
				indiceCandidatoAprovado++;
			}else {
				System.out.println("O(a) candidato " +candidato +" não foi aprovado! queria um salario de " + valor);
			}
	       indice++;
			
		}  // FIM DO WHILE
		
		imprimirCandidatosAprovados(candidatosAprovados);
		
	}
	
	static void imprimirCandidatosAprovados(String[] candidatosAprovados) {
		System.out.println("=============================");
		System.out.println("Candidatos aprovados: ");
		System.out.println("=============================");
		for(int i = 0; i < candidatosAprovados.length; i++) {
			System.out.println(candidatosAprovados[i]);
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
