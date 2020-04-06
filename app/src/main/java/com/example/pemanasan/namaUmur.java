package com.example.pemanasan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class namaUmur extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.example.pemanasan.example.EXTRA_TEXT";
    private Button lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama_umur);

        lanjut = (Button) findViewById(R.id.lanjut);
        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bukaAkhir();
            }
        });
    }

    public void bukaAkhir(){

        EditText nama = (EditText) findViewById(R.id.nama);
        String text = nama.getText().toString();

        Intent akhir = new Intent(this,Akhir.class);
        akhir.putExtra(EXTRA_TEXT,text);
        startActivity(akhir);

    }
}
