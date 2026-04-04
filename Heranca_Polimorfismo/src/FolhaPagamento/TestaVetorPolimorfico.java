package FolhaPagamento;

public class TestaVetorPolimorfico {
    public static void main(String[] args) {

        Desenvolvedor[] devs = new Desenvolvedor[4];

        devs[0] = new Junior("Beltrano", "Fulano", "Java", 4000);
        devs[1] = new Pleno("Beltrano", "Python", 6000, 5);
        devs[2] = new Senior("Ciclano", "Java", 9000, 20000);
        devs[3] = new Desenvolvedor("Daniel", "C#", 3000);

        for (Desenvolvedor d : devs) {
            d.codar();
            System.out.println("Bônus: " + d.calculaBonus());
            System.out.println(d.toString());
            System.out.println("---------------------------");
        }
    }
}