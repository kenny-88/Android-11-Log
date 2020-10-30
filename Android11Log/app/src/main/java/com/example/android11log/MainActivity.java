package com.example.android11log;

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
        TextView msg =(TextView)findViewById(R.id.tv1);
        EditText editText = (EditText)findViewById(R.id.edit1);
        Intent intent = new  Intent(this,MainActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putString("msg",msg.getText().toString());
        bundle.putString("name",editText.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
        Log.d("MainActivity","轉到B頁面");
    }
}