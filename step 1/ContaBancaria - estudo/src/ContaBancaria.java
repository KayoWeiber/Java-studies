public class ContaBancaria {
    Cliente[] cliente = new Cliente[10];
    int count=1;

    public void cadastrarCliente(){
        while (true){
            try {
                System.out.print("Digite seu nome: ");String nome = System.console().readLine();
                System.out.print("Digite seu cpf: ");String cpf = System.console().readLine();
                System.out.print("Digite seu email: ");String email = System.console().readLine();
                double saldo;
                while (true) {
                    System.out.print("Digite o saldo  inicial da conta: ");String saldoString = System.console().readLine();
                    try {
                        saldo = Double.parseDouble(saldoString);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, digite um valor válido! ");
                    }
                }
                cliente[count] = new Cliente(nome, cpf, email, saldo);

                System.out.println("Cliente Cadastrado!!, número da sua conta é "+count);
                count++;
                break;

            }catch (Exception e){
                System.out.println("Valor inválido");
            }
        }
    }








}
