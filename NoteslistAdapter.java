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

public class NoteslistAdapter extends ArrayAdapter<Notes> {
    private Context mcontext;
    int mResource;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String date1=getItem(position).getDate1();
        String notification=getItem(position).getNotification();
        String link=getItem(position).getLink();

        Notes notes=new Notes(date1,notification,link);

        LayoutInflater inflater=LayoutInflater.from(mcontext);
        convertView=inflater.inflate(mResource,parent,false);

        TextView datee=(TextView)convertView.findViewById(R.id.date1);
        TextView notifin=(TextView)convertView.findViewById(R.id.notification);
        TextView link1=(TextView)convertView.findViewById(R.id.link);

        datee.setText(date1);
        notifin.setText(notification);
        link1.setText(link);


        return convertView;

    }

    public NoteslistAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Notes> objects) {
        super(context, resource, objects);
        mcontext=context;
        mResource=resource;


    }
}
