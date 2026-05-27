package com.dubannet.quizadaptadores;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dubannet.quizadaptadores.adaptadores.CarroAdaptador;
import com.dubannet.quizadaptadores.clases.Carro;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rsvCarro;
    private List<Carro> listCarro=new ArrayList<>();
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
        rsvCarro=findViewById(R.id.rsvCarro);
        Carro carro = new Carro("https://images.unsplash.com/photo-1562911791-c7a97b729ec5?q=80&w=1537&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", "Chevrolet", "Camaro","2020","Amarillo");
        Carro carro1 = new Carro("https://images.unsplash.com/photo-1617531653332-bd46c24f2068?q=80&w=1515&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", "BMW", "M4","2024","rojo");
        Carro carro2 = new Carro("https://images.unsplash.com/photo-1634673970798-a15ae56f6c65?q=80&w=1528&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", "Porsche", "GT3 RS","2023","Gris");
        Carro carro3 = new Carro("https://images.unsplash.com/photo-1629323487410-c1abe62ea9ba?q=80&w=1025&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", "Ferrari", "F40","2020","rojo");
        Carro carro4 = new Carro("https://images.unsplash.com/photo-1612814251241-6089fc8fee42?q=80&w=2127&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", "Dodge Challenger", "R/T","2019","Gris");
        Carro carro5 = new Carro("https://images.unsplash.com/photo-1516298252535-cf2ac5147f9b?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", "Mclaren", "GTR","2019","Naranja");

        listCarro.add(carro);
        listCarro.add(carro1);
        listCarro.add(carro2);
        listCarro.add(carro3);
        listCarro.add(carro4);
        listCarro.add(carro5);
        rsvCarro.setLayoutManager(new LinearLayoutManager(this));

        CarroAdaptador adaptador = new CarroAdaptador(listCarro);

        rsvCarro.setAdapter(adaptador);
    }
}