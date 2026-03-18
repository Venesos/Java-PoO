public class TestaDrone {
    public static void main(String[] args) {
        Drone d1 = new Drone("DR001", 0, 50, false);
        System.out.println();
        System.out.println(d1);
        d1.decolar();
        System.out.println(d1);
        d1.subir(10);
        System.out.println(d1);
        d1.descer(10);
        System.out.println(d1);
        d1.descer(10);
        System.out.println(d1);

    }
}
