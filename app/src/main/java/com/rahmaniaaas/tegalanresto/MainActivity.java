package com.rahmaniaaas.tegalanresto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //inisiasi awal
    private Button pesan;
    private RadioGroup radio;
    private RadioButton pilihDinein, pilihTakeway;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisiasi berdasarkan id

        radio = (RadioGroup) findViewById(R.id.radio1);
        pilihDinein = (RadioButton) findViewById(R.id.dineIn);
        pilihTakeway = (RadioButton) findViewById(R.id.takeaway);

    }

    private static final String TAG_ACTIVITY = MainActivity.class.getSimpleName();

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void pilihanPesanan(View view) {
        //mengecek button  sudah diklik apa belum
        boolean checked = ((RadioButton) view).isChecked();

        //kemungkinan button yang di klik
        switch (view.getId()) {
            case R.id.dineIn:
                if (checked)
                    // Jika dipilih dineIn
                    displayToast(getString(R.string.chosen) + getString(R.string.dine_in));
                    // Mengarahkan intent untuk pindah ke activity dineIn
                    Intent intent = new Intent(MainActivity.this,dineIn.class);
                    startActivity(intent);
                break;
            case R.id.takeaway:
                if (checked)
                    // Next day delivery
                    displayToast(getString(R.string.chosen) + getString(R.string.take_away));
                Intent intent1 = new Intent(MainActivity.this,takeway.class);
                startActivity(intent1);
                break;
            default:
                Log.d(TAG_ACTIVITY, getString(R.string.nothing_clicked));
                break;
        }
    }



}


