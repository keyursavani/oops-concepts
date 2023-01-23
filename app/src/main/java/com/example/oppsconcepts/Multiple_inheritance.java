package com.example.oppsconcepts;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Multiple_inheritance extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_inheritance);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        D d = new D() {
            @Override
            public void d() {
                tv1.setText("clas D");
            }

            @Override
            public void a() {
               tv2.setText("cals A");
            }

            @Override
            public void b() {
                tv3.setText("class B");
            }

            @Override
            public void c() {
             tv4.setText("class C");
            }
        };
    }
    interface A {
        public void a ();
    }
    interface B {
        public void b();
    }
   interface C {
        public void c();
    }
    interface D extends C,B,A {
        public void d ();
    }
}