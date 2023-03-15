package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ConducteurActivity extends AppCompatActivity {
    private  Button mButton_ajoutVoyage;
    private TextView mTextView_Hello;
    private TextView mTextView_Familyname;
    private TextView mTextView_Mail;

    private Button mButton_goodbye;
    private EditText mEditText_PersonName;
    private EditText mEditText_FamilyName;
    private EditText mEditText_Mail;
    List<voyage> voyages = new ArrayList<voyage>();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.profilconducteurfinal);

            ListView mListView_ListVoyage = findViewById(R.id.ListVoyage);

            VoyageAdapter<voyage> adapter;
            adapter = new VoyageAdapter<voyage>(this, voyages);
            mListView_ListVoyage.setAdapter(adapter);

    }

    public void AddTrip(View view) {
        Button mButton_ajoutVoyage = findViewById(R.id.button_ajout_trip);
        if (view ==mButton_ajoutVoyage){
            setContentView(R.layout.ajout_trajet);
        }

        }

    public void onBtnClick(View view) {
        mTextView_Hello = findViewById(R.id.txtMessage);
        mTextView_Familyname=findViewById(R.id.textView3);
        mTextView_Mail=findViewById(R.id.textView4);
        mEditText_PersonName=findViewById(R.id.editTextTextPersonName);
        mEditText_FamilyName=findViewById(R.id.editTextTextPersonName2);
        mEditText_Mail=findViewById(R.id.editTextTextPersonName3);
        mButton_goodbye=findViewById(R.id.button_voyage);
        if (view ==mButton_goodbye){
            String greetings = getString(R.string.voyages) +" "+ mEditText_PersonName.getText().toString();
            mTextView_Hello.setText(greetings);
            mTextView_Familyname.setText(mEditText_FamilyName.getText());
            mTextView_Mail.setText(mEditText_Mail.getText());

            voyages.add(new voyage(mEditText_FamilyName.getText().toString() , "Depart 1","Destination 1", "Jour 1"));


        }


    }

    public void ClickProfil(View view) {
        setContentView(R.layout.profilconducteurfinal);
        ListView mListView_ListVoyage = findViewById(R.id.ListVoyage);
        VoyageAdapter<voyage> adapter;
        adapter = new VoyageAdapter<voyage>(this, voyages);
        mListView_ListVoyage.setAdapter(adapter);
    }
}
