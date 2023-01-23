package com.example.oppsconcepts;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Multi_Level_Inheritance extends AppCompatActivity {
    TextView tv1,tv2,tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_level_inheritance);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);

        C c = new C();
        c.a();
        c.b();
        c.c();
    }
    public class A{
        public void a()
        {
           tv1.setText("claa A ");
        }
    }
    public class B extends A{
        public void b(){
           tv2.setText("class B");
        }
    }
    public class C extends B{
        public void c(){
            tv3.setText("class C");
        }
    }
}