package com.rahmaniaaas.tegalanresto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class dineIn extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner meja ; //inisiasi spinner
    private EditText name ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        //Membuat Spinner
        meja = (Spinner) findViewById(R.id.spinner_meja);

        // Membuat ArrayAdapter menggunakan string array
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.meja_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource (android.R.layout.simple_spinner_dropdown_item);
        // Penggunaan adapter ke spinner
        if (meja != null) {
            meja.setAdapter(adapter);
        }
    }

     public void pilihPesanan2(View view) {

        name = (EditText) findViewById(R.id.name2); //inputan editText

         String a = meja.getSelectedItem().toString();

         //apabila spinner tidak diisi
         if (name ==null){
             Toast.makeText(this,"Anda wajib mengisi nomor meja",Toast.LENGTH_LONG).show();
         }
         //Apabila memilih meja 1 maka muncul toast
         else if (a.equalsIgnoreCase("Meja 1")){
             String nama = name.getText().toString();
             Toast.makeText(this,"Anda ," + nama + " telah memilih meja 1",Toast.LENGTH_LONG).show();
         }
         //Apabila memilih meja 2 maka muncul toast
         else if (a.equalsIgnoreCase("Meja 2")){
             String nama = name.getText().toString();
             Toast.makeText(this,"Anda ," + nama + " telah memilih meja 2",Toast.LENGTH_LONG).show();
         }
         //Apabila memilih meja 3 maka muncul toast
         else if (a.equalsIgnoreCase("Meja 3")){
             String nama = name.getText().toString();
             Toast.makeText(this,"Anda ," + nama + " telah memilih meja 3",Toast.LENGTH_LONG).show();
         }
         //Apabila memilih meja 4 maka muncul toast
         else if (a.equalsIgnoreCase("Meja 4")){
             String nama = name.getText().toString();
             Toast.makeText(this,"Anda ," + nama + " telah memilih meja 4",Toast.LENGTH_LONG).show();
         }
         //Apabila memilih meja 5 maka muncul toast
         else if (a.equalsIgnoreCase("Meja 5")){
             String nama = name.getText().toString();
             Toast.makeText(this,"Anda ," + nama + " telah memilih meja 5",Toast.LENGTH_LONG).show();
         }
         //Apabila memilih meja 6 maka muncul toast
         else if (a.equalsIgnoreCase("Meja 6")){
             String nama = name.getText().toString();
             Toast.makeText(this,"Anda ," + nama + " telah memilih meja 6",Toast.LENGTH_LONG).show();
         }
         //Apabila memilih meja 7 maka muncul toast
         else if (a.equalsIgnoreCase("Meja 7")){
             String nama = name.getText().toString();
             Toast.makeText(this,"Anda ," + nama + " telah memilih meja 7",Toast.LENGTH_LONG).show();
         }

         //intent
         Intent r = new Intent(dineIn.this,daftarMenu.class);
         startActivity(r);

     }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
