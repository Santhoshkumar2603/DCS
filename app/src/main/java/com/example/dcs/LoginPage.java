package com.example.dcs;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginPage extends AppCompatActivity {

    private EditText Email;
    private EditText Password;
    private Button Login;
    private Button userRegistration;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;

    private Spinner spinner;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

            editText=(EditText) findViewById(R.id.editTextPhone);
            spinner = (Spinner)findViewById(R.id.spinnerCountries);
            spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, CountryData.countryNames));

            findViewById(R.id.buttonContinue).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String code = CountryData.countryAreaCodes[spinner.getSelectedItemPosition()];

                    String number = editText.getText().toString().trim();

                    if (number.isEmpty() || number.length() < 10) {
                        editText.setError("Valid number is required");
                        editText.requestFocus();
                        return;
                    }

                    String phonenumber = "+" + code + number;

                    Intent intent = new Intent(LoginPage.this, RegisterPage.class);
                    intent.putExtra("phonenumber", phonenumber);
                    startActivity(intent);

                }
            });

        }

        @Override
        protected void onStart() {
            super.onStart();

            if (FirebaseAuth.getInstance().getCurrentUser() != null) {
                Intent intent = new Intent(LoginPage.this,Dashboardpage.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        }
    }