package com.example.mvvm_atm.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mvvm_atm.R;
import com.example.mvvm_atm.databinding.ActivityMainBinding;
import com.example.mvvm_atm.viewmodels.ViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.data.setViewModel(new ViewModel());
    }
}