package SistemaBiblioteca;

import java.time.LocalDate;

public class TestaBiblioteca {
    public static void main(String[] args) {
        Leitor le1 = new Leitor(1, "Lucas");
        Livro li1 = new Livro(1, "Introdução à Linguagem SQL", "Thomas Nield");

        Emprestimo e1 = new Emprestimo(1, LocalDate.now(), LocalDate.now().plusDays(7), le1, li1);

        System.out.println(e1.toString());
    }
}
