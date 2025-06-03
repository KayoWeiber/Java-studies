public class ContaEspecial extends Conta {
    public double limite;
    double saldoExtra;
    public ContaEspecial(int nro_conta,double saldo, double limite){
        super(nro_conta,saldo);
        this.limite = limite;
        saldoExtra=limite;

    }

    @Override
    public void deposito(double valorDeposito) {
        double usadoLimite=limite-saldoExtra;
        if(usadoLimite>0){
            if(valorDeposito>=usadoLimite){
                saldoExtra+=usadoLimite;
                saldo+=valorDeposito-usadoLimite;
            }else{
                saldoExtra+=valorDeposito;
            }
        }else{
            saldo+=valorDeposito;
        }
        System.out.println("Deposito realizado com sucesso, Saldo: R$"+saldo+" Limite: R$"+saldoExtra);
    }
    @Override
    public void saque(double valorSaque){
        if(valorSaque>(saldo+saldoExtra)){
            System.out.println("Impossível realizar saque, saque maior que limite disponível!!");
        }else{
            if(valorSaque<=saldo){
                saldo-=valorSaque;
                System.out.println("Saque realizado com sucesso!!");
            }else{
                double restantePagar=valorSaque-saldo;
                double saldoAnterior=saldo;
                saldo=0;
                saldoExtra-=restantePagar;
                if(saldoExtra<0){
                    System.out.println("Impossível realizar saque, saque maior que limite disponível!!");
                    saldoExtra+=restantePagar;
                    saldo=saldoAnterior;

                }else{
                    System.out.println("Saque realizado utilizando saldo especíal, saldo especíal atual: R$"+saldoExtra);
                }

            }
        }

    }
    @Override
    public void ExibirSaldo(){
        if(saldo!=0){
            super.ExibirSaldo();
            System.out.println("Saldo especial: R$"+saldoExtra);
        }else{
            System.out.println("Saldo atual está no crédito especial, saldo extra disponível: R$"+saldoExtra);
        }
    }
}
