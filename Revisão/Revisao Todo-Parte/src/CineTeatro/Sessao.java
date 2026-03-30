package CineTeatro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;
    private Filme filme;
    private ArrayList<Ingresso> ingressos;

    public Sessao() {
        this.ingressos = new ArrayList<>();
    }

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>();
    }

    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    public void venderIngresso(int id, String assento, String tipo, float preco) {
        ingressos.add(new Ingresso(id, assento, tipo, preco));
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR =
                DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'm");

        return "Sessao{" +
                "id=" + id +
                ", horario=" + horario.format(formatoBR) +
                ", sala=" + sala +
                ", \nfilme=" + filme +
                ", \ningressos=" + ingressos +
                '}';
    }
}
