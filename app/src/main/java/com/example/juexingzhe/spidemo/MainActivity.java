package com.example.juexingzhe.spidemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;
    Button mButton;
    StringBuilder mStringBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView)findViewById(R.id.tv);
        mButton = (Button)findViewById(R.id.btn);

        mStringBuilder = new StringBuilder();

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadModule();
            }
        });

    }

    private void loadModule(){
        String display = "";
        mButton.setClickable(false);
        while (DisplayFactory.getSingleton().hasNextDisplay()){
            display = DisplayFactory.getSingleton().getDisplay().display();
            mStringBuilder.append(display).append("\n");
        }
        mTextView.setText(mStringBuilder.toString());
    }



}
