package com.mdfone.abhis.mdf_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class Second extends AppCompatActivity {
    private static final String TOTAL_COUNT = "total_count" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showrandomnumber();
    }

    private void showrandomnumber() {

        TextView randomView = findViewById(R.id.randomTextView );


        int count = getIntent().getIntExtra( TOTAL_COUNT , 0 );

        Random random = new Random();
        int randomInt = 0 ;
        if (count> 0 ) {
            randomInt = random.nextInt(count);
        }

        randomView.setText(String.valueOf(randomInt));


    }
}
