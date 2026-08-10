public class Pedido {
    private final int id;
    private Cliente cliente;
    private ItemPedido[] vetor;

    public Pedido(int id,Cliente cliente,ItemPedido[] vetor) {
        this.id = id;
        this.cliente = cliente;
        this.vetor = vetor;
    }
}
