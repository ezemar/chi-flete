package com.example.pablov.demochiflete;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import Models.User;
import io.realm.Realm;
import io.realm.RealmConfiguration;


public class form_user extends AppCompatActivity {

    EditText nombre;
    Button guardar;
    private Realm modelRealm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_user);
        modelRealm = Realm.getDefaultInstance();


        nombre = (EditText)findViewById(R.id.txtUserName);

        guardar = (Button)findViewById(R.id.btnRegister);
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                modelRealm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        User userRegister = modelRealm.createObject(User.class);
                        userRegister.setNombre(nombre.getText().toString());
                    }
                });

            }
        });
    }

}
