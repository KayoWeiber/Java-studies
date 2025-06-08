public class Cliente {
    private String nome;
    private String cpf;
    private int idade;

    public Cliente(String nome,String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    public String getNome(){return nome;}
    public  String getCpf(){return cpf;}
    public int getIdade(){return idade;}

    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setIdade(int idade) { this.idade = idade; }

    @Override
    public String toString(){
        return "Cliente: "+nome+", CPF: "+cpf+" , Idade: "+idade;
    }
    public boolean equals(Object o) {
        if (this == o) return true; // Se for o mesmo objeto na memória
        if (!(o instanceof Cliente)) return false; // Se não for um Cliente, retorna falso
        Cliente cliente = (Cliente) o;
        return cpf.equals(cliente.cpf); // Compara pelo CPF (chave única)
    }
    @Override
    public int hashCode() {
        return cpf.hashCode();
    }
}
