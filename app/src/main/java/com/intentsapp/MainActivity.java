package com.intentsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnWeb = findViewById(R.id.btnWeb);
        Button btnLlamar = findViewById(R.id.btnLlamar);
        Button btnCorreo = findViewById(R.id.btnCorreo);

        btnWeb.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
            startActivity(intent);
        });

        btnLlamar.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:5551234"));
            startActivity(intent);
        });

        btnCorreo.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:soporte@empresa.com"));
            intent.putExtra(Intent.EXTRA_SUBJECT, "Consulta");
            startActivity(intent);
        });
    }
}
