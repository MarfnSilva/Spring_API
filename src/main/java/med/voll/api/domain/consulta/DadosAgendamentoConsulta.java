package med.voll.api.domain.consulta;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(
        @JsonAlias({"medico_id", "medicoid", "id_medico"})
        Long idMedico,

        @NotNull
        @JsonAlias({"paciente_id", "pacienteid", "id_paciente"})
        Long idPaciente,

        @NotNull
        @Future
//        @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
        LocalDateTime data) {
}
