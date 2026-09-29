public class EliminacaoConsecutivos {
    public static void main(String[] args) {
        String str = "ABBACA";
        String resultado = eliminaConsecutivos(str);
        System.out.println(resultado);
        
    }

    public static String eliminaConsecutivos(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        MyDeque<Character> deque = new CircularArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char atual = s.charAt(i);

            if (!deque.isEmpty() && deque.peekLast() == atual) {
                deque.removeLast();
            }
            else {
                deque.addLast(atual);
            }
        }

        StringBuilder resultado = new StringBuilder();
        while (!deque.isEmpty()) {
            resultado.append(deque.removeFirst());
        }

        return resultado.toString();
    }
}
