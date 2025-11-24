package models;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(int id, String modelo, String marca, int ano, double valorDiaria, int cilindradas) {
        super(id, modelo, marca, ano, valorDiaria);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularDiaria() {
        return valorDiaria * 0.90; // 10% de desconto
    }

    @Override
    public String toString() {
        return super.toString() + " | Cilindradas: " + cilindradas + " | Tipo: Moto";
    }
}