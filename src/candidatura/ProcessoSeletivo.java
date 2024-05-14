package candidatura;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

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
		
		imprimirCandidatosAprovados(candidatosAprovados, candidatosSelecionados);
		
	}
	
	static void imprimirCandidatosAprovados(String[] candidatosAprovados, int candidatosSelecionados) {
		System.out.println("=============================");
		System.out.println("Candidatos aprovados: ");
		System.out.println("=============================");
		for(int i = 0; i < candidatosSelecionados; i++) {
			System.out.println(candidatosAprovados[i]);
		}
		
		
		for(int i =0 ; i < candidatosSelecionados; i++) {
			fazerLigacoes(candidatosAprovados[i]);
		}
	}
	
	static void fazerLigacoes(String candidato) {
		
		int tentativas = 1;
		boolean atendeu = false;
		boolean continuarTentando = false;
		
		do {
			
			atendeu = atendeu();
			continuarTentando = !atendeu;
			
			if(continuarTentando) {
				tentativas++;
			}else {
				System.out.println("CONTATO REALIZADO COM SUCESSO!");
			}
			
			
		}while(continuarTentando && tentativas < 3);
		
		if(atendeu) {
			System.out.printf("CONSEGUIMOS CONTATO COM O CANDIDATO %s na %d tentativa! \n", candidato, tentativas);
		}else {
			System.out.println("NÃO CONSEGUIMOS ENTRAR EM CONTATO COM O CANDIDATO " + candidato);
		}
		
	}
	
	static boolean atendeu() {
		return new Random().nextInt(3) == 1;
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
