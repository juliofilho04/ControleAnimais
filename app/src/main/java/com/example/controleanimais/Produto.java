package com.example.controleanimais;

import android.util.Log;

import java.util.Date;

public abstract class Produto {
    protected String nome;
    protected Date validade;
    protected int quantidade;

    public Produto (String nome, Date validade, int quantidade) {
        this.nome = nome;
        this.validade = validade;
        this.quantidade = quantidade;
    }

    public boolean verificarValidade() {
        Date hoje = new Date();
         if (validade.after(hoje)){
             Log.i("Produto", "O produto " + nome + " está dentro da validade");
             return true;
         } else {
             Log.i("Produto", "O produto: " + nome + " está vencido.");
             return false;
         }
    }


    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
