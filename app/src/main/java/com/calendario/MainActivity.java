package com.calendario;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CalendarView calendario;
    private TextView fechaSeleccionada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // ✅ Correcto

        calendario = findViewById(R.id.calendarView);
        fechaSeleccionada = findViewById(R.id.txtFecha);

        calendario.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
            String fecha = dayOfMonth + "/" + (month + 1) + "/" + year;
            fechaSeleccionada.setText("Fecha seleccionada: " + fecha);
        });
    }
}
