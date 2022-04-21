package net.kenclengcoding.akb1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register10119266 extends AppCompatActivity {
    private Button btn_log_in;
    private Button btn_daftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register10119266);

        btn_log_in = findViewById(R.id.btn_log_in);
        btn_log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backlogin = new Intent(Register10119266.this,Login10119266.class);
                startActivity(backlogin);
            }
        });
        btn_daftar = findViewById(R.id.btn_daftar);
        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent daftar = new Intent(Register10119266.this,MainActivity.class);
                startActivity(daftar);
            }
        });
    }
}