package com.example.libreria;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    Button Registrar;
    EditText Nombre;
    EditText Celular;
    EditText Telefono;
    EditText Usuario;
    EditText Contraseña;
    private static final String PREFS_FILE = "MisDatos";
    private static final String Key_nombre = "nombre";
    private static final String Key_Telefono = "telefono";
    private static final String KEY_NOMBRE = "nombre";
    private static final String KEY_CELULAR = "celular";
    private static final String KEY_USUARIO = "usuario";
    private static final String KEY_CONTRASEÑA = "contraseña";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        Registrar = findViewById(R.id.inicio);
        Nombre = findViewById(R.id.nombres);
        Celular = findViewById(R.id.cel);
        Telefono = findViewById(R.id.cel);
        Usuario = findViewById(R.id.usuario);
        Contraseña = findViewById(R.id.contraseña);

        Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                String nombre  = Nombre.getText().toString();
                String celular = Celular.getText().toString();
                String usuario = Usuario.getText().toString();
                String contraseña = Contraseña.getText().toString();
                String telefono = Telefono.getText().toString();
                guardarDatos(nombre, celular, usuario, contraseña, telefono );

                Nombre.setText("");
                Celular.setText("");
                Usuario.setText("");
                Contraseña.setText("");
                Telefono.setText("");
                startActivity(intent);
            }
        });

    }
    private void guardarDatos(String nombre, String celular, String usuario, String contraseña, String telefono) {
        SharedPreferences sharedPreferences = getSharedPreferences(PREFS_FILE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY_NOMBRE, nombre);
        editor.putString(KEY_CELULAR, celular);
        editor.putString(KEY_USUARIO, usuario);
        editor.putString(KEY_CONTRASEÑA, contraseña);
        editor.putString(Key_nombre, nombre);
        editor.putString(Key_Telefono, telefono);
        editor.apply();
    }
}

