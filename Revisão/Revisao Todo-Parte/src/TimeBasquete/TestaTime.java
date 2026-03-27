package TimeBasquete;

public class TestaTime {
    public static void main(String[] args) {
        Atleta a1 = new Atleta(1, "Carlos", "Pivô");
        Time t1 = new Time(1, "Franca", "Paulo");

        System.out.println(a1.toString());
        System.out.println(t1.toString());
        t1.contratarAtleta(a1);
        System.out.println(t1.toString());

        t1 = null;
        System.out.println(t1);
        System.out.println(a1);
    }
}
