package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.landmarkbook.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();



        Landmark selectedLandmark = (Landmark) intent.getSerializableExtra("landmark");

        binding.textView2.setText(selectedLandmark.name);
        binding.textView.setText(selectedLandmark.country);
        binding.imageView1.setImageResource(selectedLandmark.image);
    }
}