package com.example.dcs;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class Bustimelist extends ArrayAdapter<Bustime> {
    private Activity context;
    List<Bustime> busestime;

    public Bustimelist(Activity context, List<Bustime> busestime) {
        super(context, R.layout.layout_bustime_list, busestime);
        this.context = context;
        this.busestime = busestime;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.layout_bustime_list, null, true);

        TextView textViewname = (TextView) listViewItem.findViewById(R.id.textViewappointername);
        TextView textViewage = (TextView) listViewItem.findViewById(R.id.textViewappointerage);
        TextView textViewdob = (TextView) listViewItem.findViewById(R.id.textViewappointerdob);
        TextView textViewphone = (TextView) listViewItem.findViewById(R.id.textViewappointerphone);
        TextView textViewaddress = (TextView) listViewItem.findViewById(R.id.textViewappointeraddress);
        TextView textViewbloodgrp = (TextView) listViewItem.findViewById(R.id.textViewappointerbloodgrp);
        TextView textViewngender = (TextView) listViewItem.findViewById(R.id.textViewappointergender);
        TextView textViewdeprt = (TextView) listViewItem.findViewById(R.id.textViewappointmentdeprt);
        TextView textViewtime = (TextView) listViewItem.findViewById(R.id.textViewappointmenttime);
        TextView textViewdate = (TextView) listViewItem.findViewById(R.id.textViewappointmentdate);


        Bustime bustime = busestime.get(position);
        textViewname.setText(bustime.getAppointername());
        textViewage.setText(bustime.getAppointerage());
        textViewdob.setText(bustime.getAppointerdob());
        textViewphone.setText(bustime.getAppointerphone());
        textViewaddress.setText(bustime.getAppointeraddress());
        textViewbloodgrp.setText(bustime.getAppointerbloodgrp());
        textViewngender.setText(bustime.getAppointergender());
        textViewdeprt.setText(bustime.getAppointmentdprt());
        textViewtime.setText(bustime.getAppointmenttime());
        textViewdate.setText(bustime.getAppointmentdate());



        return listViewItem;
    }
}
