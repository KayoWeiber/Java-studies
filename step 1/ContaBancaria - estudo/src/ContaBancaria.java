public class ContaBancaria {
    Cliente[] cliente = new Cliente[10];
    int count=1;

    public void cadastrarCliente(){
        while (true){
            try {
                if(count<11) {
                    System.out.print("Digite seu nome: ");
                    String nome = System.console().readLine();
                    System.out.print("Digite seu cpf: ");
                    String cpf = System.console().readLine();
                    System.out.print("Digite seu email: ");
                    String email = System.console().readLine();
                    double saldo;
                    while (true) {
                        System.out.print("Digite o saldo  inicial da conta: ");
                        String saldoString = System.console().readLine();
                        try {
                            saldo = Double.parseDouble(saldoString);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Por favor, digite um valor válido! ");
                        }
                    }
                    cliente[count] = new Cliente(nome, cpf, email, saldo);

                    System.out.println("Cliente Cadastrado!!, número da sua conta é " + count);
                    count++;
                    break;
                }
                else {System.out.println("Todas as contas já estão cadastradas.");}
            }catch (Exception e){
                System.out.println("Valor inválido");
            }
        }
    }
    public void depositar(){
        while(true){
            try {
                System.out.print("Digite o CPF da conta para depositar: "); String cpfConta = System.console().readLine();
                int NumeroConta=0;
                for(int i=1;i<count;i++){
                    String cpfVerificacao = cliente[i].getCpf();
                    if (cpfVerificacao.equals(cpfConta)){NumeroConta=i;}
                }
                if(NumeroConta!=0){
                    System.out.print("Digite o valor que deseja depositar: ");
                    while (true) {
                        String saldoString = System.console().readLine();
                        double saldoDeposito;
                        try {
                            saldoDeposito = Double.parseDouble(saldoString);
                            if(saldoDeposito<=0){
                                System.out.println("O valor a ser depositado não pode ser menor ou igual a 0 ");
                            }else{
                            cliente[NumeroConta].setSaldo(saldoDeposito);
                            System.out.println("Depósito realizado.");
                            cliente[NumeroConta].extrato();
                                break;
                            }


                        } catch (NumberFormatException e) {
                            System.out.println("Por favor, digite um valor válido! ");
                        }
                    }
                    break;
                }
                else{
                    System.out.println("O Cpf não está vinculado com nenhuma conta.");
                    break;
                }
            }catch(Exception e){
                System.out.println("Valor inválido");
            }
        }

    }
    public void ListarContas(){
        if(count==0 || cliente==null){
            System.out.println("Não existe nenhuma conta cadastrada!!");
        }else{
            for(int j=0; j<count;j++){
                if (cliente[j]!=null){
                    cliente[j].mostrarDados();
                }else {
                    System.out.println("Conta "+j+" está vazia.");
                }
            }
        }
    }







}
