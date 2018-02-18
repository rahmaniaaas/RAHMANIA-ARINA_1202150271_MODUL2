package com.rahmaniaaas.tegalanresto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;

public class daftarMenu extends AppCompatActivity {

    private final LinkedList<String> makanan = new LinkedList<>();
    private final LinkedList<Integer> harga = new LinkedList<>();
    private final LinkedList<Integer> foto = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private daftarMenuAdapter Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        daftarMenuAdapter mAdapter = new daftarMenuAdapter(this, makanan, harga, foto);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData() {
        for (int i = 0; i < 6; i++) {
            makanan.add("Sate Kambing");
            makanan.add("Kupat Glabed");
            makanan.add("Nasi Lengko");
            makanan.add("Nasi Ponggol Setan");
            makanan.add("Olos");
            makanan.add("Tahu Aci");
            makanan.add("Sauto Talang");
            makanan.add("Teh Poci");


            harga.add(60000);
            harga.add(8000);
            harga.add(8000);
            harga.add(8000);
            harga.add(10000);
            harga.add(10000);
            harga.add(15000);
            harga.add(20000);

            foto.add(R.drawable.sate);
            foto.add(R.drawable.glabed);
            foto.add(R.drawable.lengko);
            foto.add(R.drawable.ponggol);
            foto.add(R.drawable.olos);
            foto.add(R.drawable.tahu);
            foto.add(R.drawable.soto);
            foto.add(R.drawable.teh);

        }
    }
}