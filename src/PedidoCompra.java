import java.util.ArrayList;

public class PedidoCompra {

    private int id;
    private Fornecedor fornecedor;
    private ArrayList<Item> itens;
    private StatusPedido status;

    public PedidoCompra(int id, Fornecedor fornecedor) {
        if (fornecedor == null){
            throw new IllegalArgumentException("Fornecedor não pode ser nulo"); // valida o fornecedor apenas se o valor for nulo
        }
        this.id = id;
        this.fornecedor = fornecedor;
        this.itens = new ArrayList<>();
        this.status = StatusPedido.ABERTO;
    }

    public void adicionarItem(Item item){
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

    @Override
    public String toString() {
        String texto = "Pedido #" + id
                + "\nFornecedor: " + fornecedor
                + "\nStatus: " + status
                + "\nItens:";

        for (Item item : itens) {
            texto += "\n  - " + item;
        }

        texto += "\nTotal: R$ " + String.format("%.2f", calcularTotal());
        return texto;
    }

    //LÓGICA DO PEDIDO APROVADO E RECEBIDO NO SISTEMA

    public void aprovar(){
        if (status != StatusPedido.ABERTO){
            throw new IllegalArgumentException("Só é possível aprovar pedidos com status aberto");
        }
        if (itens.isEmpty()){
            throw new IllegalArgumentException("Pedidos sem itens não pode ser aprovado");
        }
        status = StatusPedido.APROVADO;
    }

    public void receber(){
        if (status != StatusPedido.APROVADO){
            throw new IllegalArgumentException("Só é possível receber pedidos APROVADOS");
        }
        status = StatusPedido.RECEBIDO;
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
