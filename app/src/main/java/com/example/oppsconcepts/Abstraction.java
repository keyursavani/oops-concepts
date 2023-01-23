package com.example.oppsconcepts;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Abstraction extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstraction);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tv7 = findViewById(R.id.tv7);
        tv8 = findViewById(R.id.tv8);
        tv9 = findViewById(R.id.tv9);
        tv10 = findViewById(R.id.tv10);

        Mannual_Car car1 = new Mannual_Car();
        Automatic_car car2 = new Automatic_car();
        person2 pr = new person2();
        car1.turnOnCar();
        car1.turnOffCar();
        tv3.setText(car1.getCarType());
        car2.turnOnCar();
        car2.turnOffCar();
        tv6.setText(car2.getCarType());
        pr.work();
        tv8.setText(pr.name("keyur savani"));
        tv9.setText(pr.gender("Male"));
        tv10.setText(pr.toString());

    }
    public interface Car{
        void turnOnCar();
        void turnOffCar();
        String getCarType();
    }
    public class Mannual_Car implements Car{
        private String carType = "Manual";
        @Override
        public void turnOnCar() {
            tv1.setText("turn on the manual car");
        }
        @Override
        public void turnOffCar() {
            tv2.setText("turn off the manual car");
        }
        @Override
        public String getCarType() {
            return this.carType;
        }
    }
    public class Automatic_car implements Car{
        private String carType = "Automatic";

        public String getCarType(){
            return this.carType;
        }
        public void turnOffCar(){
            tv4.setText("turn on the automatic car");
        }
        public void turnOnCar(){
            tv5.setText("turn on the automatic car");
        }

    }
    public abstract class person {
        private String name;
        private String gender;

        public String name(String name) {
            return this.name = name;
        }
        public String gender(String gender){
            return this.gender=gender;
        }
        public abstract void work();
        @Override
        public String toString(){
            return "Name="+this.name+" Gender="+this.gender;
        }
    }
    public class person2 extends person {
        public void work(){
            tv7.setText("This is work method of person class");
        }
    }
}