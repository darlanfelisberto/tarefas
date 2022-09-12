package br.edu.iffar.tarefas;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.inject.Produces;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.sql.DataSource;
import javax.transaction.Transactional;

import br.edu.iffar.tarefas.models.TipoTarefa;
import java.io.Serializable;

@Named
@ViewScoped
public class Bean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	List<Integer> listNumeros = new ArrayList<>();
	private Integer valor = null;
	private Integer contador = null;
	
	@PersistenceContext(unitName = "baseTarefasUnit")
    @Produces
	private static EntityManager em;
	
	public Bean() {
		for (int i = 0; i < 100; i++) {
			listNumeros.add(i);
		}
	}
	
	@Transactional
	public void addMaisUm() {
		TipoTarefa tt = new TipoTarefa();
		tt.setDescricao("descricao");
		tt.setNome("nome");
		
		em.persist(tt);
	
		contador++;
		System.out.println("chamou");
	}
	
	public String getMsg(){
		return "MSG";
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Integer getContador() {
		return contador;
	}

	public void setContador(Integer contador) {
		this.contador = contador;
	}

	public List<Integer> getListNumeros() {
		return listNumeros;
	}

	public void setListNumeros(List<Integer> listNumeros) {
		this.listNumeros = listNumeros;
	}
	
	
}
