import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Exercício proposto na aula List do cursos Trabalhando com Collections Java
 * 
 * Faça um programa que receba a temperatura média dos 6 primeiros
 * meses do ano e armazene-os em uma lista. 
 * Após isto, calcule a média semestral das temperaturas e mostre
 * todas as temperaturas acima desta média, e em que mês elas ocorreram 
 * ( mostre o mes por extenso: 1 - Janeiro, 2 - Fevereiro, ...)
 */

public class TemperaturaMedia {
    public static void main(String[] args) {
        List<Temperatura> minhaTemp = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        double tempMes;
        for ( int i = 0; i < 6; i++){
            System.out.println("Insira a temperatura referente ao mes " + converterExtenso(i+1));
            tempMes = scan.nextDouble();
            minhaTemp.add(new Temperatura(converterExtenso(i+1), tempMes));
        }

        double soma = 0.0;
        for (Temperatura tempInteracao : minhaTemp){
            soma += tempInteracao.getTemp();
        }

        double media = soma/minhaTemp.size();
        System.out.println("A media semestral da temperatura eh " + media);

        for (Temperatura tempInteracao : minhaTemp){
            if (tempInteracao.getTemp() > media)
                System.out.println(tempInteracao.toString());
        }
    }

    public static String converterExtenso(int mes) {
        String mesExtenso;
        switch(mes){
            case 1:
                mesExtenso = "Janeiro";
                break;
            case 2:
                mesExtenso = "Fevereiro";
                break;
            case 3:
                mesExtenso = "Março";
                break;
            case 4:
                mesExtenso = "Abril";
                break;
            case 5:
                mesExtenso = "Maio";
                break;
            case 6:
                mesExtenso = "Junho";
                break;
            case 7:
                mesExtenso = "Julho";
                break;
            case 8:
                mesExtenso = "Agosto";
                break;
            case 9:
                mesExtenso = "Setembro";
                break;
            case 10:
                mesExtenso = "Outubro";
                break;
            case 11:
                mesExtenso = "Novembro";
                break;
            case 12:
                mesExtenso = "Dezembro";
                break;
            default:
                System.out.println("Mes invalido");
                mesExtenso = null;
        }
        return mesExtenso;
    }
}

class Temperatura {
    private String mes;
    private Double temp;

    public Temperatura(String mes, double temp) {
        this.mes = mes;
        this.temp = temp;
    }

    public String getMes() {
        return mes;
    }

    public Double getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        String strTemp = mes + ": " + temp;
        return strTemp;
    }
}
