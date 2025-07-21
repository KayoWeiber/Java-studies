import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class ContaDAO {
    public static void criarConta(ContaUser conta){
        String sql = "Insert into contas (titular,saldo) values (?,?)";
        try(Connection conn = ConexaoDB.getConexao()){
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, conta.getNome());
            pstmt.setBigDecimal(2,conta.getSaldo());

            pstmt.executeUpdate();
            System.out.println("Conta criada com sucesso!!!");

        }catch (SQLException e) {
            System.out.println("Erro ao criar conta: " + e.getMessage());
        }
    }
    public ContaUser buscarPorId(int id) {
        String sql = "select * from contas where id = ?";
        ContaUser conta = null;
        try (Connection conn = ConexaoDB.getConexao()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()){
                String nome = rs.getString("titular");
                BigDecimal saldo = rs.getBigDecimal("saldo");

                conta = new ContaUser(nome, saldo);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar conta por ID: " + e.getMessage());
        }
        return conta;
    }

}
