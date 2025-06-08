public class Main {
    public static void main(String[] args) {

        Carro.exercicio_1();
        Produto.exercicio_4();
        Produto.exercicio_5();
        Produto.exercicio_6();
        Conta.exercicio9();
        exercicio12();
    }

    public static void exercicio12() {
        System.out.println("\nExercício 12");
        Circulo circulo = new Circulo();
        circulo.raio = 3.0;
        Esfera esfera = new Esfera();
        esfera.raio = 5.0;

        System.out.println("Área do circulo com " + circulo.raio + " de raio: " + circulo.calcularArea());
        System.out.println("Volume da esfera com " + esfera.raio + " de raio: " + esfera.calcularVolume());
    }
}