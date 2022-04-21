package net.kenclengcoding.akb1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login10119266 extends AppCompatActivity {

    private Button btn_login;
    private Button btn_regis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login10119266);

        btn_login = findViewById(R.id.btn_login);
        btn_regis = findViewById(R.id.btn_regis);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //action
                Intent intent = new Intent(Login10119266.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btn_regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regis = new Intent(Login10119266.this, Register10119266.class);
                startActivity(regis);
            }
        });
    }
}