package com.mdfone.abhis.mdf_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    private static final String TOTAL_COUNT = "total_count" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.numberTV);
    }

    public void toast(View view) {
        Toast.makeText(this,"Sample Toast",Toast.LENGTH_SHORT).show();
    }

    public void count(View view) {
        String countString = textView.getText().toString();
        Integer count = Integer. parseInt (countString);
        count++;

        textView.setText(String.valueOf(count));
    }

    public void random(View view) {
        Intent randomIntent = new Intent( this , Second. class );

        String countString = textView.getText().toString();

        int count = Integer. parseInt (countString);
        randomIntent.putExtra( TOTAL_COUNT , count);
        startActivity(randomIntent);
    }
}
