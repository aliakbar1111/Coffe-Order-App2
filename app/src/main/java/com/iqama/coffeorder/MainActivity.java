package com.iqama.coffeorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView amount,price;
    Button order,increament,dicreament;
    int quantity = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amount=findViewById(R.id.amount);
        price=findViewById(R.id.price);
        order=findViewById(R.id.order);
        increament=findViewById(R.id.increament);
        dicreament=findViewById(R.id.dicreament);
    }

    public void coffeOrder(View view) {
        String priceMessege = "মোঃ আয়ান আপনি " + quantity + " কাপ কফি অর্ডার করেছেন" + "\n আপনার বিল : " + (quantity * 5) + " ৳" ;
//        String priceMessege = "Our commitment is \"to serve you better service\"";
        displayMessege(priceMessege);

    }

    public void displayMessege(String messege){
        price.setText(messege);
    }

    public void increament(View view) {

        quantity  = quantity +1 ;
        display(quantity);



    }

    public void dicreament(View view) {
        quantity= quantity -1;
        display(quantity);

    }

    public void display(int count){
        amount.setText(""+count);
    }




    private void displayPrice(int count) {
        price.setText (NumberFormat.getCurrencyInstance(new Locale("bn","BD")).format(count));
//        for dollar sign
//        (NumberFormat.getCurrencyInstance().format(count))

   }
}

