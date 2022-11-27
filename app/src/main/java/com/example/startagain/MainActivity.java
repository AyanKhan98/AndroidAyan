package com.example.startagain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int price=0;
    int quantity=0;


    public void increase(View view)
    {
        display(1);

    }
    public void decrease(View view)
    {
        display(-1);
    }
    private void display(int number)
    {
        price+=number;
        quantity=10*price;
        TextView priceView=findViewById(R.id.price);
        priceView.setText(""+price);
        TextView quantityView=findViewById(R.id.quantity);
        quantityView.setText("$"+quantity);
        TextView text=(TextView) findViewById(R.id.text_View);

    }

    public void Order(View view)
    {
        TextView text=(TextView) findViewById(R.id.text_View);
        text.setText("Thank you for the order now please pay $"+quantity);
    }

}