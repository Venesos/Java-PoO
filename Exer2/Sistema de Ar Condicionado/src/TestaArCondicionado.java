public class TestaArCondicionado {
    public static void main(String[] args) {
        ArCondicionado ac1 = new ArCondicionado("Samsung", "Dual Inverter", 22, true);
        System.out.println();
        System.out.println(ac1);
        ac1.ativarModoTurbo();
        System.out.println(ac1);
        ac1.setLigado(false);
        System.out.println(ac1);

        // Testando com valores impossíveis
        System.out.println();
        System.out.println("Teste com Valores Impossíveis:");
        ArCondicionado ac2 = new ArCondicionado("LG", "WindFree", 35, true);
        System.out.println(ac2);
        ac2.setTemperatura(9);
    }
}
