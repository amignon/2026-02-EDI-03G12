import java.util.ArrayList;
public class Turma_ArrayList {
    // atributos
    private String codigo;
    private ArrayList<Aluno> alunos;

    // construtor
    public Turma_ArrayList(String codigo) {
        this.codigo = codigo;
        this.alunos = new ArrayList<Aluno>();
    }

    // métodos
    public void adicionaAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public double calculaMediaTurma() {
        double soma = 0.0;
        for (Aluno aluno : alunos) {
            soma += aluno.calculaMedia();
        }
        return soma / alunos.size();
    }
    
}
