package com.example.com.tranlationproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText translate = findViewById(R.id.translate);
    String word;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         word = translate.getText().toString();
    }
   // public void gotoTransalte(View view) {
     //   Intent intent = new Intent(this, Transalte.class);
       // intent.putExtra("name",word);

        //startActivity(intent);

//}

    public void onTranslateClick(View view) {
        Intent intent = new Intent(this, Transalte.class);
        intent.putExtra("name",word);
        startActivity(intent);
    }
}
