public class TestaAcademico {
    public static void main(String[] args) {

        Aluno alu1 = new Aluno(1, "Abner", "123", "ADS");
        Aluno alu2 = new Aluno(2, "Gilmar", "467", "DSM");

        Disciplina dis1 = new Disciplina(1, "Programação Orientada a Objetos", "Daniel Pires");

        dis1.matricularAluno(alu1);
        dis1.matricularAluno(alu2);

        dis1.criarAvaliacao(1,"Prova Semanal");
        Avaliacao av = dis1.getAvaliacao(0);

        av.adicionarQuestao(1, "O que é PoO?", 2.0f);
        av.adicionarQuestao(2, "O que é encapsulamento?", 2.5f);
        av.adicionarQuestao(3, "Diferencie agregação e composição.", 4.0f);

        System.out.println(dis1.toString());
    }
}
