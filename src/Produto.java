public class Produto {
    public String nome;
    public double preco;
    public int quantidadeEmEstoque;

    public Produto() {}
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void alterarQuantidade(int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
    }

    public String exibirInformacoes() {
        return "O produto " + this.nome + " custa R$" + this.preco + ", e temos o total de " + this.quantidadeEmEstoque + (this.quantidadeEmEstoque == 1 ? " disponível no estoque." : " disponíveis no estoque.");
    }

    public static void exercicio_4() {
        Produto pastaDeDente = new Produto();
        pastaDeDente.nome = "Pasta de Dente";
        pastaDeDente.preco = 3.50;
        pastaDeDente.quantidadeEmEstoque = 20;
        pastaDeDente.alterarQuantidade(19);
        pastaDeDente.alterarPreco(4.50);
        System.out.println(pastaDeDente.exibirInformacoes());
    }

    public static void exercicio_5() {
        Produto kitkat = new Produto();
        kitkat.setNome("KitKat");
        kitkat.setPreco(4);
        kitkat.setQuantidadeEmEstoque(30);
        System.out.println("nome do produto através do 'getNome': " + kitkat.getNome());
        System.out.println("preço do produto através do 'getPreco': " + kitkat.getPreco());
        System.out.println("quantidade do produto através do 'getQuantidadeEmEstoque': " + kitkat.getQuantidadeEmEstoque());
    }

    public static void exercicio_6() {
        Produto sabonete = new Produto("sabonete", 2.50, 50);
        System.out.println(sabonete.exibirInformacoes());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

}
