public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private double saldo;


    public Cliente(String nome, String cpf, String email,double saldo){
        this.nome=nome;
        this.cpf=cpf;
        this.email=email;
        this.saldo=saldo;
    }
    public String getCpf(){
        return cpf;
    }
    public void setSaldo(double novoSaldo){
        this.saldo = novoSaldo;
    }
    public void mostrarDados(){
        System.out.println("\nNome: "+nome+"\nCPF: "+cpf+"\nemail: "+email);
    }


}
