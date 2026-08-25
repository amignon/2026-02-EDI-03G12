import java.util.Scanner;

public class TestaPilha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Expressão: ");
        String expressao = entrada.nextLine();
        if (bemFormada(expressao)) {
            System.out.println("Bem formada!");
        }
        else {
            System.out.println("Inválida!");
        }
    }

    public static boolean bemFormada(String expressao) {

    }
}
