package br.senac.pi.demoviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnTextViewDemo).setOnClickListener(abrirTextViewDemo());
        findViewById(R.id.btnEditTextDemo).setOnClickListener(abrirEditTextDemo());
        findViewById(R.id.btnImageViewDemo).setOnClickListener(abrirImageViewDemo());
        findViewById(R.id.btnAutoCompleteDemo).setOnClickListener(abrirAutoCompleteDemo());
        findViewById(R.id.btnImageButtonDemo).setOnClickListener(abrirImageButton());
        findViewById(R.id.btnCheckbox).setOnClickListener(abrirCheckBoxToggleButtonActivity());
        findViewById(R.id.btnProgressDiologDemo).setOnClickListener(abrirProgressDialogDemoActivity());
        findViewById(R.id.btnAlertDialogActivity).setOnClickListener(abrirAlertDialogActivity());
    }

    private View.OnClickListener abrirTextViewDemo() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TextViewDemo.class);
                startActivity(intent);
            }
        };
    }

    private View.OnClickListener abrirEditTextDemo() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EditTextDemo.class);
                startActivity(intent);
            }
        };
    }

    private View.OnClickListener abrirImageViewDemo() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ImageViewDemo.class);
                startActivity(intent);
            }
        };
    }

    private View.OnClickListener abrirAutoCompleteDemo() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AutoCompleteDemo.class);
                startActivity(intent);
            }
        };
    }

    private View.OnClickListener abrirImageButton(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ImageButton.class);
                startActivity(intent);
            }
        };
    }

    private View.OnClickListener abrirCheckBoxToggleButtonActivity(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CheckBoxToggleButtonActivity.class);
                startActivity(intent);
            }
        };
    }

    private View.OnClickListener abrirProgressDialogDemoActivity(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProgressDialogDemoActivity.class);
                startActivity(intent);
            }
        };
    }

    private View.OnClickListener abrirAlertDialogActivity(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AlertDialogDemoActivity.class);
                startActivity(intent);
            }
        };
    }
}
