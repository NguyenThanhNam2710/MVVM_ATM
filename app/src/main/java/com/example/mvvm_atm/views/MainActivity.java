package com.example.mvvm_atm.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mvvm_atm.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chuyenManhinh(View view) {
        Intent intent = new Intent(this, ATMCardActivity.class);
        startActivity(intent);
    }

    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }
}