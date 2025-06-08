import java.util.*;

public class ClienteService {
    Cliente[] clientes = new Cliente[10];
    Map<String,Cliente> clienteMap = new HashMap<>();
    int count=1;
    List<Cliente> clientesLista = new ArrayList<>();
    public void adicionarCliente(){
       if(count>11){
           System.out.print("Quantidade máxiam de conta atingida!!");
       }else {
           while (true){
               System.out.print("Digite o nome: ");String nome=System.console().readLine();
               System.out.print("Digite o CPF: "); String cpf = System.console().readLine();
               System.out.print("Digite a idade: ");String IdadeString = System.console().readLine();
               try {
                   int idade = Integer.parseInt(IdadeString);
                   Cliente clienteBusca = new Cliente(nome,cpf,idade);
                   if(clientesLista.contains(clienteBusca)){
                       System.out.println("Cliente já cadastrado!");
                   } else {
                       clientes[count]= new Cliente(nome,cpf,idade);
                       clientesLista.add(clienteBusca);
                       clienteMap.put(clienteBusca.getCpf(),clienteBusca);
                       count++;
                       break;
                   }
               }catch (NumberFormatException e){
                   System.out.println("Entrada inválida. Por favor, digite uma idade válida.");
               }
           }
       }
    }
    public void ListarCliente(){
        Collections.sort(clientesLista, Comparator.comparing(Cliente::getNome));
        for(Cliente c:clientesLista){
            System.out.println(c);
        }
    }
    public void buscarPorCpf(){
        System.out.print("Digite o CPF que deseja pesquisar: "); String cpf = System.console().readLine();
        if(clienteMap.get(cpf)!=null){
            System.out.print(clienteMap.get(cpf));
        }else {
            System.out.print("Cliente não existe.");
        }

    }

}
