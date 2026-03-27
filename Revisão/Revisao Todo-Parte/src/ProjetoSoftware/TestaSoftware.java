package ProjetoSoftware;

public class TestaSoftware {
    public static void main(String[] args) {
        Programador pg1 = new Programador(1, "Abner", "Kotlin");
        Projeto pj1 = new Projeto(1, "Modificação");

        System.out.println(pg1.toString());
        System.out.println(pj1.toString());

        pj1.contratarProgramador(pg1);
        System.out.println(pj1.toString());
    }
}
