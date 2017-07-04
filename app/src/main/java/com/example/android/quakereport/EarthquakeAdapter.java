package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ilafedoseev on 04/07/2017.
 */

class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(@NonNull Context context, @NonNull List<Earthquake> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listViewItem = convertView;
        if(listViewItem == null){
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item,parent,false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView magnityde = (TextView) listViewItem.findViewById(R.id.number);
        magnityde.setText(currentEarthquake.getmMagnitube());

        TextView location = (TextView) listViewItem.findViewById(R.id.location);
        location.setText(currentEarthquake.getmLocation());

        TextView date = (TextView) listViewItem.findViewById(R.id.date);
        date.setText(currentEarthquake.getmDate());

        return listViewItem;
    }
}
