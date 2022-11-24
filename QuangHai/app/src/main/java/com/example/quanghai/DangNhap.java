package com.example.quanghai;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class DangNhap extends AppCompatActivity {
    ImageView button_back;
    private TextView linkDangKy;
    Button button_login;
    EditText nameed, passed;
    private FirebaseAuth mAuth;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);

        linkDangKy = findViewById(R.id.linkDangKy);
        button_login = findViewById(R.id.button_login);

        mAuth = FirebaseAuth.getInstance();
        nameed = findViewById(R.id.name);
        passed = findViewById(R.id.pass);


        linkDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenDangKy();
            }
        });

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenHome();
            }
        });
    }

    private void OpenDangKy() {
        Intent intent = new Intent(this, DangKy.class);
        startActivity(intent);
    }


    private void OpenHome() {
        String name, pass;
        name = nameed.getText().toString();
        pass = passed.getText().toString();

        if (TextUtils.isEmpty(name)){
            Toast.makeText(this,"Vui lòng nhập name !",Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(pass)){
            Toast.makeText(this,"Vui lòng nhập pass !",Toast.LENGTH_SHORT).show();
            return;
        }

        mAuth.signInWithEmailAndPassword(name,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(getApplicationContext(),"Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(DangNhap.this, MainActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"Đăng nhập không thành công", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}