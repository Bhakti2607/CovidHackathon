package com.example.covidhackathon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DashlistAdapter extends ArrayAdapter<Dash> {
    private Context mcontext;
    int mResource;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String statename=getItem(position).getSatename();
        String ruralhosp=getItem(position).getRuralHosp();
        String ruralbeds=getItem(position).getRuralbeds();
        String urbanhosp=getItem(position).getUrbanHosp();
        String urbanbeds=getItem(position).getUrbanBeds();
        String totalhosp=getItem(position).getTotalHosp();
        String totalbeds=getItem(position).getTotalBeds();

        Dash dashh=new Dash(statename,ruralhosp,ruralbeds,urbanhosp,urbanbeds,totalhosp,totalbeds);

        LayoutInflater inflater=LayoutInflater.from(mcontext);
        convertView=inflater.inflate(mResource,parent,false);

        TextView sname=(TextView)convertView.findViewById(R.id.dashboardcontent);
        TextView rhosp=(TextView)convertView.findViewById(R.id.dashboardcontent1);
        TextView rbed=(TextView)convertView.findViewById(R.id.dashboardcontent2);
        TextView uhosp=(TextView)convertView.findViewById(R.id.dashboardcontent3);
        TextView ubed=(TextView)convertView.findViewById(R.id.dashboardcontent4);
        TextView thosp=(TextView)convertView.findViewById(R.id.dashboardcontent5);
        TextView tbed=(TextView)convertView.findViewById(R.id.dashboardcontent6);


        sname.setText(statename);
        rhosp.setText(ruralhosp);
        rbed.setText(ruralbeds);
        ubed.setText(urbanhosp);
        uhosp.setText(urbanbeds);
        thosp.setText(totalhosp);
        tbed.setText(totalbeds);



        return convertView;
    }

    public DashlistAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Dash> objects) {
        super(context, resource, objects);
        mcontext=context;
        mResource=resource;

    }
}
