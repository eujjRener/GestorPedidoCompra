import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
      try{
          Fornecedor fornecedor1 = new Fornecedor("Parafusos Silva", "45367892101112");
          PedidoCompra pedidoCompra1 = new PedidoCompra(1,fornecedor1);

          Fornecedor fornecedor2 = new Fornecedor("Jonathan TI", "45336792101112");
          PedidoCompra pedidoCompra2 = new PedidoCompra(2, fornecedor2);

          pedidoCompra1.adicionarItem(new Item("Parafuso", 100, 0.50));
          pedidoCompra1.adicionarItem(new Item("Porca", 50, 0.50));

          pedidoCompra2.adicionarItem(new Item("Computador", 20, 1555));

          System.out.println(pedidoCompra1);
          System.out.println(pedidoCompra2);

      } catch (IllegalArgumentException e){
          System.out.println("erro : " + e.getMessage());
      }
    }
}