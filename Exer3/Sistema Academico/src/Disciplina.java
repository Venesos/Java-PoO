import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome, professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public void matricularAluno(Aluno a) {
        alunos.add(a);
    }

    public void criarAvaliacao(int id, String nome) {
        Avaliacao aux = new Avaliacao(id, nome);
        avaliacoes.add(aux);
    }

    public Avaliacao getAvaliacao(int i) {
        return avaliacoes.get(i);
    }

    @Override
    public String toString() {
        return "Disciplina: " + "\n" +
                "id= " + id + "\n" +
                "nome= " + nome + "\n" +
                "professor= " + professor + "\n" +
                "alunos= " + alunos + "\n" +
                "avaliacoes= " + avaliacoes;
    }
}
