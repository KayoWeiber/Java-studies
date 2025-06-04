import java.awt.datatransfer.SystemFlavorMap;

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
                        }else{
                            System.out.print("Digite o saldo inicial da conta: "); double saldoInicial = Double.parseDouble(System.console().readLine());
                            if(saldoInicial<0){
                                System.out.print("O valor digitado não é válido");
                            }
                            else {
                                conta[idConta] = new Conta(idConta,saldoInicial);
                                System.out.printf("Conta nº%d criada com sucesso",idConta);
                                idConta++;
                                break;
                            }

                        }

                    case 2:
                        try{
                            if (idContaespecial>11){
                                System.out.printf("Não é possível criar conta sem limite, atingiu a quantidade máxima.");
                            }else{
                                System.out.print("Digite o saldo inicial da conta: "); double saldoInicial = Double.parseDouble(System.console().readLine());
                                System.out.print("Digite o limite da conta: "); double limiteInicial =  Double.parseDouble(System.console().readLine());
                                if(saldoInicial<0 || limiteInicial<0){
                                    System.out.print("O valor digitado não é válido.");
                                }else{
                                    contaEspecial[idContaespecial] =new ContaEspecial(idContaespecial,saldoInicial,limiteInicial);
                                    System.out.printf("Conta com limite nº%d criada com sucesso",idContaespecial);
                                    idContaespecial++;
                                    break;
                                }
                            }
                        } catch (Exception e) {
                        System.out.println("O valor digitado não é válido.");
                        }

                        break;
                    default:
                        System.out.printf("Por favor, digite um número entre 1 e 2.");
                        break;
                }
                break;
            }catch (Exception e){
                System.out.println("Valor digitado não é válido.");
            }
        }
    }
}
