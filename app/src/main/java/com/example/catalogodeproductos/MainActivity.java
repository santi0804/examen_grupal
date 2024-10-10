package com.example.catalogodeproductos;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    List<List_element> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        init();
    }
    public void init() {
        elements = new ArrayList<>();
        elements.add(new List_element("#775447" ,"Bolso", "$ 200.000", "Activo"));
        elements.add(new List_element("#607d8b", "Blusa dama", "$ 80.000", "Activo"));
        elements.add(new List_element("#03a9f4", "Labial negro", "$ 50.000", "Agotado"));
        elements.add(new List_element("#f44336", "Pantalón cuero", "$ 150.000", "Inventario"));
        elements.add(new List_element("#009688", "Conjunto Sport", "$ 350.000", "Activo"));

        ListAdapter listAdapter  = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}