package com.rahmaniaaas.tegalanresto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class detailMenu extends AppCompatActivity {

    TextView tv_food, tv_price;
    ImageView iv_photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        Intent intent = getIntent();
        String food = intent.getStringExtra("makanan");
        Integer price = intent.getIntExtra("harga",0);
        Integer photo = intent.getIntExtra("foto",0);

        Log.d("getIntExtra", ""+price+photo);

        tv_food = (TextView)findViewById(R.id.tv_detFood);
        tv_price = (TextView)findViewById(R.id.tv_detPrice);
        iv_photo = (ImageView)findViewById(R.id.iv_detPhoto);

        tv_food.setText(food);
        tv_price.setText("Rp. "+price);
        iv_photo.setImageResource(photo);
    }
}
