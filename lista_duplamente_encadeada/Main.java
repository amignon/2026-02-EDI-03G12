public class Main {
    public static void main(String [] args) {
        DLinkedList<String> lista = new DLinkedList<>();
        lista.addLast("A");
        lista.addLast("B");
        lista.addLast("C");
        lista.reverse();
        lista.imprime();
    }
}
