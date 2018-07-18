package br.edu.ifpe.controller;


import br.edu.ifpe.model.classes.Endereco;
import br.edu.ifpe.model.classes.Usuario;
import br.edu.ifpe.model.validation.UsuarioModel;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean
@SessionScoped
public class UsuarioController implements Serializable{

    private UsuarioModel instance;
    private Usuario cadUsuario;
    private Endereco end;
    private Usuario selectdUsuario;

    public UsuarioController() {
        cadUsuario = new Usuario();
        end = new Endereco();
    }

    public String registrarUsuario() throws Exception {
        cadUsuario.setEndereco(end);
        this.instance.inserir(this.cadUsuario);
        this.cadUsuario = new Usuario();
        return null;
    }

    public UsuarioModel getInstance() {
        return instance;
    }

    public void setInstance(UsuarioModel instance) {
        this.instance = instance;
    }

    public Usuario getCadUsuario() {
        
        return cadUsuario;
    }

    public void setCadUsuario(Usuario cadUsuario) {
        this.cadUsuario = cadUsuario;
    }

    public Usuario getSelectdUsuario() {
        return selectdUsuario;
    }

    public void setSelectdUsuario(Usuario selectdUsuario) {
        this.selectdUsuario = selectdUsuario;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }



}
