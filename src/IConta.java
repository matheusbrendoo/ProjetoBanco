public interface IConta {

void sacar(double valor);

void depositar(double valor);

void transferir(double valor, Conta contaDestino);

void imprimirExtrato();

void investir(double valor, int anos);

}
