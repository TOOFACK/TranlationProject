package com.example.com.tranlationproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Transalte extends AppCompatActivity {
    TextView WordForTranslate =findViewById(R.id.wordForTransalte);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transalte);
        setContentView(R.layout.activity_transalte);
        String wordForTranslate = getIntent().getStringExtra("word");
        WordForTranslate.setText(wordForTranslate);



    }
}
