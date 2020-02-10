package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){

      //  Log.i("Info","Button Pressed");
        EditText myTextField = (EditText) findViewById(R.id.myText);

      //  Toast.makeText(MainActivity.this, myTextField.getText().toString(),
        //Toast.LENGTH_LONG).show();

        String str = myTextField.getText().toString();
        goToActivity2(str);
    }

    public void goToActivity2(String str){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message",str);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
