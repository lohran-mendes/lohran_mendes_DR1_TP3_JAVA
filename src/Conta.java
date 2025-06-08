public class Conta {
    String titular;
    String agencia;
    int numero;
    double saldo;
    String dataAbertura;

    public void saca(double valor){
        this.saldo -= valor;
    }
    public void deposita(double valor){
        this.saldo += valor;
    }
    public double calculaRendimento(){
        return (this.saldo * 0.1);
    }
    public static void exercicio9(){
        Conta contaPropria = new Conta();
        contaPropria.titular = "Maria";
        contaPropria.saldo = 0;
        contaPropria.agencia = "agencia 01";
        contaPropria.numero = 0001;
        contaPropria.dataAbertura = "08/06/2025";
        System.out.println("Saldo inicial da conta: R$"  + contaPropria.saldo);
        System.out.println("Valor de rendimento da por mês: R$"  + contaPropria.calculaRendimento());
        contaPropria.deposita(2500);
        System.out.println("Saldo da conta depois do depósito: R$"  + contaPropria.saldo);
        System.out.println("Valor de rendimento da por mês depois do depósito: R$"  + contaPropria.calculaRendimento());
    }
}
