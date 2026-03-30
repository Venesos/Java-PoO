package ComputadorComponentes;

public class TestaComponentes {
    public static void main(String[] args) {

        Computador c1 = new Computador(1, "PC Custo Benefício");

        System.out.println(c1);

        c1 = null;
        System.out.println(c1);
    }
}
