public class FilaImpressao {
    public static void main(String[] args) {
        MyQueue<Documento> fila = new CircularArrayQueue<>();
        Documento docA = new Documento("A", 10);
        fila.enqueue(docA);

        fila.enqueue(new Documento("B", 5));
        fila.enqueue(new Documento("C", 7   ));

        while (!fila.isEmpty()) {
            Documento doc = fila.dequeue();
            doc.imprimir();
        }
        System.out.println("Fim do programa.");
    }
}
