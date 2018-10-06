package com.example.pablov.demochiflete;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import Models.Direccion;
import Models.User;
import io.realm.Realm;
import io.realm.RealmConfiguration;


public class form_user extends AppCompatActivity {

    EditText nombre, calle,email, altura, localidad, provincia;
    Button guardar;
    private Realm modelRealm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_user);


        // Config realm data base
        Realm.init(this);
        RealmConfiguration configuration = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(configuration);

        nombre = (EditText)findViewById(R.id.txtUserName);
        calle = (EditText)findViewById(R.id.txtCalle);
        email = nombre = (EditText)findViewById(R.id.txtEmail);
        altura = (EditText)findViewById(R.id.txtAltura);
        localidad = (EditText)findViewById(R.id.txtLocalidad);
        provincia = (EditText)findViewById(R.id.txtProvincia);

        guardar = (Button)findViewById(R.id.btnRegister);
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User userRegister = modelRealm.createObject(User.class);
                userRegister.setNombre(nombre.getText().toString());
                userRegister.setEmail(email.getText().toString());
            }
        });
    }

}
