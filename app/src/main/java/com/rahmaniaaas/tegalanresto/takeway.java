package com.rahmaniaaas.tegalanresto;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class takeway extends AppCompatActivity {
    private EditText nama,nohp,address,note;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeway);

        nama = (EditText) findViewById(R.id.name1);
        nohp = (EditText) findViewById(R.id.phone);
        address = (EditText) findViewById(R.id.alamat);
        note = (EditText) findViewById(R.id.catatan);
    }

    public void onDate(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.date_picker));

            }

    public void onTime(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.time_picker));

    }

    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        // Assign the concatenated strings to dateMessage.
        String dateMessage = (month_string + "/" +
                day_string + "/" + year_string);
        Toast.makeText(this, getString(R.string.date) + dateMessage,
                Toast.LENGTH_SHORT).show();
    }

    public void processTimePickerResult(int hourOfDay, int minute) {
        // Convert time elements into strings.
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);
        // Assign the concatenated strings to timeMessage.
        String timeMessage = (hour_string + ":" + minute_string);
        Toast.makeText(this, getString(R.string.time) + timeMessage,
                Toast.LENGTH_SHORT).show();
    }

    public void pilihPesanan(View view) {
        Intent intent = new Intent(this,daftarMenu.class);
        startActivity(intent);
    }
}