package models;

public abstract class Veiculo {
    protected int id;
    protected String modelo;
    protected String marca;
    protected int ano;
    protected double valorDiaria;

    public Veiculo(int id, String modelo, String marca, int ano, double valorDiaria) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
    }

    public int getId() {
        return id;
    }

    public abstract double calcularDiaria();

    @Override
    public String toString() {
        return "ID: " + id +
               " | Modelo: " + modelo +
               " | Marca: " + marca +
               " | Ano: " + ano +
               " | Diária Base: R$" + valorDiaria;
    }
}