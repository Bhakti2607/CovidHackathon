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

public class MedlistAdapter extends ArrayAdapter<Med> {
    private Context mcontext;
    int mResource;

    public MedlistAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Med> objects) {
        super(context, resource, objects);
        mcontext=context;
        mResource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        String state =getItem(position).getStatename();
        String  iname=getItem(position).getInstitutename();
        String  city=getItem(position).getCity();
        String  type=getItem(position).getType();
        String  admcap=getItem(position).getAdmission_capacity();
        String  hospbeds=getItem(position).getHosp_beds();

        Med medd=new Med(state,iname,city,type,admcap,hospbeds);

        LayoutInflater inflater=LayoutInflater.from(mcontext);
        convertView=inflater.inflate(mResource,parent,false);

        TextView sname1=(TextView)convertView.findViewById(R.id.textView);
        TextView iname1=(TextView)convertView.findViewById(R.id.textView2);
        TextView city1=(TextView)convertView.findViewById(R.id.textView3);
        TextView type1=(TextView)convertView.findViewById(R.id.textView4);
        TextView admcap1=(TextView)convertView.findViewById(R.id.textView5);
        TextView hospbeds1=(TextView)convertView.findViewById(R.id.textView6);


        sname1.setText(state);
        iname1.setText(iname);
        city1.setText(city);
        type1.setText(type);
        admcap1.setText(admcap);
        hospbeds1.setText(hospbeds);



        return convertView;

    }
}
