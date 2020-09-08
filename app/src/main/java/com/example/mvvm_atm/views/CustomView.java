package com.example.mvvm_atm.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import com.example.mvvm_atm.R;
import com.example.mvvm_atm.databinding.CustomViewBinding;
import com.example.mvvm_atm.viewmodels.ViewModel;

import java.util.Locale;

public class CustomView extends LinearLayout {

    LayoutInflater mInflater;
    CustomViewBinding binding;
    static Context context;

    public CustomView(Context context) {
        super(context);
        this.context = context;
        mInflater = LayoutInflater.from(context);
        mInflater.inflate(R.layout.custom_view, this, true);
        binding = DataBindingUtil.setContentView((Activity) context, R.layout.custom_view);
        binding.setViewModel(new ViewModel());
        loadLocate();
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

    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }

    @BindingAdapter({"itemChange"})
    public static void itemChange(View view, int pos) {
        Log.e("onSelectItem", pos + "");
        // Toast.makeText(view.getContext(), pos + "", Toast.LENGTH_SHORT).show();
        if (pos == 1) {
            setLocale("vi");
            refeshLayout();
        } else if (pos == 2) {
            setLocale("en");
            refeshLayout();
        }

    }


    private static void refeshLayout() {
        Intent intent = ((Activity) context).getIntent();
        ((Activity) context).overridePendingTransition(0, 0);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        ((Activity) context).finish();
        ((Activity) context).overridePendingTransition(0, 0);
        ((Activity) context).startActivity(intent);
//        ((Activity) context).recreate();
    }

    private static void setLocale(String lang) {
        Log.i("locale", lang);
        Locale locale = new Locale(lang);
        Log.i("Locate", locale.toString());
        Locale.setDefault(locale);
        Configuration configuration = new Configuration();
        configuration.locale = locale;
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        SharedPreferences.Editor editor = context.getSharedPreferences("Setting", context.MODE_PRIVATE).edit();
        editor.putString("My_lang", lang);
        editor.commit();
        editor.apply();
    }

    public void loadLocate() {
        SharedPreferences preferences = context.getSharedPreferences("Setting", context.MODE_PRIVATE);
        String language = preferences.getString("My_lang", "");
        setLocale(language);
    }
}