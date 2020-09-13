package com.example.covidhackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MedicalDash extends AppCompatActivity {
ListView medlist;
SearchView search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_dash);

        medlist = findViewById(R.id.medlist);
        search = findViewById(R.id.search);

        Med medetail= new Med("A & N islands","Andaman & Nicobar islands institute od Med sci","Port Blair","Govt","100","460");
        Med a= new Med("Arunachal Pradesh","Arunachal Pradesh institute od Med sci","Port Blair","Govt","110","560");
        Med b= new Med("Aandhra Pradesh","Aandhra Pradeshinstitute od Med sci","Port Blair","Govt","120","480");
        Med c= new Med("Chhattisgarh","Chhattisgarh institute od Med sci","Port Blair","Govt","90","410");
        Med d= new Med("Maharashtra"," Maharashtra institute od Med sci","Port Blair","Govt","130","430");
        Med e= new Med("A & N islands","Andaman & Nicobar islands institute od Med sci","Port Blair","Govt","150","430");
        Med f= new Med("Odisha","Odishaa institute od Med sci","Port Blair","Govt","130","450");
        Med g= new Med("Puducherry","Puducherry institute od Med sci","Port Blair","Govt","130","430");
        Med h= new Med("Gujarat","Gujarat institute od Med sci","Port Blair","Govt","120","480");
        Med i= new Med("Rajasthan","Rajasthan institute od Med sci","Port Blair","Govt","160","410");

        ArrayList<Med> Medlist=new ArrayList<>();
        Medlist.add(medetail);
        Medlist.add(a);
        Medlist.add(b);
        Medlist.add(c);
        Medlist.add(d);
        Medlist.add(e);
        Medlist.add(f);
        Medlist.add(g);
        Medlist.add(h);
        Medlist.add(i);



        final MedlistAdapter adapter = new MedlistAdapter(this,R.layout.tablemeddashlist,Medlist);
        medlist.setAdapter(adapter);
    }
}