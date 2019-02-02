package com.ejcafe.android.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.ejcafe.android.demo.animate.PropertyAnimationActivity;

public class MainActivity extends AppCompatActivity {
    private ListView listView = null;
    private ArrayAdapter<String> adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        adapter = new ArrayAdapter<>(this,
                R.layout.text_item,
                R.id.item_text,
                new String[]{
                        "Property animation",
                        "Animate drawable graphics",
                });
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((AdapterView<?> parent, View view, int position, long id) -> {
            String text = ((TextView) view).getText().toString();
            if (text.equals("Property animation")) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, PropertyAnimationActivity.class));
            } else if (text.equals("Animate drawable graphics")) {

            } else {
                Toast.makeText(MainActivity.this, "Unknown Parameters", Toast.LENGTH_LONG).show();
            }
        });
    }
}
