package EdificioApartamentos;

public class TestaEdificio {
    public static void main(String[] args) {

        Edificio e1 = new Edificio("Residencial Sol", "Rua 4");

        e1.construirApartamento(101, 1);
        e1.construirApartamento(202, 2);

        System.out.println(e1);
    }
}
