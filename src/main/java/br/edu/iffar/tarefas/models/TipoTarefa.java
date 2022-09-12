package br.edu.iffar.tarefas.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_tarefas",schema = "public")
public class TipoTarefa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_tarefa")
	private Integer idTipoTarefa;

	private String descricao;
	
	private String nome;
	
	public TipoTarefa() {
		super();
	}

	public Integer getIdTipoTarefa() {
		return idTipoTarefa;
	}

	public void setIdTipoTarefa(Integer idTipoTarefa) {
		this.idTipoTarefa = idTipoTarefa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idTipoTarefa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoTarefa other = (TipoTarefa) obj;
		return Objects.equals(idTipoTarefa, other.idTipoTarefa);
	}
}
