package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate: ");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "onStart: ");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "onResume: ");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "onPause: ");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "onStop: ");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy: ");
    }
    public  void A(View v){
        TextView msg =(TextView)findViewById(R.id.tv2);
        EditText editText = (EditText)findViewById(R.id.ed2);
        Intent intent = new  Intent(this,MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("msg",msg.getText().toString());
        bundle.putString("name",editText.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
        Log.d("Main2Activity","轉到A頁面");
    }
}
