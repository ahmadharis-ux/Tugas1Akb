package net.kenclengcoding.akb1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button btn_profile;
    private Button btn_logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_profile = findViewById(R.id.btn_profile);
        btn_logout = findViewById(R.id.btn_logout);

        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profile = new Intent(MainActivity.this,MyProfile10119266.class);
                startActivity(profile);
            }
        });
        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logout = new Intent(MainActivity.this,Login10119266.class);
                startActivity(logout);
            }
        });
    }
}