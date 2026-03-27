package ProjetoSoftware;

import TimeBasquete.Atleta;

import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> programadores;

    public Projeto() {
        new ArrayList<>();
    }

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.programadores = new ArrayList<>();
    }

    public void contratarProgramador(Programador a){
        programadores.add(a);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public ArrayList<Programador> getProgramadores() {
        return programadores;
    }

    public void setProgramadores(ArrayList<Programador> programadores) {
        this.programadores = programadores;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "id=" + id +
                ", nomeProjeto='" + nomeProjeto + '\'' +
                ", programadores=" + programadores +
                '}';
    }
}
