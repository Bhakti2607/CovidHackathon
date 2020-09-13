package com.example.covidhackathon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class SatelistAdapter extends ArrayAdapter<State> {
    private  Context mcontext;
    int mResource;


    public SatelistAdapter(@NonNull Context context, int resource, @NonNull ArrayList<State> objects) {
        super(context, resource, objects);
        mcontext=context;
        mResource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String statename=getItem(position).getState_name();
        String contactno=getItem(position).getCont_no();

        State state=new State(statename,contactno);

        LayoutInflater inflater=LayoutInflater.from(mcontext);
        convertView=inflater.inflate(mResource,parent,false);

        TextView sname=(TextView)convertView.findViewById(R.id.sname);
        TextView scontact=(TextView)convertView.findViewById(R.id.scontact);
        sname.setText(statename);
        scontact.setText(contactno);

        return convertView;

    }
}
