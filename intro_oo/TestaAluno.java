public class TestaAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ale");
        Aluno a2 = new Aluno("Mignon", 9.0, 4.5);


        a1.exibeInfo();
        a2.exibeInfo();


        a1.nota1 = 7.0;
        a1.nota2 = 8.0;

        a2.nota1 = 4.5;
        a2.nota2 = 3.0;

        double m1 = a1.calculaMedia();
        double m2 = a2.calculaMedia();

        System.out.printf("A1: %.1f\n", m1);
        System.out.printf("A2: %.1f\n", m2);
    }
}