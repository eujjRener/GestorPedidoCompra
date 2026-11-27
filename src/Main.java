public class Main {
    public static void main(String[] args) {
      try{
          Fornecedor fornecedor1 = new Fornecedor("Parafusos Silva", "45336789101112");
          PedidoCompra pedidoCompra1 = new PedidoCompra(1,fornecedor1);

          pedidoCompra1.adicionarItem(new Item("Parafuso", 100, 0.50));
          pedidoCompra1.adicionarItem(new Item("Porca", 50, 0.50));

          System.out.println("Pedido " + pedidoCompra1.getId());
          System.out.println("Fornecedor " + pedidoCompra1.getFornecedor().getNome());
          System.out.println("Status " + pedidoCompra1.getStatus());
          System.out.println("Total " + pedidoCompra1.calcularTotal());


      } catch (IllegalArgumentException e){
          System.out.println("erro : " + e.getMessage());
      }
    }
}