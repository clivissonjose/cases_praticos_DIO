package candidatura;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		analisarCandidato(1890);
		analisarCandidato(2000);
		analisarCandidato(3000);

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
