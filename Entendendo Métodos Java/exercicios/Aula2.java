package exercicios;
/**
 * Exercício proposto na aula 2 do curso Entendendo Métodos em Java
 * - Calcular a area de 3 quadrilateros:
 *      -> Quadrado
 *      -> Retângulo
 *      -> Trápesio
 * - Usar sobrecarga
 */


public class Aula2 {
    // Método para calcular area de um quadrado
    public static double calcularArea(double lado) {
        return lado * lado;
    }

    // Método para calcular a area de um retangulo
    public static double calcularArea(double lado1, double lado2) {
        return lado1 * lado2;
    }

    // Método para calcular a area de um trápesio
    public static double calcularArea(double baseMenor, double baseMaior, double altura) {
        double area = (baseMenor + baseMaior) * altura / 2;
        return area;
    }
}
