package com.example.oppsconcepts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnabstraction,btnpolymorephism,btninheritance,btnencapsulation,btnmultilevelinheritance
    ,btnhierarchicalinheritance,btnmultipleinheritance,btnhybridinheritance,btnconstructor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnabstraction = findViewById(R.id.btnabstraction);
        btnpolymorephism = findViewById(R.id.btnpolymorephism);
        btninheritance = findViewById(R.id.btninheritance);
        btnencapsulation = findViewById(R.id.btnencapsulation);
        btnmultilevelinheritance = findViewById(R.id.btnmultilevelinheritance);
        btnhierarchicalinheritance = findViewById(R.id.btnhierarchicalinheritance);
        btnmultipleinheritance = findViewById(R.id.btnmultipleinheritance);
        btnhybridinheritance = findViewById(R.id.btnhybridinheritance);
        btnconstructor = findViewById(R.id.btnconstructor);

        btnabstraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Abstraction.class);
                startActivity(intent);
            }
        });
        btnpolymorephism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Polymorephism.class);
                startActivity(intent);
            }
        });
        btninheritance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Inheritance.class);
                startActivity(intent);
            }
        });
        btnencapsulation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Encapsulation.class);
                startActivity(intent);
            }
        });
        btnmultilevelinheritance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Multi_Level_Inheritance.class);
                startActivity(intent);
            }
        });
        btnhierarchicalinheritance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Hierarchical_inheritance.class);
                startActivity(intent);
            }
        });
        btnmultipleinheritance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Multiple_inheritance.class);
                startActivity(intent);
            }
        });
        btnhybridinheritance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Multiple_inheritance.class);
                startActivity(intent);
            }
        });
        btnconstructor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Constructor.class);
                startActivity(intent);
            }
        });


    }
}
