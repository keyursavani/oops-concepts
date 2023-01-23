package com.example.oppsconcepts;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Inheritance extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inheritance);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);

        shap2 sh = new shap2();
        sh.cricle();
        sh.square();
        sh.rectangle();
    }
    public class shap{
        public void cricle (){
            tv1.setText("This is cricle method of shap class");
        }
        public void square (){
            tv2.setText("This is square method of shap class");
        }
    }
    public class shap2 extends shap {
        public void cricle (){
            super.cricle();
           tv3.setText("This is cricle methos of shap2 class");
        }
        public void rectangle(){
            tv4.setText("This is rectangle method of shap2 class");
        }

    }
}