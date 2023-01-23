package com.example.oppsconcepts;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Encapsulation extends AppCompatActivity {
    TextView tv1, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encapsulation);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);

        Student st = new Student();
        st.setName("keyur savani");
        tv1.setText(st.getName());
        Account ac = new Account();
        ac.setAcc_no(377137957);
        ac.setEmail("xyz12@gmail.com");
        ac.setName("keyur savani");
        ac.setAmount(5000);
        tv2.setText("Name :- "+ac.getName()+"  Email :- "+ac.getEmail()+"  Account No :- "+ac.getAcc_no()+"  Amount :- "+ac.getAmount());
    }

    public class Student {
        private String name;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

    class Account {

        private long acc_no;
        private String name,email;
        private float amount;

        public long getAcc_no() {
            return acc_no;
        }
        public void setAcc_no(long acc_no) {
            this.acc_no = acc_no;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public float getAmount() {
            return amount;
        }
        public void setAmount(float amount) {
            this.amount = amount;
        }

    }
}