package com.example.mvvm_atm.views;

import androidx.appcompat.app.AppCompatActivity;
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

    private TextView textView;
    private EditText editText;
    private Button btnSend;

    private void init() {
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.edtText);
        btnSend = (Button) findViewById(R.id.btnSend);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAtmcardBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_atmcard);
        init();
        ATM appData = new ATM("NHẬP SỐ THẺ ATM", "Số thẻ ATM người nhận");
        binding.setAppData(appData);
        binding.setViewModel(new ATMCardViewModel());
        binding.executePendingBindings();
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ATMCardActivity.this, "cliked on", Toast.LENGTH_SHORT).show();
            }
        });
    }



}
