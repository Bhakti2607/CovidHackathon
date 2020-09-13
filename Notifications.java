package com.example.covidhackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;

public class Notifications extends AppCompatActivity {
ListView notificationList;
SearchView search1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

      //  datetext=findViewById(R.id.datetext);
       // notificationtext=findViewById(R.id.notificationtext);
       // linktext=findViewById(R.id.linktext);

        notificationList = findViewById(R.id.notificationList);
        search1 = findViewById(R.id.search1);


        Notes interArrival= new Notes("02-08-2020","International Arrival","https://pib.gov.in/newsite/pmreleases.aspx?mincode=31");
        Notes a= new Notes("02-08-2020","International Arrival","https://www.mohfw.RevisedguidelinesforInternationalArrivals02082020.pdf");
        Notes b= new Notes("02-08-2020","International Arrival","https://www.mohfw.gov.in/pdf/Guidelinesforinternationalarrivals.pdf");
        Notes c= new Notes("02-08-2020","International Arrival","https://www.mohfw.Guidelinesfordomestictravel(airortrainorinter-statebustravel).pdf");
        Notes d= new Notes("02-08-2020","International Arrival","https://www.mohfw.gov.in/pdf/DGSOrder04of2020.pd");
        Notes e= new Notes("02-08-2020","International Arrival","https://www.mohfw.gov.in/pdf/Traveladvisory.pdf");
        Notes f= new Notes("02-08-2020","International Arrival","https://www.mohfw.gov.in/pdf/SOPQuarantineofPassengers.pdf");
        Notes g= new Notes("02-08-2020","International Arrival","https://www.mohfw.gov.in/pdf/TravelAdvisory17thMarch.pdf");
        Notes h= new Notes("02-08-2020","International Arrival","hhttps://www.mohfw.gov.in/pdf/TravelAdvisory16thMarch.pdf");
        Notes i= new Notes("02-08-2020","International Arrival","https://www.mohfw.winstructionsDt14032020Restirctiononinternationalpassengertraffic.pdf");
        Notes j= new Notes("02-08-2020","International Arrival","https://www.mohfw.NewinstructionsDt14032020Restirctiononinternationalpassengertraffic.pdf");
        Notes k= new Notes("02-08-2020","International Arrival","https://facebook.com");
        Notes l= new Notes("02-08-2020","International Arrival","https://www.mohfw.gov.in/Dt14032020Restirctiononinternationalpassengertraffic.pdf");
        Notes m= new Notes("02-08-2020","International Arrival","https://facebook.com");
        Notes n= new Notes("02-08-2020","International Arrival","https://facebook.com");
        Notes o= new Notes("02-08-2020","International Arrival","https://www.mohfw.gov.in/Dt14032020Restirctiononinternationalpassengertraffic.pdf");
        Notes p= new Notes("02-08-2020","International Arrival","https://facebook.com");
        Notes q= new Notes("02-08-2020","International Arrival","https://facebook.com");
        Notes r= new Notes("02-08-2020","Restrictions-COVID 19","https://www.mohfw.gov.in/pdf/NewinstructionsDt14032020Restirctiononinternationalpassengertraffic.pdf");
        Notes s= new Notes("02-08-2020","International Arrival","https://facebook.com");
        Notes u= new Notes("02-08-2020","International Arrival","https://facebook.com");
        Notes v= new Notes("02-08-2020","International Arrival","https://www.mohfw.gov.in/pdf/NewinstructionsDt14032020Restirctiononinternationalpassengertraffic.pdf");
        Notes w= new Notes("02-08-2020","International Arrival","https://facebook.com");
        Notes x= new Notes("02-08-2020","International Arrival","https://facebook.com");
        Notes y= new Notes("02-08-2020","Restrictions on International passenger traffic through land check posts-COVID 19","https://www.mohfw.gov.in/pdf/NewinstructionsDt14032020Restirctiononinternationalpassengertraffic.pdf");
        Notes z= new Notes("02-08-2020","International Arrival","https://facebook.com");
        Notes aa= new Notes("02-08-2020","Restrictions on International passenger traffic through land check posts-COVID 19","https://facebook.com");
        Notes bb= new Notes("02-08-2020","International Arrival","https://www.mohfw.gov.in/pdf/NewinstructionsDt14032020Restirctiononinternationalpassengertraffic.pdf");
        Notes cc= new Notes("02-08-2020","International Arrival","https://facebook.com");
        Notes dd= new Notes("02-08-2020","International Arrival","https://facebook.com");
        Notes ee= new Notes("02-08-2020","International Arrival","https://www.mohfw.gov.in/pdf/NewinstructionsDt14032020Restirctiononinternationalpassengertraffic.pdf");


        ArrayList<Notes> Noteslist=new ArrayList<>();
        Noteslist.add(interArrival);
        Noteslist.add(a);
        Noteslist.add(b);
        Noteslist.add(c);
        Noteslist.add(d);
        Noteslist.add(e);
        Noteslist.add(f);
        Noteslist.add(g);
        Noteslist.add(h);
        Noteslist.add(i);
        Noteslist.add(j);
        Noteslist.add(k);
        Noteslist.add(l);
        Noteslist.add(m);
        Noteslist.add(n);
        Noteslist.add(o);
        Noteslist.add(p);
        Noteslist.add(q);
        Noteslist.add(r);
        Noteslist.add(s);
        Noteslist.add(u);
        Noteslist.add(v);
        Noteslist.add(w);
        Noteslist.add(x);
        Noteslist.add(y);
        Noteslist.add(z);
        Noteslist.add(aa);
        Noteslist.add(bb);
        Noteslist.add(cc);
        Noteslist.add(dd);
        Noteslist.add(ee);


        final NoteslistAdapter adapter = new NoteslistAdapter(this,R.layout.tablenotification,Noteslist);
        notificationList.setAdapter(adapter);
    }
}