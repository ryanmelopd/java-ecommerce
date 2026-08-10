public class Produto {
    private final int id;
    private String nome;
    private double preco;
    private int estoque;

    public Produto(int id,String nome,double preco,int estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getEstoque() {
        return estoque;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
        }
    }
    public void removerEstoque(int quantidade) {
        if(quantidade > 0 && quantidade <= this.estoque) {
            this.estoque -= quantidade;
        }
    }
}
