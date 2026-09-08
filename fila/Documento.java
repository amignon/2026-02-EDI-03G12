public class Documento {
    // atributos
    private String nome;
    private int tamanho;

    // construtor
    public Documento(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public void imprimir() {
        System.out.printf("Imprimindo o documento %15s | Tamanho: %d ...\n",
            nome, tamanho);
    }
    
}
