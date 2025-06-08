public class Main {
    public static void main(String[] args) {
        ClienteService service = new ClienteService();
        int escolha= 0;
        do{
            try {
                System.out.print("\n---Menu---\n1- Adicionar cliente\n2- Listar clientes\n3- Buscar por CPF\n4- Sair\nDigite a opção desejada: ");escolha = Integer.parseInt(System.console().readLine());
                switch (escolha){
                    case 1:
                        service.adicionarCliente();
                        break;
                    case 2:
                        service.ListarCliente();
                        break;
                    case 3:
                        service.buscarPorCpf();
                        break;
                    case 4:
                        System.out.println("Programa finalizando...");
                        break;
                }
            }catch (Exception e){
                System.out.println("Valor digitado não é válido");
            }

        }while(escolha!=4);
    }
}
