package com.example.covidhackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class HospitalDash extends AppCompatActivity {
ListView dashlist;
SearchView search2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_dash);

        dashlist = findViewById(R.id.dashlist);
        search2 = findViewById(R.id.search2);

        Dash hospitaldetail= new Dash("Arunachal Pradesh","208","2136","10","268", "218","2404");
        Dash a= new Dash("Aandhra Pradesh","208","2136","10","268", "218","2404");
        Dash b= new Dash("Bihar","208","2136","10","268", "218","2404");
        Dash c= new Dash("Chhattisgarh","208","2136","10","268", "218","2404");
        Dash d= new Dash("Gujarat","208","2136","10","268", "218","2404");
        Dash e= new Dash("Haryana","208","2136","10","268", "218","2404");
        Dash f= new Dash("Maharashtra","208","2136","10","268", "218","2404");
        Dash g= new Dash("Madhya Pradesh","208","2136","10","268", "218","2404");
        Dash h= new Dash("Puducherry","208","2136","10","268", "218","2404");
        Dash i= new Dash("Rajasthan","208","2136","10","268", "218","2404");
        Dash j= new Dash("Odishaa","208","2136","10","268", "218","2404");

        ArrayList<Dash> Dashlist=new ArrayList<>();
        Dashlist.add(hospitaldetail);
        Dashlist.add(a);
        Dashlist.add(b);
        Dashlist.add(c);
        Dashlist.add(d);
        Dashlist.add(e);
        Dashlist.add(f);
        Dashlist.add(g);
        Dashlist.add(h);
        Dashlist.add(i);
        Dashlist.add(j);



        final DashlistAdapter adapter = new DashlistAdapter(this,R.layout.tabledashlist,Dashlist);
        dashlist.setAdapter(adapter);
    }
}