package com.cerana.cerana.gui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.cerana.cerana.R;
import com.cerana.cerana.negocio.SessaoUsuario;

public class PerfilActivity extends AppCompatActivity {

    private TextView tvNome;
    private SessaoUsuario sessaoUsuario;
    private TextView tvPerguntas;
    private TextView tvRespostas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        tvNome = (TextView)findViewById(R.id.tv_nome);
        tvPerguntas = (TextView)findViewById(R.id.tv_nperguntas);
        tvRespostas = (TextView)findViewById(R.id.tv_nrespostas);

        sessaoUsuario = new SessaoUsuario(getApplicationContext());
        sessaoUsuario.iniciarSessao(getApplicationContext());
        setTextos();
        setValores();
    }

    public void setTextos(){
        String pessoa = sessaoUsuario.getUsuarioLogado().getNome();
        if (!(pessoa == null)){
            tvNome.setText(sessaoUsuario.getUsuarioLogado().getNome());
        }

    }
    public void setValores(){
        String pessoa= sessaoUsuario.getUsuarioLogado().getNome();
        if (!(pessoa == null)){
            tvRespostas.setText("0");
            tvPerguntas.setText("0");
        }
    }
}
