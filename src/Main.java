public class Main {
    public static void main(String[] args) throws Exception {
      /* Conta cc = new ContaCorrente();
      cc.depositar(100);


      Conta poupança = new ContaPoupanca();

      cc.transferir(100, poupança);


      cc.imprimirExtrato();
      poupança.imprimirExtrato();*/

      Cliente matheus = new Cliente();
      matheus.setNome("Matheus");

      Conta ci = new ContaInvestimento(matheus);
      ci.investir(100, 2);

      ci.imprimirExtrato();

      ci.depositar(200);

      ci.imprimirExtrato();


        
    }
}
