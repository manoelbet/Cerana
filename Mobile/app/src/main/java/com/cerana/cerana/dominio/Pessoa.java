package com.cerana.cerana.dominio;

public class Pessoa{
    private int id;
    private Usuario usuario;
    private String nome;

    public Pessoa(){
        this.nome = null;
        this.usuario = null;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

