package com.example.controleanimais;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Animal implements DistribuicaoAnimais{
    private int id;
    private String especie;
    private int idade;
    protected List<Produto> produto;
    protected List<Produto> produtosConsumidos;

    public Animal(int id, String especie, int idade) {
        this.id = id;
        this.especie = especie;
        this.idade = idade;
        this.produtosConsumidos = new ArrayList<>();
    }

    public void registrarConsumo(Produto p) {
        if (p.quantidade > 0) {
            p.setQuantidade(p.quantidade - 1);
            Log.i("Animal", "Produto " + p.getNome() + " consumido pelo animal " + especie);
            produtosConsumidos.add(p);
        } else {
            Log.i("Animal", "Produto " + p.getNome() + " não está disponível em estoque para consumo.");
        }
    }

}
