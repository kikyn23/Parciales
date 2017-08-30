package com.example.enriquecq.iot_primerparcial_ecq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DatosIngresadosActivity extends AppCompatActivity {

    Bundle bundle;

    String nombre;
    String apellido;
    String direccion;
    String correo;

    TextView textVNombre;
    TextView textVApellido;
    TextView textVDireccion;
    TextView textVCorreo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_ingresados);

        bundle = getIntent().getExtras();

        textVNombre = (TextView)findViewById(R.id.txtVNombre);
        nombre = bundle.getString("nombre");
        textVNombre.setText(nombre);

        textVApellido = (TextView)findViewById(R.id.txtVApellido);
        apellido = bundle.getString("apellido");
        textVApellido.setText(apellido);

        textVDireccion = (TextView)findViewById(R.id.txtVDireccion);
        direccion = bundle.getString("direccion");
        textVDireccion.setText(direccion);

        textVCorreo = (TextView)findViewById(R.id.txtVCorreo);
        correo = bundle.getString("correo");
        textVCorreo.setText(correo);

    }
}
