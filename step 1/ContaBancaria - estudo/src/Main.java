import java.lang.classfile.instruction.SwitchCase;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaBancaria Contas = new ContaBancaria();
        int escolha = 0;
//        Contas.cadastrarCliente();


        do {
            try {
                System.out.println("\nMenu:\n1 - Cadastrar Cliente\n2 - Depositar\n3 - Listar Contas\n4 - Sair");

                try {
                    System.out.print("Digite o valor desejado: "); String escolhaString = System.console().readLine();
                    escolha=Integer.parseInt(escolhaString);
                    if(escolha<1||escolha>4){
                        System.out.println("Digite um número entre 1 e 3");
                    }else{
                        switch (escolha){
                            case 1:
                                Contas.cadastrarCliente();
                                break;
                            case 2:
                                Contas.depositar();
                                break;
                            case 3:
                                Contas.ListarContas();
                                break;
                            case 4:
                                System.out.println("Saindo...");
                                break;
                        }
                    }

                }catch (NumberFormatException e){
                    System.out.println("Digite uum número válido");
                }
            }catch (Exception e) {
                System.out.println("O valor digitado não é válido, Digite um valor válido.");

            }
        }while (escolha!=4);


    }
}