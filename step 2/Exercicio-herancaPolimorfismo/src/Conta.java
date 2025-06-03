public class Conta {
    public int nro_conta;
    public double saldo;

    public Conta(int nro_conta,double saldo){
        this.nro_conta = nro_conta;
        this.saldo = saldo;
    }
    public void deposito(double valorDeposito){
        saldo+=valorDeposito;
    }
    public void saque(double valorSaque){
        if(saldo==0|| saldo<0){
            System.out.println("Impossível realizar o saque, saldo está zerado!! ");
        }else{
           saldo-=valorSaque;
           if(saldo<0){
               System.out.println("Saldo insuficiente para realizar o valor do saque.");
               saldo+=valorSaque;
           }
        }

    }
    public void ExibirSaldo(){
        System.out.println("Saldo: R$"+saldo);
    }
}
