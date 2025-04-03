package com.example.controleanimais;

import android.util.Log;

import java.util.Date;

public class Relatorio {
    private Date dataGeracao;

    public Relatorio() {
        this.dataGeracao = new Date();
    }

    public void gerarRelatorio() {
        Log.i("Relatório", "Relatório gerado em " + dataGeracao.toString());
    }
}
