package VendasMercado;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private ArrayList<ItemVenda> itensVenda;

    public Venda() {
        this.itensVenda = new ArrayList<>();
    }

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.itensVenda = new ArrayList<>();
    }

    public void adicionaItemVenda(int id, int qtde, Produto produto){
        ItemVenda aux = new ItemVenda(id, qtde, produto);
        this.itensVenda.add(aux);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(ArrayList<ItemVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "cliente=" + cliente +
                ", itensVenda=" + itensVenda +
                '}';
    }
}
