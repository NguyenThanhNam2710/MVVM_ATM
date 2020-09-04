package com.example.mvvm_atm.views;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;

import com.example.mvvm_atm.R;
import com.example.mvvm_atm.databinding.CustomViewBinding;
import com.example.mvvm_atm.viewmodels.ViewModel;

public class CustomView extends LinearLayout {

    LayoutInflater mInflater;
    CustomViewBinding binding;

    public CustomView(Context context) {
        super(context);
        mInflater = LayoutInflater.from(context);
        mInflater.inflate(R.layout.custom_view, this, true);
        binding = DataBindingUtil.setContentView((Activity) context, R.layout.custom_view);
        binding.setViewModel(new ViewModel());
    }

    public CustomView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mInflater = LayoutInflater.from(context);
        mInflater.inflate(R.layout.custom_view, this, true);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mInflater = LayoutInflater.from(context);
        mInflater.inflate(R.layout.custom_view, this, true);
    }
}