//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta testeConta = new Conta(1,1000);
        testeConta.deposito(100);
        testeConta.ExibirSaldo();
        testeConta.saque(200);
        testeConta.ExibirSaldo();


}}