package com.example.oppsconcepts;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Polymorephism extends AppCompatActivity {
            TextView tv1,tv2,tv3;
    Circle cl,c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polymorephism);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        c2 = new Circle2();
        cl  = new Circle();

        cl.draw();
        c2.draw(5);
        cl.draw(10,"green");
    }

    public class Circle {

        public void draw() {
            tv1.setText("Drwaing circle with default color Black and diameter 1 cm.");
        }

        public void draw(int diameter) {
            tv2.setText("Drwaing circle with default color Black and diameter" + diameter + " cm.");
        }

        public void draw(int diameter, String color) {
            tv3.setText("Drwaing circle with color" + color + " and diameter" + diameter + " cm.");
        }
    }
    public class Circle2 extends Circle{
        public void draw(int diameter) {
            tv2.setText("Drwaing circle with default color Black and diameter" + diameter + " cm. from circle2 class");
        }
    }
}