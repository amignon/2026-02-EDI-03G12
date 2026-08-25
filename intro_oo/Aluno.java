public class Aluno {
    // atributos
    private String nome;
    private double nota1;
    private double nota2;

    // construtor
    public Aluno(String nome) {
        this.nome = nome;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }


    // métodos
    public double calculaMedia() {
        return (nota1 + nota2) / 2;
    }

    public void exibeInfo() {
        System.out.printf("%-15s | %5.2f | %5.2f\n", nome, nota1, nota2);
    } 

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0.0 && nota1 <= 10.0) {
            this.nota1 = nota1;
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0.0 && nota2 <= 10.0) {
            this.nota2 = nota2;
        }
    }
}