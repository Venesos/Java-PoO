package CineTeatro;

import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {
        Filme f1 = new Filme(1, "Batman", "Ação", 120);
        Filme f2 = new Filme(2, "Duna", "Ficção", 150);

        Sessao s1 = new Sessao(1, LocalDateTime.of(2026, 7, 20, 20, 0), 1);

        s1.vincularFilme(f1);
        s1.venderIngresso(1, "A1", "Inteira", 30);
        s1.venderIngresso(2, "A2", "Meia", 15);
        s1.venderIngresso(3, "A3", "Inteira", 30);

        System.out.println(s1);
    }
}
