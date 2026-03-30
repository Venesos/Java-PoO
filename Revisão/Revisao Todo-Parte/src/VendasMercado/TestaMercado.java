package VendasMercado;

public class TestaMercado {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(1, "Cleber");

        Produto p1 = new Produto(1, "Arroz", 20);
        Produto p2 = new Produto(2, "Feijão", 10);

        Venda v1 = new Venda(c1);
        v1.adicionaItemVenda(1, 2, p1);
        v1.adicionaItemVenda(2, 3, p2);

        System.out.println(v1);
    }
}
