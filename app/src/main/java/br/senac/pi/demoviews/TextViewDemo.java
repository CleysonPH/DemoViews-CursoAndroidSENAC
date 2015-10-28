package br.senac.pi.demoviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TextViewDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_demo);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }
}
