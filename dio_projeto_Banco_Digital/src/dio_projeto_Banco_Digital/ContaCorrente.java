package dio_projeto_Banco_Digital;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		
		System.out.println("***** Conta Corrente *****");
		super.imprimirExtrato();
		
		System.out.println("***** <====> *****");
	}
	
	
}
