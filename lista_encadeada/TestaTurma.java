public class TestaTurma {
    public static void main(String[] args) {
        /*
        Turma_ArrayList turma1 = new Turma_ArrayList("03G");

        turma1.adicionaAluno(new Aluno("A", 9.0, 8.5));
        turma1.adicionaAluno(new Aluno("B", 6.5, 7.0));
        turma1.adicionaAluno(new Aluno("C", 6.0, 4.0));
        

        double mt = turma1.calculaMediaTurma();
        System.out.printf("Média da turma: %.2f\n", mt);
        */

        TurmaLinkedList turma2 = new TurmaLinkedList("03G");
        turma2.adicionaAluno(new Aluno("A", 9.0, 8.5));
        turma2.adicionaAluno(new Aluno("B", 6.5, 7.0));
        turma2.adicionaAluno(new Aluno("C", 6.0, 4.0));
        double mt = turma2.calculaMediaTurma();
        System.out.printf("Média da turma: %.2f\n", mt);

    }
}
