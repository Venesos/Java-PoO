package SistemaClinica;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private int id;
    private LocalDateTime data;
    private BigDecimal ValorDaConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta() {
    }

    public Consulta(int id, LocalDateTime data, BigDecimal valorDaConsulta, Medico medico, Paciente paciente) {
        this.id = id;
        this.data = data;
        ValorDaConsulta = valorDaConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        data = data;
    }

    public BigDecimal getValorDaConsulta() {
        return ValorDaConsulta;
    }

    public void setValorDaConsulta(BigDecimal valorDaConsulta) {
        ValorDaConsulta = valorDaConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'm");
        return "Consulta{" +
                "id=" + id +
                ", data=" + data.format(formatoBR) +
                ", ValorDaConsulta=" + ValorDaConsulta +
                ", \nmedico=" + medico +
                ", \npaciente=" + paciente +
                '}';
    }
}
