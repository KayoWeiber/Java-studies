public class GerenciadorContas {
//    Conta testeConta = new Conta(1,1000);
//        testeConta.deposito(100);
//        testeConta.ExibirSaldo();
//        testeConta.saque(200);
//        testeConta.ExibirSaldo();
//
//    ContaEspecial testeContaEspecial = new ContaEspecial(1,1000,100);
//        testeContaEspecial.deposito(100);
//        testeContaEspecial.ExibirSaldo();
//        testeContaEspecial.saque(900);
//        testeContaEspecial.ExibirSaldo();

    Conta[] conta = new Conta[10];
    ContaEspecial[] contaEspecial = new ContaEspecial[10];
    int idConta = 1;
    int idContaespecial = 1;

    public void cadastro(){
        while(true){
            try{
                System.out.print("\nTipos de contas:\n1- Conta sem limite\n2- Conta com limite\nDigite a opção desejada: ");
                int opcaoConta = Integer.parseInt(System.console().readLine());
                switch (opcaoConta){
                    case 1:
                        if(idConta>11){
                            System.out.printf("Não é possível criar conta sem limite, atingiu a quantidade máxima.");
                        }
                        break;
                    case 2:

                        break;
                    default:
                        System.out.printf("Por favor, digite um número entre 1 e 2.");
                        break;
                }
            }catch (Exception e){
                System.out.println("Valor digitado não é válido.");
            }
        }
    }
}
