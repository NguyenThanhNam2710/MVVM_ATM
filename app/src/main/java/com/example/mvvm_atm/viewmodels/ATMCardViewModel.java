package com.example.mvvm_atm.viewmodels;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.mvvm_atm.BR;

public class ATMCardViewModel extends BaseObservable {

    public ATMCardViewModel() {
    }

    @Bindable
    private boolean afterTextChanged = false;


    public boolean getAfterTextChanged() {
        return afterTextChanged;
    }


    private void setAfterTextChanged(boolean afterTextChanged) {
        this.afterTextChanged = afterTextChanged;
        notifyPropertyChanged(BR.afterTextChanged);
    }

    public void afterTextChanged(CharSequence s) {
        if (s.length() == 0) {
            setAfterTextChanged(false);
        } else {
            setAfterTextChanged(true);
        }
        if(1==1){

        }
    }


}
