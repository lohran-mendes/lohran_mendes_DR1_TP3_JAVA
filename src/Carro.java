public class Carro {
    public String nome;
    public String marca;

    public Carro(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public String buzinar() {
        return "O " + nome + " da marca " + marca + " está buzinando!";
    }

    // Exemplo da criação de objeto a partir da classe declarada
    public static void exercicio_1(){
        System.out.println("\nExercicio 1:");
        Carro carro1 = new Carro("HB20", "Hyundai");
        Carro carro2 = new Carro("Virtus", "Volkswagen");
        System.out.println(carro1.buzinar());
        System.out.println(carro2.buzinar());
    }
}
