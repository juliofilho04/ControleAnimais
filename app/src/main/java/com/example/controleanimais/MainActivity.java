package com.example.controleanimais;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Estoque estoque = new Estoque();
        Produto vacinaAftosa = new Produto("Vacina Aftosa", new Date(2025, 5, 10), 100) {};
        Produto racao = new Produto("Ração Bovinos", new Date(2024, 10, 20), 50) {};

        estoque.adicionarProduto(vacinaAftosa);
        estoque.adicionarProduto(racao);
        estoque.gerarAlerta();

        Animal boi = new Animal(1, "Boi", 3);
        boi.registrarConsumo(racao);

        Relatorio relatorio = new Relatorio();
        relatorio.gerarRelatorio();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}