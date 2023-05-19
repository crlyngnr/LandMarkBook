package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.example.landmarkbook.databinding.ActivityDetailBinding;
import com.example.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ArrayList<Landmark> landmarkArrayList;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();

        //Data
        Landmark pisa = new Landmark("Pisa Tower", "Italy", R.drawable.pisakulesi);
        Landmark eiffel = new Landmark("Eiffel Tower", "France", R.drawable.eyfel);
        Landmark liberty = new Landmark("The Statue of Liberty", "USA", R.drawable.ozgurlukheykeli);
        Landmark london = new Landmark("London Bridge", "UK", R.drawable.londonbridge);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(liberty);
        landmarkArrayList.add(london);

        binding.rec.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.rec.setAdapter(landmarkAdapter);


    }
}