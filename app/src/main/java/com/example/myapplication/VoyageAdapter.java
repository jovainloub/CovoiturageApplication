package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.myapplication.voyage;

import java.util.ArrayList;
import java.util.List;

public class VoyageAdapter<voyage> extends ArrayAdapter<voyage> {

        private Context context;
        private List<voyage> voyages;

        public VoyageAdapter(Context context, List<voyage> voyages) {
            super(context, 0, voyages);
            this.context = context;
            this.voyages = voyages;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Inflate the view for each item in the list
            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.profilconducteur2, parent, false);
            }

            // Get the voyage for this position in the list
            voyage voyageur = voyages.get(position);

            // Set the text for the voyage name and destination
            TextView nameTextView = convertView.findViewById(R.id.trip_name);
            TextView departTextView = convertView.findViewById(R.id.trip_depart);
            TextView destinationTextView = convertView.findViewById(R.id.trip_destination);
            TextView Jour_voyageTextView = convertView.findViewById(R.id.trip_jour);

            nameTextView.setText(((com.example.myapplication.voyage) voyageur).getNom());
            departTextView.setText(((com.example.myapplication.voyage) voyageur).getDepart());
            destinationTextView.setText(((com.example.myapplication.voyage) voyageur).getDestination());
            Jour_voyageTextView.setText(((com.example.myapplication.voyage) voyageur).getJourVoyage());




            return convertView;
        }
    }
