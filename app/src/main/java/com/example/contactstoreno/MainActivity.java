package com.example.contactstoreno;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Contact o1 = new Contact( 1 ,  "9898989898",  "ghulam mustafa");
    Contact o2 = new Contact( 2 ,  "9898989898",  "ghulam mustafa");
    Contact o3 = new Contact( 3 ,  "9898989898",  "ghulam mustafa");
    Contact o4 = new Contact( 4 ,  "9898989898",  "ghulam mustafa");
    Contact o5 = new Contact( 5,  "9898989898",  "ghulam mustafa");
    Contact o6 = new Contact( 6 ,  "9898989898",  "ghulam mustafa");
    Contact o7 = new Contact( 7 ,  "9898989898",  "ghulam mustafa");
    Contact o8 = new Contact( 8 ,  "9898989898",  "ghulam mustafa");
    Contact o9 = new Contact( 9 ,  "9898989898",  "ghulam mustafa");
    Contact o10 = new Contact( 10 ,  "9898989898",  "ghulam mustafa");
    Contact o11 = new Contact( 11 ,  "9898989898",  "ghulam mustafa");
    Contact [] contacts = {o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11};

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter customAdapter = new CustomAdapter(contacts);
        recyclerView.setAdapter(customAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }
}