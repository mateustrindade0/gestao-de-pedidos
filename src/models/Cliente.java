package models;

public class Cliente {
    
    // Attributes
    private int id;
    private String nome;
    private String cpf;
    private String telefone;

    // Constructor
    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    // Getters and Setters
    public int getId(){return id;}
    public void setId(int id) { this.id = id; }

    public String getNome(){return nome;}
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() {return cpf;}
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) { this.telefone = telefone; }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome='" + nome + '\'' + ", cpf='" + cpf + '\'' + ", telefone='" + telefone + '\'' + '}';
    }


}