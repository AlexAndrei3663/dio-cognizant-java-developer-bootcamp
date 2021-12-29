package exercicios;

public class Main {
    public static void main(String[] args) {
        exerciciosAula1();
        exerciciosAula2();
    }

    // Método para execultar os exercicios realizados na aula 1
    public static void exerciciosAula1() {
        System.out.println("\nExercicios realizados na aula 1");
        // Primeiro exercicio: Realizar as 4 operações basicas
        double soma = Aula1.soma(5.5, 10.5);
        double subtracao = Aula1.subtracao(10.5, 5.5);
        double multiplicacao = Aula1.multiplicacao(2.2, 5.5);
        double divisao = Aula1.divisao(18, 4.5);

        System.out.println("Soma: 5.5 + 10.5 = " + soma);
        System.out.println("Subtração: 10.5 - 5.5 = " + subtracao);
        System.out.println("Multiplicação: 2.2 * 5.5 = " + multiplicacao);
        System.out.println("Divisão: 18 / 4.5 = " + divisao);

        // Segundo exercicio: Mostrar mensagem correspondente a hora do dia
        System.out.println("\nPeriodo do dia: ");
        Aula1.faixaDia(3);
        Aula1.faixaDia(11);
        Aula1.faixaDia(16);
        Aula1.faixaDia(22);
        Aula1.faixaDia(30);

        // Terceiro exercicio: Realizar calculo de um emprestimo
        double emprestimo = Aula1.valorEmprestimo(1000, 5);
        System.out.println("\nEmprestimo de 1000 com 5 parcelas: " + emprestimo);
    }

    // Método para execultar os exercicios realizados na aula 2
    public static void exerciciosAula2() {
        System.out.println("\nExercicios realizados na aula 2");
        // Calcular a area de um quadrado, retangulo e trapesio
        double quadrado = Aula2.calcularArea(10);
        double retangulo = Aula2.calcularArea(10, 20);
        double trapesio = Aula2.calcularArea(5, 15, 10);

        System.out.println("Area de um quadrado de lado 10: " + quadrado);
        System.out.println("Area de um retangulo de lados 10 e 20: " + retangulo);
        System.out.println("Area de um trapesio de bases 5 e 15 e altura 10: " + trapesio);
    }
}
