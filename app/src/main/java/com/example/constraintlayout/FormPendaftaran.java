package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class FormPendaftaran extends AppCompatActivity {
    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtRepass;
    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pendaftaran);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtNama.getText().toString().isEmpty()||
                        edtEmail.getText().toString().isEmpty()||
                        edtPassword.getText().toString().isEmpty()||
                        edtAlamat.getText().toString().isEmpty()||
                        edtRepass.getText().toString().isEmpty() )
                {
                    Snackbar.make(v, "WAJIB ISI SELURUH DATA!!!", Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    if (edtPassword.getText().toString().equals(edtRepass.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(),"Pendaftaran Berhasill...",
                                Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        Snackbar.make(v, "Password dan repassword harus sama!!!!",
                                Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });

    }
}