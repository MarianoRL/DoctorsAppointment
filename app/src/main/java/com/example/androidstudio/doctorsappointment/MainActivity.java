package com.example.androidstudio.doctorsappointment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner BloodTypeSpinner = (Spinner) findViewById(R.id.BloodType);

        ArrayAdapter<CharSequence> BloodTypeAdapter =
                ArrayAdapter.createFromResource(this, R.array.BloodType,
                        android.R.layout.simple_spinner_item);

        // Specify this layout to use when list of choices appears
        BloodTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        BloodTypeSpinner.setAdapter(BloodTypeAdapter);
        BloodTypeSpinner.setSelection(0);

        Button Enviar = (Button) findViewById(R.id.Enviar);
        Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "GRACIAS POR ENVIAR TU SOLICITUD", Toast.LENGTH_LONG).show();
            }
        });
    }
}
