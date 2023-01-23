package com.example.oppsconcepts;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Hybrid_Inheritance extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hybrid_inheritance);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        D d = new D();
        d.a();
        d.b();
        d.d();
    }
    public class A{
        public void a(){
            tv1.setText("class A");
        }
    }
    public class B extends A{
        public void b(){
            tv2.setText("class B");
        }
    }
    public class C extends A{
                public void c(){
                    tv3.setText("class B");
                }
    }
    public class D extends B{
        public void d(){
            tv4.setText("class B");
        }
    }
}