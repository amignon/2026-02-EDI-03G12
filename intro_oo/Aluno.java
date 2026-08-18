public class Aluno {
    // atributos
    private String nome;
    public double nota1;
    public double nota2;

    // construtor
    public Aluno(String n) {
        nome = n;
        nota1 = 0.0;
        nota2 = 0.0;
    }

    // métodos
    public double calculaMedia() {
        return (nota1 + nota2) / 2;
    }
}