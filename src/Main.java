import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String divertido = ":-)";
        String chateado = ":-(";

        //Interagindo com o usuário
        System.out.print("Entrada: ");
        String entrada = ler.nextLine();

        int riso = numeroDeExpressao(entrada, divertido);
        int tristeza = numeroDeExpressao(entrada, chateado);

        String saida;

        if (riso > tristeza)
            saida = "divertido";
        else if (riso < tristeza)
            saida = "chateado";
        else saida = "neutro";

        System.out.println("Saída: " + saida);
    }

    //Método que conta o número que uma expressão(exp) aparece em uma string
    static int numeroDeExpressao(String string, String exp) {
        int contador = 0;

        //Percorre toda a string procurando a expressão
        for (int i = 0; i < string.length()-2; i++)
            if (string.charAt(i) == exp.charAt(0) && string.charAt(i+1) == exp.charAt(1) && string.charAt(i+2) == exp.charAt(2)){
                contador++;
            }

        return contador;
    }
}