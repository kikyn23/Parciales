package com.example.enriquecq.iot_corte1_ecq;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


/**
 * Created by EnriqueCQ on 29/08/2017.
 */

public class ResultadoActivity extends AppCompatActivity {


        Bundle bundle;

        String nombre;
        String apellido;
        String direccion;
        String correo;

        TextView tvnombre;
        TextView tvapellido;
        TextView tvdireccion;
        TextView tvcorreo;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_resultado);

            bundle = getIntent().getExtras();

            tvnombre = (TextView)findViewById(R.id.textViewNombre);
            bundle = getIntent().getExtras();
            nombre = bundle.getString("txtNombre");
            tvnombre.setText(nombre);

            tvapellido = (TextView)findViewById(R.id.textViewApellido);
            bundle = getIntent().getExtras();
            nombre = bundle.getString("txtApellido");
            tvnombre.setText(apellido);

            tvdireccion = (TextView)findViewById(R.id.textViewDireccion);
            bundle = getIntent().getExtras();
            nombre = bundle.getString("txtDireccion");
            tvnombre.setText(direccion);

            tvcorreo = (TextView)findViewById(R.id.textViewCorreo);
            bundle = getIntent().getExtras();
            nombre = bundle.getString("txtCorreo");
            tvnombre.setText(correo);

        }
}
