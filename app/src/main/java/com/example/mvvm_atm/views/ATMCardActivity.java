package com.example.mvvm_atm.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvvm_atm.R;
import com.example.mvvm_atm.databinding.ActivityAtmcardBinding;
import com.example.mvvm_atm.models.ATM;
import com.example.mvvm_atm.viewmodels.ATMCardViewModel;

public class ATMCardActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAtmcardBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_atmcard);
        binding.setViewModel(new ATMCardViewModel());
        binding.executePendingBindings();
    }


    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }

}
