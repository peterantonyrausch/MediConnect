package main.java.mediconnect.modelo.entidade.consulta;

import java.time.LocalDate;
import java.time.LocalTime;

import main.java.mediconnect.modelo.entidade.especialidadeProfissional.EspecialidadeProfissional;
import main.java.mediconnect.modelo.entidade.instituicao.Instituicao;
import main.java.mediconnect.modelo.entidade.paciente.Paciente;
import main.java.mediconnect.modelo.entidade.profissionalDeSaude.ProfissionalDeSaude;
import main.java.mediconnect.modelo.enumeracao.consulta.StatusConsulta;

public class Consulta {

	// ATRIBUTOS
	private Integer id;
	private EspecialidadeProfissional especialidadeProfissional;
	private Instituicao instituicao;
	private ProfissionalDeSaude profissionalDeSaude;
	private LocalDate data;
	private LocalTime horario;
	private Paciente paciente;
	private StatusConsulta status = StatusConsulta.AGENDADA;

	// CONSTRUTOR
	public Consulta(Integer id, EspecialidadeProfissional especialidadeProfissional, Instituicao instituicao,
			ProfissionalDeSaude profissionalDeSaude, LocalDate data, LocalTime horario, Paciente paciente,
			StatusConsulta status) {
		setId(id);
		setEspecialidadeProfissional(especialidadeProfissional);
		setInstituicao(instituicao);
		setProfissionalDeSaude(profissionalDeSaude);
		setData(data);
		setHorario(horario);
		setPaciente(paciente);
		setStatus(status);
	}
	
	// MÉTODOS DE ACESSO

	// Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	// Especialidade Profissional
	public EspecialidadeProfissional getEspecialidadeProfissional() {
		return especialidadeProfissional;
	}

	public void setEspecialidadeProfissional(EspecialidadeProfissional especialidadeProfissional) {
		this.especialidadeProfissional = especialidadeProfissional;
	}

	// Instituição
	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	// Profissional de Saúde
	public ProfissionalDeSaude getProfissionalDeSaude() {
		return profissionalDeSaude;
	}

	public void setProfissionalDeSaude(ProfissionalDeSaude profissionalDeSaude) {
		this.profissionalDeSaude = profissionalDeSaude;
	}

	// Data
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	// Horário
	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	// Paciente
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	// Status
	public StatusConsulta getStatus() {
		return status;
	}

	public void setStatus(StatusConsulta status) {
		this.status = status;
	}

}
