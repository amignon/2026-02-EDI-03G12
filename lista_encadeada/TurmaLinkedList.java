import java.util.ArrayList;

public class TurmaLinkedList {
    // atributos
    private String codigo;
    private SLinkedList<Aluno> alunos;

    // construtor
    public TurmaLinkedList(String codigo) {
        this.codigo = codigo;
        this.alunos = new SLinkedList<>();
    }

    // métodos
    public void adicionaAluno(Aluno aluno) {
        alunos.addFirst(aluno);
    }

    public double calculaMediaTurma() {
        double soma = 0.0;
        Aluno aluno;
        Node<Aluno> no = alunos.head();
        while (no != null) {
            aluno = no.getElement();
            soma +=  aluno.calculaMedia();
            no = no.getNext();
        }
        return soma / alunos.size();
    }
}
