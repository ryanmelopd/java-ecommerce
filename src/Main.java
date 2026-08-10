public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(1,"Ryan","ryanmelop@gmail.com");
        Produto p1 = new Produto(1,"Garrafa",20,10);

        c1.atualizarDados("Ana","anahrc@gmail.com");

        p1.setPreco(20.99);
        p1.adicionarEstoque(5);
    }
}
