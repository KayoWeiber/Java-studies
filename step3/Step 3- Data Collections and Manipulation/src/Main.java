import java.util.*;
class clientes{

}
public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        System.out.println(numeros[0]+" "+numeros[2]+" "+numeros[1]);

        List<String>listTeste = new ArrayList<>();
        listTeste.add("Kayo");
        listTeste.add("Weiber");
        System.out.println("List: "+ listTeste);

        Set<String> setCpf = new HashSet<>();
        setCpf.add("162");
        setCpf.add("181");
        setCpf.add("162");
        System.out.println("Set"+ setCpf);

        Map <String,String>clienteporCPF = new HashMap<>();
        clienteporCPF.put("162","Kayo");
        System.out.println("Map: "+clienteporCPF.get("162"));

        for(String nome:listTeste){
            System.out.println("for-each: "+nome);
        }

        List<String> nomes = new ArrayList<>(List.of("João", "Maria", "José"));
        Iterator<String> it =nomes.iterator();
        while(it.hasNext()){
            String nome = it.next();
            if(nome.equals("Maria")){
                it.remove();
            };

        }
        System.out.println(nomes);

        List<Integer> numerosArray = Arrays.asList(3,1,8,4,9);
        System.out.println(numerosArray);
        Collections.sort(numerosArray);
        System.out.println(numerosArray);

        Cliente cliente = new Cliente("Kayo","162",20);
        Cliente cliente2 = new Cliente("Kayo2","163",20);
        Cliente cliente3 = new Cliente("Kayo3","164",20);
        Cliente cliente4 = new Cliente("Kayo4","165",20);

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);
        clientes.add(cliente4);
        clientes.add(cliente3);
        clientes.add(cliente2);

        for(Cliente c:clientes){
            System.out.println(c);
        }
        System.out.println("");


        Collections.sort(clientes,Comparator.comparing(Cliente::getNome));
        for(Cliente c:clientes){
            System.out.println(c);
        }
        Cliente clienteBusca = new Cliente("teste","169",99);
        if (clientes.contains(clienteBusca)) {
            System.out.println("Cliente já cadastrado!");
        } else {
            System.out.println("Cliente novo, pode adicionar.");
        }


    }
}