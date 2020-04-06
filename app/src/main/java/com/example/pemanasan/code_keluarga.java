package com.example.pemanasan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class code_keluarga extends AppCompatActivity {

    private Button masuk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_keluarga);

        masuk = (Button) findViewById(R.id.masuk);
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bukaNama();
            }
        });
    }

    public void bukaNama(){
        Intent nama = new Intent(this,namaUmur.class);
        startActivity(nama);
    }
}
