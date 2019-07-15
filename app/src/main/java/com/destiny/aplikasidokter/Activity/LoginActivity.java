package com.destiny.aplikasidokter.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.design.widget.Snackbar;
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
import com.destiny.aplikasidokter.SharedPreference.DB_Helper;
import com.destiny.aplikasidokter.SharedPreference.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    Button login,register;
    EditText Username,Password;
    DB_Helper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login=(Button)findViewById(R.id.btnLogin);
        register=(Button)findViewById(R.id.btnRegister);
        Username=(EditText)findViewById(R.id.etUsername);
        Password=(EditText)findViewById(R.id.etPassword);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckLogin();
//                CheckLoginIntent intent = new Intent(LoginActivity.this, MainActivity.class);
//                startActivity(intent);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
    private void SessionLoginSucces(String Username,String Password){
        String Person="User";
        dbHelper = new DB_Helper(this);
        if(Username.isEmpty()){
            Toast.makeText(this,"Silahkan Masukan Username",Toast.LENGTH_SHORT).show();
        }
        if(Password.isEmpty()){
            Toast.makeText(this,"Silahkan Masukan Password",Toast.LENGTH_SHORT).show();
        }

        User user = new User(Username,Person);
        dbHelper.saveSession(user);
    }
    private void CheckLogin(){
        final ProgressDialog pd = new ProgressDialog(LoginActivity.this);
        pd.setMessage("Sedang Mengambil Data Ke Server");
        pd.setCancelable(false);
        pd.show();
        final String username = Username.getText().toString();
        final String password = Password.getText().toString();
        if(username.isEmpty()){
            Toast.makeText(this,"Silahkan Masukan Username",Toast.LENGTH_SHORT).show();
        }
        if(password.isEmpty()){
            Toast.makeText(this,"Silahkan Masukan Password",Toast.LENGTH_SHORT).show();
        }

        ApiRequest api = RetroServer.getClient().create(ApiRequest.class);
        Call<ResponseModel> login = api.loginuser(username,password);
        login.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                pd.hide();
                String ress = response.body().getResponse();
                if (ress.equals("succes")){
                    SessionLoginSucces(username,password);
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(LoginActivity.this,"Username Atau Password Salah",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                pd.hide();
                Toast.makeText(LoginActivity.this,"Data Error",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
