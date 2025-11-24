package models;

public class Carro extends Veiculo {
    private int portas;

    public Carro(int id, String modelo, String marca, int ano, double valorDiaria, int portas) {
        super(id, modelo, marca, ano, valorDiaria);
        this.portas = portas;
    }

    @Override
    public double calcularDiaria() {
        return valorDiaria * 1.10; // 10% a mais
    }

    @Override
    public String toString() {
        return super.toString() + " | Portas: " + portas + " | Tipo: Carro";
    }
}