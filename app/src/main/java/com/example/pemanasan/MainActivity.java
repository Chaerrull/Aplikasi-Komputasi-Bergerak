package com.example.pemanasan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
10117171
Mohammad Chaerrull Febriansyah
IF-5

02-04 membuat tampilan halaman pertama
04-04 menyelesaikan tampilan halaman pertama, membuat halaman kedua dan ketiga
05-04 membuat halaman keempat dan menyelesaikan program
*/
public class MainActivity extends AppCompatActivity {

    private Button mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mulai = (Button) findViewById(R.id.mulai);
        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bukaKode();

            }
        });
    }

    public void bukaKode(){
        Intent kode = new Intent(this,code_keluarga.class);
        startActivity(kode);
    }
}
