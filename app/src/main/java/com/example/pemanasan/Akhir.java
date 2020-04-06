package com.example.pemanasan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Akhir extends AppCompatActivity {

    private Button oke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akhir);

        Intent akhir = getIntent();
        String text = akhir.getStringExtra(namaUmur.EXTRA_TEXT);

        TextView nama = (TextView) findViewById(R.id.nama);
        nama.setText(text);

        oke = (Button) findViewById(R.id.oke);
        oke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kembali();
            }
        });
    }

    public void kembali(){
        Intent rumah = new Intent(this,MainActivity.class);
        startActivity(rumah);

    }
}
