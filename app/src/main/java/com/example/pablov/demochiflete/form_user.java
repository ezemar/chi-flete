package com.example.pablov.demochiflete;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import Models.User;
import Models.Email;
import Models.Direccion;
import io.realm.Realm;


public class form_user extends AppCompatActivity {

    EditText nombre, email, calle, localidad, provincia, altura;
    Button guardar;
    private Realm modelRealm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_user);
        modelRealm = Realm.getDefaultInstance();

        // Save Data form registers users
        nombre = (EditText)findViewById(R.id.txtUserName);
        email = (EditText)findViewById(R.id.txtEmail);
        calle = (EditText)findViewById(R.id.txtCalle);
        altura = (EditText)findViewById(R.id.txtAltura);
        localidad = (EditText)findViewById(R.id.txtLocalidad);
        provincia = (EditText)findViewById(R.id.txtProvincia);

        guardar = (Button)findViewById(R.id.btnRegister);
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                modelRealm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        User userRegister = modelRealm.createObject(User.class);
                        userRegister.setNombre(nombre.getText().toString());

                        // Set email model
                        Email emailUser = modelRealm.createObject(Email.class);
                        emailUser.setEmail(email.getText().toString());
                        emailUser.setActive(false);
                        userRegister.setEmail(emailUser);

                        // set direccion model
                        Direccion dirUser = modelRealm.createObject(Direccion.class);
                        dirUser.setCalle(calle.getText().toString());
                        dirUser.setLocalidad(localidad.getText().toString());
                        dirUser.setNumero(Integer.valueOf(altura.getText().toString()));
                        dirUser.setProvincia(provincia.getText().toString());
                        dirUser.setLatitud(Long.valueOf("-34.7602944"));
                        dirUser.setLongitud(Long.valueOf("-58.4127995"));
                        userRegister.setDireccionUser(dirUser);
                    }

                });
            }
        });
    }

    @Override
    public void finish() {
        super.finish();
    }
}
