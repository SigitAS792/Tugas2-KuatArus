package com.example.lenovo.kuatarus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button b_kuat_arus, b_hambatan;
    private TextView tResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_kuat_arus = findViewById(R.id.kuat_arus);
        b_hambatan = findViewById(R.id.hambatan);

        b_kuat_arus.setOnClickListener(this);
        b_hambatan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.kuat_arus:
                Intent ka = new Intent(this, Main2Activity.class);
                startActivity(ka);
                break;

            case R.id.hambatan:
                Intent h = new Intent(this, Main3Activity.class);
                startActivity(h);
                break;
        }
    }
}
