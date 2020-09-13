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

public class ConfirmAdapter extends ArrayAdapter<Confirm> {
    private Context mcontext;
    int mResource;

    public ConfirmAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Confirm> objects) {
        super(context, resource, objects);
        mcontext=context;
        mResource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String name=getItem(position).getName();
        String contactno=getItem(position).getNumber();

        State state=new State(name,contactno);

        LayoutInflater inflater=LayoutInflater.from(mcontext);
        convertView=inflater.inflate(mResource,parent,false);

        TextView sname=(TextView)convertView.findViewById(R.id.name);
        TextView scontact=(TextView)convertView.findViewById(R.id.contno);
        sname.setText(name);
        scontact.setText(contactno);

        return convertView;

    }


}
