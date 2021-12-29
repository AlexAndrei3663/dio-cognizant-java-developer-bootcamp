package exercicios;
/**
 * Exercício proposto na aula 1 do curso Entendendo Métodos em Java
 * - Calcule as 4 operações basicas: soma, subtracão, multiplicação e divisão
 *      -> Devem ser passados dois valores como parametros
 * - Informe a mensagem adequada a partir da hora: Bom dia, Boa tarde, Boa noite.
 * - Calcule o valor final de um emprestimo a partir do valor solicitado.
 *      -> Taxas e parcelas influenciam
 *      -> Defina arbitrariamente as faixas que influenciam nos valores
 */

public class Aula1{
 // Metodo para realizar a soma de dois valores
    public static double soma(double x, double y) {
        return x + y;
    }

    // Metodo para realizar a subtração de dois valores
    public static double subtracao(double x, double y) {
        return x - y;
    }

    // Metodo para realizar a multiplicação de dois valores
    public static double multiplicacao(double x, double y) {
        return x * y;
    }

    // Metodo para realizar a divisão de dois valores
    public static double divisao(double x, double y) {
        return x / y;
    }

    // Metodo para mostrar a faixa do dia correspondente
    public static void faixaDia(int hora) {
        if (hora>0 && hora<=6) {
            System.out.println("Boa madrugada!");
        }
        else if (hora>6 && hora<=12) {
            System.out.println("Bom dia!");
        }
        else if (hora>12 && hora<=18) {
            System.out.println("Boa tarde!");
        } 
        else if(hora>18 && hora<=24){
            System.out.println("Boa noite!");
        }
        else{
            System.out.println("Horario invalido");
        }
    }

    // Metodo para calcular o valor de um emprestimo
    public static double valorEmprestimo(double valorSolicitado, int parcelas) {
        float taxa = 1.5f;
        double valor = valorSolicitado + valorSolicitado * taxa * parcelas;
        return valor;
    }
}
