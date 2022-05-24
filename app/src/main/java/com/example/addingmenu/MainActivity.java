package com.example.addingmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    LinearLayout mLinearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.button);
        mLinearLayout = findViewById(R.id.linearLayout);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // getting inflater object
                LayoutInflater inflater = getLayoutInflater();

                // receiving our custom layout as view to add in our layout
                View view1 = inflater.inflate(R.layout.new_layout,null);

                mLinearLayout.setOrientation(LinearLayout.VERTICAL);
                mLinearLayout.addView(view1);

            }
        });




    }
}