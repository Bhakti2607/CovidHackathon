package com.example.covidhackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class Confirmation extends AppCompatActivity {
    ListView confirmlist;
    SearchView searchView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        confirmlist = findViewById(R.id.confirmlist);
        searchView5 = findViewById(R.id.searchView5);

        Confirm cont= new Confirm("Arun Patil","8753445404");
        Confirm a= new Confirm("Manish Pradesh","8753445404");
        Confirm b= new Confirm("Kapil Pradesh","8753445404");
        Confirm c= new Confirm("Akshay Pradesh","8753445404");
        Confirm d= new Confirm("Rahuk Pradesh","8753445404");
        Confirm e= new Confirm("Nitin Pradesh","8753445404");
        Confirm f= new Confirm("Arun Pradesh","8753445404");
        Confirm g= new Confirm("Neha Pradesh","8753445404");
        Confirm h= new Confirm("Sayali Pradesh","8753445404");
        Confirm i= new Confirm("Pooja Pradesh","8753445404");
        Confirm j= new Confirm("Ritu Pradesh","8753445404");


        ArrayList<Confirm> Dashlist1=new ArrayList<>();
        Dashlist1.add(cont);
        Dashlist1.add(a);
        Dashlist1.add(b);
        Dashlist1.add(c);
        Dashlist1.add(d);
        Dashlist1.add(e);
        Dashlist1.add(f);
        Dashlist1.add(g);
        Dashlist1.add(h);
        Dashlist1.add(i);
        Dashlist1.add(j);



        final ConfirmAdapter adapter = new ConfirmAdapter(this,R.layout.tableconfirm,Dashlist1);
        confirmlist.setAdapter(adapter);

    }
}