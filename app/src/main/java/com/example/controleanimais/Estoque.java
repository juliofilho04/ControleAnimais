package com.example.controleanimais;

import android.util.Log;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Estoque implements GerenciadorEstoque {
    protected List<Produto> produto;

    public Estoque() {
        this.produto = new ArrayList<>();
    }

    @Override
    public void adicionarProduto(Produto p) {
        produto.add(p);
        Log.i("Estoque", "Produto " + p.getNome() + " adicionado ao estoque.");
    }

    @Override
    public void removerProduto(Produto p) {
        if (produto.remove(p)) {
            Log.i("Estoque", "Produto " + p.getNome() + " removido do estoque.");
        } else {
            Log.i("Estoque", "Produto não encontrado no estoque.");
        }

    }

    @Override
    public void gerarAlerta() {
        for (Produto p : produto) {
            if (!p.verificarValidade()) {
                Log.i("Estoque", "O produto: " + p.getNome() + " está vencido.");
            }
            if (p.getQuantidade() <= 5) {
                Log.i("Estoque", "O estoque de: " + p.getNome() + " está baixo.");
            }
        }

    }
}
