package dio_projeto_Banco_Digital;

public interface IConta {

	void sacar (double valor);
	void depositar (double valor);
	void transferir (double valor, IConta contaDestino);
	void imprimirExtrato();
	
}