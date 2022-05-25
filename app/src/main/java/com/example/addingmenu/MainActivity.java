package com.example.addingmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

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

    // inflating menu item to our main Activity

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.new_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }
    // select event handling
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id)
        {
            case R.id.item11:
                Toast.makeText(getApplicationContext(), "SETTINGS SELECTED", Toast.LENGTH_SHORT).show();
                break;

            case R.id.item22:
                Toast.makeText(getApplicationContext(), "LOCATION SELECTED", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item33:
                Toast.makeText(getApplicationContext(), "UPDATE SELECTED", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}