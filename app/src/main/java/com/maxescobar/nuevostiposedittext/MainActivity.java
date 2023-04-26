package com.maxescobar.nuevostiposedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre, etContra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText) findViewById(R.id.etNombre);
        etContra = (EditText) findViewById(R.id.etpCotra);
    }

    //Metodo para usar el boton
    public void iniciar(View vista){

        //Pasar todo a string
        String nombre = etNombre.getText().toString();
        String contra = etContra.getText().toString();

        //Logica
        if (nombre.isEmpty()){
            Toast.makeText(this,"Por favor ingrese su nombre",Toast.LENGTH_LONG).show();
        }
        if (contra.isEmpty()){
            Toast.makeText(this,"Por favor ingrese su contraseña",Toast.LENGTH_LONG).show();
        }

        if (!nombre.isEmpty() && !contra.isEmpty()){
            Toast.makeText(this,"Procesando Informacion",Toast.LENGTH_LONG).show();
        }
    }

}