package com.example.shakil.timer;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timer=findViewById(R.id.timer);

        final Handler handler= new Handler();
        timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Runnable run =new Runnable(){

                    public void run(){

                        Toast.makeText(MainActivity.this,"Button pressed",Toast.LENGTH_SHORT).show();

                        handler.postDelayed( this,10000);
                    }

                };

                handler.post(run);
            }
        });
    }
}
