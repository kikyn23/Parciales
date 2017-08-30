package com.example.enriquecq.iot_primerparcial_ecq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class IngresoDatosActivity extends AppCompatActivity {


    @BindView(R.id.txtNombre)
    EditText txtNombre;

    @BindView(R.id.txtApellido)
    EditText txtApellido;

    @BindView(R.id.txtDireccion)
    EditText txtDireccion;

    @BindView(R.id.txtCorreo)
    EditText txtCorreo;

    @BindView(R.id.btnEnviar)
    EditText btnEnviar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_datos);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.btnEnviar)
    public void  clickEnviar(View view){

        String Nombre = txtNombre.getText().toString();
        String Apellido = txtApellido.getText().toString();
        String Direccion = txtDireccion.getText().toString();
        String Correo = txtCorreo.getText().toString();

        Intent intent = new Intent(IngresoDatosActivity.this, DatosIngresadosActivity.class);

        intent.putExtra("nombre",Nombre);
        intent.putExtra("apellido",Apellido);
        intent.putExtra("direccion",Direccion);
        intent.putExtra("correo",Correo);

        startActivity(intent);

    }

}
