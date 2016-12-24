package com.techpalle.dialogexp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b,b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= (Button) findViewById(R.id.button1);
        b1= (Button) findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCustomFrag myCustomFrag=new MyCustomFrag();
                myCustomFrag.show(getSupportFragmentManager(),null);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              MyCustomfra2 myCustomfra2=new MyCustomfra2();
                myCustomfra2.show(getSupportFragmentManager(),null);
            }
        });
    }
}
