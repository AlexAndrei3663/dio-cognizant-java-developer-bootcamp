package exercicios;

/**
 * Exercício proposto na aula 3 do curso Logica Condicional e Controle de Fluxos em Java
 * - Com if, exiba o nome do mês de acordo com o seu numero.
 * - Faça também outro if que verifique se o mês é Julho, Dezembro ou Janeiro.
 *   Se for um dos meses exiba "Ferias".
 * - Com switch, use String para a partir do dia da semana, exibir seu número.
 * - Ainda no switch, exibir uma mensagem de ocordo com o número.
 *      -> 1 - 3: "Certo"
 *      -> 4: "Errado"
 *      -> 5: "Talvez"
 *      -> Demais valores: "Valor Indefinido" 
 */

public class Aula3 {
    // Método para mostrar o mês a partir do número
    public static void mesAno(int mes) {
        if (mes == 1) {
            System.out.println("O mês é Janeiro!");
        }
        else if(mes == 2){
            System.out.println("O mês é Fevereiro!");
        }
        else if(mes == 3){
            System.out.println("O mês é Março!");
        }
        else if(mes == 4){
            System.out.println("O mês é Abril!");
        }
        else if(mes == 5){
            System.out.println("O mês é Maio!");
        }
        else if(mes == 6){
            System.out.println("O mês é Junho!");
        }
        else if(mes == 7){
            System.out.println("O mês é Julho!");
        }
        else if(mes == 8){
            System.out.println("O mês é Agosto!");
        }
        else if(mes == 9){
            System.out.println("O mês é Setembro!");
        }
        else if(mes == 10){
            System.out.println("O mês é Outubro!");
        }
        else if(mes == 11){
            System.out.println("O mês é Novembro!");
        }
        else if(mes == 12){
            System.out.println("O mês é Desembro");
        }
    }

    // Método para mostrar mensagem de férias a partir do numero do mês
    public static void ferias(int mes) {
        if (mes == 7 || mes == 12 || mes == 1) {
            System.out.println("Ferias");
        }
    }

    // Método para mostrar o dia da semana a partir do nome do dia
    public static void semana(String dia) {
        switch (dia) {
            case "Domingo":
                System.out.println("Dia da semana é o numero 1");
                break;

            case "Segunda":
                System.out.println("Dia da semana é o numero 2");
                break;
        
            case "Terça":
                System.out.println("Dia da semana é o numero 3");
                break;

            case "Quarta":
                System.out.println("Dia da semana é o numero 4");
                break;

            case "Quinta":
                System.out.println("Dia da semana é o numero 5");
                break;

            case "Sexta":
                System.out.println("Dia da semana é o numero 6");
                break;

            case "Sabado":
                System.out.println("Dia da semana é o numero 7");
                break;

            default:
                System.out.println("Dia invalido");
                break;
        }
    }

    // Método para mostrar mensagem a partir do número
    public static void mensagemNumero(int num) {
        switch (num) {
            case 1,2,3:
                System.out.println("Certo");
                break;
        
            case 4:
                System.out.println("Errado");
                break;

            case 5:
                System.out.println("Talvez");
                break;

            default:
                System.out.println("Valor Indefinido");
                break;
        }
    }
}
