package com.product.kleinashton.restaurantmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private EditText ed;
    private Button bt;
    ArrayList<Word> restaurantName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv =  findViewById(R.id.listres);
        restaurantName = new ArrayList();

        restaurantName.add(new Word("Kabir", "Ahmedabad"));
        restaurantName.add(new Word("Jay Bhole", "Ahmedabad"));
        restaurantName.add(new Word("Jay Ambe", "Ahmedabad"));
        restaurantName.add(new Word("Novotel", "Ahmedabad"));
        restaurantName.add(new Word("Hyatt", "Ahmedabad"));
        restaurantName.add(new Word("Cafe Monk", "Ahmedabad"));
        restaurantName.add(new Word("New York Tag ", "Ahmedabad"));
        restaurantName.add(new Word("Contryard", "Ahmedabad"));
        restaurantName.add(new Word("Pakwan", "Ahmedabad"));

        ResAdapter resAdapter = new ResAdapter(this, restaurantName);
        lv.setAdapter(resAdapter);



    }
}
