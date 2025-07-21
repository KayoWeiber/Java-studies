import java.math.BigDecimal;

public class ContaUser {
    private  String nome;
    private  BigDecimal saldo;

    public  String getNome() {
        return nome;
    }
    public  void setNome(String nome) {
        this.nome = nome;
    }
    public  BigDecimal getSaldo() {
        return saldo;
    }
    public  void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    public ContaUser(String nome,BigDecimal saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }
}
