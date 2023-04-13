package med.voll.api.domain.consulta;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    boolean existsBypacienteIdAndDataBetween(Long idPaciente, LocalDateTime primeiroHorario, LocalDateTime ultimosHorario);

    boolean existsByMedicoIdAndData(Long idMedico, LocalDateTime data);

}
