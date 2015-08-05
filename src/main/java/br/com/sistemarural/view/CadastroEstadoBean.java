package br.com.sistemarural.view;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.sistemarural.model.entidade.Estado;

@ManagedBean
@ViewScoped
public class CadastroEstadoBean {
	private Estado estado = new Estado();

	public String cadastrar() {
		this.estado = new Estado();
		String msg = "Cadastro realizado com sucesso";
		FacesContext.getCurrentInstance().addMessage(null, new 
				FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg));
		return "index";
	}

	public Estado getEstado() {
		return estado;
	}
	
}
