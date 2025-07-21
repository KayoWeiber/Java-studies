import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Connection conn = ConexaoDB.getConexao();
        Scanner sc = new Scanner(System.in);
        int opcao=0;
        do{
            try {
                System.out.println("\n------MENU------\n1 - Cadastrar nova conta\n" + "2 - Consultar saldo\n" + "3 - Depositar\n" + "4 - Sacar\n" + "5 - Transferir\n" + "6 - Sair");
                System.out.print("Digite a opção desejada: ");opcao = sc.nextInt();
                sc.nextLine();
                switch (opcao){
                    case 1:

                        System.out.print("\nNome do titular: ");
                        String nome = sc.nextLine();

                        System.out.print("\nSaldo inicial: ");
                        BigDecimal saldo = sc.nextBigDecimal();
                        sc.nextLine();

                        ContaUser novaConta = new ContaUser(nome, saldo);
                        ContaDAO dao = new ContaDAO();
                        dao.criarConta(novaConta);

                        break;
                    default:
                        System.out.println("Valor digitado não é válido.");
                }
            } catch (Exception e) {
                System.err.println("Erro: valor inválido");
            }

        }while (opcao!=6);
    }
}