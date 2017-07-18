package com.example.adilos.guessthenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randInt;
    public  void toast(String str){
        Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
    }

    public void guess(View view){
        EditText guess = (EditText) findViewById(R.id.editText);
        int guessNum = Integer.parseInt(guess.getText().toString());
        if(guessNum>randInt){
            toast("A little lower...");
        }
        else if(guessNum<randInt){
            toast("A little higher...");
        }
        else{
            toast("Perfect !! . Try again");
            Random r = new Random();
            randInt = r.nextInt(20) + 1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random r = new Random();
        randInt = r.nextInt(20) + 1;
    }
}
