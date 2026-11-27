public class Item {

    private String descricao;
    private int quantidade;
    private double valorUnitario;


    public Item(String descricao, int quantidade, double valorUnitario) {
        if (descricao == null || descricao.isBlank()){
            throw new IllegalArgumentException("Descrição não pode ser nula ou vazia ");
        }
        if (quantidade <= 0 ){
            throw new IllegalArgumentException("Quantidade precisa ser maior que 0");
        }
        if (valorUnitario <= 0){
            throw new IllegalArgumentException("valor unitário precisa ser maior que 0");
        }

        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public double calcularSubtotal(){
        return quantidade * valorUnitario;
    }

}
