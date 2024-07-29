public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRÃO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRÃO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    
    }

    @Override
    public void sacar(double valor){
        saldo -= valor;
   }
   
   @Override
   public void depositar(double valor){
       saldo += valor;
   }
   
   @Override
   public void transferir(double valor, Conta contaDestino){
       this.sacar(valor);
       contaDestino.depositar(valor);
   }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    
    protected void imprimirInfosComuns () {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public void investir(double valor, int anos) {
        switch (anos) {
            case 1:
                valor += valor * 0.01; // 1% do valor
                break;
            case 2:
                valor += valor * 0.02; // 2% do valor
                break;
            case 3:
                valor += valor * 0.03; // 3% do valor
                break;
            default:
                if (anos >= 4) {
                    valor += valor * 0.04; // 4% do valor
                }
                break;
        }
    
        this.saldo += valor;
    }


}





