package com.example.covidhackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class ContactHelpline extends AppCompatActivity {
ListView contactlist;
SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_helpline);

        contactlist = findViewById(R.id.contactlist);
        searchView = findViewById(R.id.searchView);

        State Andhra_Pradesh = new State("Andhra Pradesh","98632617178");
        State Arunachal_Pradesh = new State("Arunachal Pradesh","98632617178");
        State Assam = new State("Assam","98632617178");
        State Bihar = new State("Bihar","98632617178");
        State Chhattisgarh = new State("Chhattisgarh","98632617178");
        State Goa = new State("Goa","98632617178");
        State Gujarat = new State("Gujarat","98632617178");
        State Haryana = new State("Haryana","98632617178");
        State Himachal_Pradesh = new State("Himachal Pradesh","98632617178");

        State Jharkhand = new State("Maharashtra","98632617178");
        State Karnataka = new State("Karnataka","98632617178");
        State Kerala = new State("Kerala","98632617178");
        State Madhya_Pradesh= new State("Madhya Pradesh","98632617178");

        State Maharashtra = new State("Maharashtra","98632617178");
        State Manipur = new State("Manipur","98632617178");
        State Meghalaya = new State("Meghalaya","98632617178");
        State Mizoram = new State("Mizoram","98632617178");
        State Nagaland = new State("Nagaland","98632617178");
        State Odisha = new State("Odisha","98632617178");
        State Punjab = new State("Punjab","98632617178");
        State Rajasthan = new State("Rajasthan","98632617178");
        State Sikkim = new State("Sikkim","98632617178");
        State Tamil_nadu = new State("Tamil Nadu","98632617178");
        State Tripura = new State("Tripura","98632617178");
        State Uttarakhand = new State("Uttarakhand","98632617178");
        State Uttar_Pradesh = new State("Uttar Pradesh","98632617178");
        State west_bengal = new State("West Bengal","98632617178");
        State AndamanNicobar = new State("Andaman & Nicobar","98632617178");
        State Chandigarh = new State("Chadigarh","98632617178");
        State Dadranagar = new State("Dadra & Nagar Haveli","98632617178");
        State damandiu = new State("Daman & Diu","98632617178");
        State Delhi = new State("Delhi","98632617178");
        State jammu = new State("Jammu & Kashmir","98632617178");
        State Ladakh = new State("Ladakh","98632617178");
        State lakshdweep = new State("Lakshadweep","98632617178");
        State puducherry = new State("Puducherry","98632617178");






        ArrayList<State> statelist=new ArrayList<>();
        statelist.add(Andhra_Pradesh);

        statelist.add(Maharashtra);
        statelist.add(Arunachal_Pradesh);
        statelist.add(Assam);

        statelist.add(Chhattisgarh);
        statelist.add(Bihar);
        statelist.add(Goa);
        statelist.add(Gujarat);
        statelist.add(Haryana);
        statelist.add(Himachal_Pradesh);
        statelist.add(Jharkhand);
        statelist.add(Karnataka);
        statelist.add(Kerala);
        statelist.add(Madhya_Pradesh);
        statelist.add(Manipur);
        statelist.add(Meghalaya);
        statelist.add(Mizoram);
        statelist.add(Nagaland);
        statelist.add(Odisha);
        statelist.add(Punjab);
        statelist.add(Rajasthan);
        statelist.add(Sikkim);
        statelist.add(Tamil_nadu);
        statelist.add(Tripura);
        statelist.add(Uttarakhand);
        statelist.add(Uttar_Pradesh);
        statelist.add(west_bengal);
        statelist.add(AndamanNicobar);
        statelist.add(Chandigarh);
        statelist.add(Dadranagar);
        statelist.add(damandiu);
        statelist.add(Delhi);
        statelist.add(jammu);
        statelist.add(Ladakh);
        statelist.add(lakshdweep);
        statelist.add(puducherry);





        final SatelistAdapter adapter = new SatelistAdapter(this,R.layout.tablescontactslist,statelist);
        contactlist.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return true;
            }
        });
    }
}