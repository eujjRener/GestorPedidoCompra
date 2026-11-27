import java.util.ArrayList;

public class PedidoCompra {

    private int id;
    private Fornecedor fornecedor;
    private ArrayList<Item> itens;
    private StatusPedido status;

    public PedidoCompra(int id, Fornecedor fornecedor, ArrayList<Item> itens, StatusPedido status) {
        if (fornecedor == null){
            throw new IllegalArgumentException("Fornecedor não pode ser nulo"); // valida o fornecedor apenas se o valor for nulo
        }
        this.id = id;
        this.fornecedor = fornecedor;
        this.itens = itens;
        this.status = status;
    }

    public void adicionaritem(Item item){
        if (item == null){
            throw new IllegalArgumentException("Item não pode ser nulo");
        }
        itens.add(item);
    }

    public double calcularTotal(){
        double total = 0; // cria aqui um valor para ir somando quando for rodando o loop
        for (Item item : itens){ //pra cada item (dentro da classe Item)
            total += item.calcularSubtotal();
        }
        return total;
    }

    public int getId() {
        return id;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }
}
