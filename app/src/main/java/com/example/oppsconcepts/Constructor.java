package com.example.oppsconcepts;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Constructor extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constructor);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);

        A a = new A();
        tv1.setText("name is :- " +a.name);

        A a1 = new A(20);
        tv3.setText("age is : - " +a1.age);

        A a2 = new A("savani");

//        B b = new B();
//        b.A();




    }
   public  class A {
        int a;
        String name = "keyur";
        int age;

        public A (){
            a=5;
            tv2.setText("value of a :- " + a);
        }

        public A (int age){
            this.age = age;
           // tv3.setText("age is :- " +age);
        }

        public A(String surname){
             tv4.setText("surname is :- " +surname);
        }
     }

//     public class B extends A {
//         public void  A (){
//           int a=6;
//             tv2.setText("value of a :- " + a);
//         }
//     }

}