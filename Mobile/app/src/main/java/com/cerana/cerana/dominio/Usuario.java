package com.cerana.cerana.dominio;

public class Usuario {
    private String login;
    private String password;
    private int id;
    private String localizazao;
    private String descricao;

    public Usuario() {
        this.login = null;
        this.password = null;
        this.descricao = null;
        this.localizazao = null;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {return descricao; }

    public String getLocalizazao() {return localizazao; }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {this.descricao = descricao; }

    public void setLocalizazao(String localizazao) {this.localizazao = localizazao; }
}

