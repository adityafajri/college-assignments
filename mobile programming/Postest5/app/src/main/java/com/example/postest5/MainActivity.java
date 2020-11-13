package com.example.postest5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public EditText panjang;
    public EditText lebar;
    public EditText tinggi;
    public Button hitung;
    public TextView hasil;
    public double nilaiPanjang, nilaiLebar, nilaiTinggi, luasAlas, hasilAkhir;
    public double seperTiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void praktikum(){
        setContentView(R.layout.praktikum);
        panjang = findViewById(R.id.Panjang);
        lebar = findViewById(R.id.Lebar);
        tinggi = findViewById(R.id.Tinggi);
        hasil = findViewById(R.id.Hasil);
        hitung = findViewById(R.id.Hitung);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nilaiPanjang = Float.parseFloat(panjang.getText().toString());
                nilaiLebar = Float.parseFloat(lebar.getText().toString());
                nilaiTinggi = Float.parseFloat(tinggi.getText().toString());
                luasAlas = nilaiPanjang * nilaiLebar;
                hasilAkhir = 1d/3d * luasAlas * nilaiTinggi;
                hasil.setText(String.valueOf(hasilAkhir));
            }
        });
    }

    public void biodata(){

        setContentView(R.layout.biodata);
    }

    public void favorites(){
        setContentView(R.layout.favorites);
        GridView gridView = (GridView) findViewById(R.id.favorites);

        gridView.setAdapter(new Favorites(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.praktikum:
                praktikum();
                return true;
            case R.id.biodata:
                biodata();
                return true;
            case R.id.favorites:
                favorites();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}