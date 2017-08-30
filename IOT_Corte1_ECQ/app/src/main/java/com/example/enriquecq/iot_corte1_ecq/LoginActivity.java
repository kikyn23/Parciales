package com.example.enriquecq.iot_corte1_ecq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.txtNombre)
    EditText txtNombre;

    @BindView(R.id.txtApellido)
    EditText txtApellido;

    @BindView(R.id.txtDireccion)
    EditText txtDireccion;

    @BindView(R.id.txtCorreo)
    EditText txtCorreo;

    @BindView(R.id.btnEnviar)
    Button btnEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnEnviar)
    public void clickEnviar(){


        String nombre = txtNombre.getText().toString();
        String apellido = txtApellido.getText().toString();
        String direccion = txtDireccion.getText().toString();
        String email = txtCorreo.getText().toString();

        btnEnviar.setEnabled(true);
        Intent intent = new Intent(LoginActivity.this, ResultadoActivity.class);
        startActivity(intent);

        intent.putExtra("nombre",nombre);
        intent.putExtra("apellido",apellido);
        intent.putExtra("direccion",direccion);
        intent.putExtra("correo",email);
    //    finish();

     }

}
