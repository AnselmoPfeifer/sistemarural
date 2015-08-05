package br.com.sistemarural.view;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.sistemarural.model.entidade.Estado;

@ManagedBean
@ViewScoped
public class ConsultaEstadoBean {
	private List<Estado> estados = new ArrayList<Estado>();

	public void delete(){
		this.estados.remove(estados);
	}
	@PostConstruct
	public void inicializar() {
		for (int i = 0; i < 20; i++) {
			estados.add(null);
		}
	}
	
	public List<Estado> getEstados() {
		return estados;
	}

}
