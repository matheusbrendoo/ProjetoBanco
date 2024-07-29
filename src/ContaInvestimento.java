public class ContaInvestimento extends Conta{
    
    public ContaInvestimento(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato conta investimento ===");
        super.imprimirInfosComuns();
    }

}
