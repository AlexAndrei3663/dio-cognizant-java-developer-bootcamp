import javax.swing.*;

public class ExceptionCustomizada {
    public static void main(String[] args){
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if(numerador[i] %2 != 0)
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro Aritmético", JOptionPane.ERROR_MESSAGE);
            } catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro Indexação", JOptionPane.ERROR_MESSAGE);
            }
        }

        System.out.println("O programa continua...");
    }
}

class DivisaoNaoExataException extends Exception{

    private int numerado;
    private int denominador;

    public DivisaoNaoExataException(String message, int numerado, int denominador) {
        super(message);
        this.numerado = numerado;
        this.denominador = denominador;
    }
}