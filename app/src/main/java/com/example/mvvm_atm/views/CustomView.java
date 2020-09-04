package com.example.mvvm_atm.views;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import com.example.mvvm_atm.R;
import com.example.mvvm_atm.databinding.ActivityAtmcardBinding;
import com.example.mvvm_atm.viewmodels.ATMCardViewModel;

public class CustomView extends RelativeLayout {

    LayoutInflater mInflater;
    DataBindingUtil binding;

    public CustomView(Context context) {
        super(context);
        mInflater = LayoutInflater.from(context);
        init();
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        binding.setContentView((Activity) context.getApplicationContext(), R.layout.activity_atmcard);

    }

    public CustomView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mInflater = LayoutInflater.from(context);
        init();
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mInflater = LayoutInflater.from(context);
        init();
    }

    public void init() {
        View v = mInflater.inflate(R.layout.activity_atmcard, this, true);

    }
}