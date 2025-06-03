
public class Main {
    public static void main(String[] args) {
        Conta testeConta = new Conta(1,1000);
        testeConta.deposito(100);
        testeConta.ExibirSaldo();
        testeConta.saque(200);
        testeConta.ExibirSaldo();

        ContaEspecial testeContaEspecial = new ContaEspecial(1,1000,100);
        testeContaEspecial.deposito(100);
        testeContaEspecial.ExibirSaldo();
        testeContaEspecial.saque(900);
        testeContaEspecial.ExibirSaldo();


}}