package com.destiny.aplikasidokter.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.destiny.aplikasidokter.API.ApiRequest;
import com.destiny.aplikasidokter.API.RetroServer;
import com.destiny.aplikasidokter.Model.ResponseModel;
import com.destiny.aplikasidokter.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {
    Button register,login;
    EditText Username,Password,Nama,Umur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        register=(Button)findViewById(R.id.btnRegister);
        login=(Button)findViewById(R.id.btnLogin);
        Username=(EditText)findViewById(R.id.etUsername);
        Password=(EditText)findViewById(R.id.etPassword) ;
        Nama=(EditText)findViewById(R.id.etNama);
        Umur=(EditText)findViewById(R.id.etUmur);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog pd = new ProgressDialog(RegisterActivity.this);
                pd.setMessage("Sedang Mencoba Register");
                pd.setCancelable(false);
                pd.show();
                ApiRequest api = RetroServer.getClient().create(ApiRequest.class);

                Call<ResponseModel> register =api.registeruser(Username.getText().toString(),
                        Password.getText().toString(),
                        Nama.getText().toString(),
                        Umur.getText().toString()
                );
                register.enqueue(new Callback<ResponseModel>() {
                    @Override
                    public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                        pd.hide();
                        Toast.makeText(RegisterActivity.this,response.body().getResponse(),Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onFailure(Call<ResponseModel> call, Throwable t) {
                        pd.hide();
                        Toast.makeText(RegisterActivity.this,"Koneksi Gagal",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
