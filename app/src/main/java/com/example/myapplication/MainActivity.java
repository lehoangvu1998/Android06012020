package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mButton; // khai báo biến button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.button123); // tìm lại nút button
        mButton.setText("Click me now");
        mButton.setOnClickListener(new View.OnClickListener() { // bắt sự kiện thông báo
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"bạn Vũ đẹp trai",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
