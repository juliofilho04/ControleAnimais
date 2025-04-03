package com.example.controleanimais;

public interface GerenciadorEstoque {
    public void adicionarProduto(Produto p);
    public void removerProduto(Produto p);
    public void gerarAlerta();
}
