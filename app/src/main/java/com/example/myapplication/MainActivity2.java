package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText email_login;
    EditText password_login;
    EditText email_register;
    EditText password_register;
    Button  connecter;
    Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // Initialisation des vues
        EditText emailLogin = findViewById(R.id.email_login);
        EditText passwordLogin = findViewById(R.id.password_login);
        EditText emailRegister = findViewById(R.id.email_register);
        EditText passwordRegister = findViewById(R.id.password_register);
        Button loginButton = findViewById(R.id.login_button);
        Button registerButton = findViewById(R.id.register_button);

        // Ajout des écouteurs d'événements pour les boutons
loginButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String email = emailLogin.getText().toString();
        String password = passwordLogin.getText().toString();
        // Validation des entrées de l'utilisateur
        if (TextUtils.isEmpty(email)) {
            emailLogin.setError("Email required.");
            return;
        }

        if (TextUtils.isEmpty(password)) {
            passwordLogin.setError("Password required.");
            return;
        }
        // Authentification de l'utilisateur
        // Ici, vous pouvez ajouter votre propre logique pour vérifier les informations d'identification
        // Si l'authentification réussit, vous pouvez lancer une autre activité ou effectuer d'autres actions
        // Sinon, vous pouvez afficher un message d'erreur à l'utilisateur
    }
});
      registerButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String email = emailRegister.getText().toString();
              String password = passwordRegister.getText().toString();

              // Validation des entrées de l'utilisateur
              if (TextUtils.isEmpty(email)) {
                  emailRegister.setError("Email required.");
                  return;
              }

              if (TextUtils.isEmpty(password)) {
                  passwordRegister.setError("Password required.");
                  return;
              }

          }
      })  ;
    }
}