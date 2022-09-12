package br.edu.iffar.tarefas.models;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tarefas")
public class Tarefa {

	@Id
	@GeneratedValue
	@Column(name = "id_tarefa", updatable = false)
	private Integer idTarefa;
	
	private String titulo;
	
	private String decricao;
	
	@Column(name = "dt_inicio")
	private LocalDateTime dtInico;
	
	@Column(name = "dt_fim")
	private LocalDateTime dtFim;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private TipoTarefa tipoTarefa ;

	public Integer getIdTarefa() {
		return idTarefa;
	}

	public void setIdTarefa(Integer idTarefa) {
		this.idTarefa = idTarefa;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDecricao() {
		return decricao;
	}

	public void setDecricao(String decricao) {
		this.decricao = decricao;
	}

	public LocalDateTime getDtInico() {
		return dtInico;
	}

	public void setDtInico(LocalDateTime dtInico) {
		this.dtInico = dtInico;
	}

	public LocalDateTime getDtFim() {
		return dtFim;
	}

	public void setDtFim(LocalDateTime dtFim) {
		this.dtFim = dtFim;
	}

	public TipoTarefa getTipoTarefa() {
		return tipoTarefa;
	}

	public void setTipoTarefa(TipoTarefa tipoTarefa) {
		this.tipoTarefa = tipoTarefa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idTarefa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(idTarefa, other.idTarefa);
	}
	
}
