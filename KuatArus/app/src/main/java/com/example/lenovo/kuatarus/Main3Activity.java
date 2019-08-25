package com.example.lenovo.kuatarus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{

    private Button b_hitung;
    private EditText b_potensial;
    private EditText k_arus;
    private TextView cetak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        b_potensial = findViewById(R.id.potensial);

        k_arus = findViewById(R.id.KArus);

        b_hitung = findViewById(R.id.hitung);

        cetak = findViewById(R.id.cetak);

        b_hitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.hitung)
        {

            String inp_p = b_potensial.getText().toString().trim();
            String inp_k = k_arus.getText().toString().trim();

            boolean tidakKosong = false;

            Integer potensial = toInt(inp_p);
            Integer KArus = toInt(inp_k);

            if (inp_p.length() < 0){

                b_potensial.setError("Kolom ini harus di isi");

            }

            if (!tidakKosong)
            {
                int hasil = potensial / KArus;
                cetak.setText("Total\n"+String.valueOf(hasil));

            }
        }
    }

    private Integer toInt(String str) {
        try {
            return Integer.valueOf(str);
        }catch (Exception we){
            return null;
        }
    }
}
