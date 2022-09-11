package br.edu.iffar.tarefas;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class Bean {

	
	public String getMsg(){
		return "MSG";
	}
}
