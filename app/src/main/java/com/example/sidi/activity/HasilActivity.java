package com.example.sidi.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        this.displayLuas();
        this.bindOnClick();

        /**
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
         */
    }

    private void displayLuas() {
        Bundle extras = getIntent().getExtras();
        int panjang = extras.getInt("panjang", 0);
        int lebar = extras.getInt("lebar", 0);
        int luas = extras.getInt("luas", 0);

        TextView nilaiPanjang = (TextView) findViewById(R.id.textNilaiPanjang);
        TextView nilaiLebar = (TextView) findViewById(R.id.textNilaiLebar);
        TextView nilaiLuas = (TextView) findViewById(R.id.textNilaiLuas);

        nilaiPanjang.setText(String.valueOf(panjang));
        nilaiLebar.setText(String.valueOf(lebar));
        nilaiLuas.setText(String.valueOf(luas));
    }

    private void bindOnClick() {
        Button buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
    }

}
