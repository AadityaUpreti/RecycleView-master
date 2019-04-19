package com.recyclebin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Create a list of Contact
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("saugat Malla","9860345213","sun","sun@gmail",R.drawable.saugat));
        contactsList.add(new Contacts("Bhuwan","9860345217","Moon","moon@gmail",R.drawable.bhuwan));
        contactsList.add(new Contacts("Rajesh","9860345567","Star","star@gmail",R.drawable.rajesh));
        contactsList.add(new Contacts("noavatar","no phone","Earth","earth@gmail",R.drawable.noavatar));
        contactsList.add(new Contacts("saugat Malla","9860345213","sun","sun@gmail",R.drawable.saugat));
        contactsList.add(new Contacts("Bhuwan","9860345217","Moon","moon@gmail",R.drawable.bhuwan));
        contactsList.add(new Contacts("Rajesh","9860345567","Star","star@gmail",R.drawable.rajesh));
        contactsList.add(new Contacts("noavatar","no phone","Earth","earth@gmail",R.drawable.noavatar));
        contactsList.add(new Contacts("saugat Malla","9860345213","sun","sun@gmail",R.drawable.saugat));
        contactsList.add(new Contacts("Bhuwan","9860345217","Moon","moon@gmail",R.drawable.bhuwan));
        contactsList.add(new Contacts("Rajesh","9860345567","Star","star@gmail",R.drawable.rajesh));
        contactsList.add(new Contacts("noavatar","no phone","Earth","earth@gmail",R.drawable.noavatar));

        //pass this list to adapter

        ContactAdapter contactAdapter = new ContactAdapter(this,contactsList);
        recyclerView.setAdapter(contactAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
    }
}
