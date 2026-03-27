package SistemaClinica;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestaClinica {
    public static void main(String[] args) {
        Medico m1 = new Medico(1, "Dr. João", "Cardiologia");
        Paciente p1 = new Paciente(1, "Naldo", "822.349.760-30");

        LocalDateTime data = LocalDateTime.of(2026, 5, 20, 18, 15);
        Consulta c1 = new Consulta(1, data, new BigDecimal("150.00"), m1, p1);

        System.out.println(c1.toString());
    }
}
