package com.example.mvvm_atm.viewmodels;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;
import androidx.viewpager.widget.PagerAdapter;

import com.example.mvvm_atm.BR;
import com.example.mvvm_atm.R;

import java.util.Locale;

public class ViewModel extends BaseObservable {

    public ViewModel() {
    }

    @Bindable
    private boolean afterTextChanged = false;
    @Bindable
    private boolean visibility = false;
    @Bindable
    private String input = "";

    public boolean getAfterTextChanged() {
        return afterTextChanged;
    }

    public boolean getVisibility() {
        return visibility;
    }


    private void setAfterTextChanged(boolean afterTextChanged) {
        this.afterTextChanged = afterTextChanged;
        notifyPropertyChanged(BR.afterTextChanged);
    }

    private void setVisibility(boolean visibility) {
        this.visibility = visibility;
        notifyPropertyChanged(BR.visibility);
    }


    public void afterTextChanged(CharSequence s) {
        if (s.length() == 0) {
            setAfterTextChanged(false);
            setVisibility(false);
        } else {
            setAfterTextChanged(true);
            setVisibility(true);
            input = String.valueOf(s);
        }

    }


    @Bindable
    public String toastMessage = null;


    public String getToastMessage() {
        Log.e("toast", "getToastMessage");
        return toastMessage;
    }


    private void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    public void onButtonClicked() {
        setToastMessage(input);
    }


    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Bindable
    private int pos;

    public int getPos() {
        return pos;
    }

    private void setAfterItemSelected(int pos) {
        this.pos = pos;
        notifyPropertyChanged(BR.pos);
    }

    public void onSelectItem(AdapterView<?> parent, View view, int pos, long id) {
        Log.e("onSelectItem", pos + "");
        setAfterItemSelected(pos);
    }
}
