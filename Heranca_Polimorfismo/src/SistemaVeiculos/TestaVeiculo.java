package SistemaVeiculos;

public class TestaVeiculo {
    public static void main(String[] args) {

        Veiculo v;

        v = new Aviao("Boeing", "747", 900, 12000);
        v.mover();

        v = new CarroEletrico("Tesla", "Model S", 120, 500);
        v.mover();

    }
}
