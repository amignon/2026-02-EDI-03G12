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
        entrada.close();
    }

    public static boolean bemFormada(String expressao) {
        ArrayStack<Character> pilha = new ArrayStack<Character>();
        int tamanho = expressao.length();
        for (int i = 0; i < tamanho; i++) {
            char c = expressao.charAt(i);
            if (c == '(') {
                pilha.push(c);
            }
            else if (c == ')') {
                if (!pilha.isEmpty()) {
                    pilha.pop();
                }
                else {
                    return false;
                }
            }
        }
        return pilha.isEmpty();
    }
}
