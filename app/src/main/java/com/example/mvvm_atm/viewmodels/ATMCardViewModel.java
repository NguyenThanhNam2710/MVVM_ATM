package com.example.mvvm_atm.viewmodels;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.mvvm_atm.BR;
import com.example.mvvm_atm.models.ATM;

public class ATMCardViewModel extends BaseObservable {

    ATM appData = new ATM("NHẬP SỐ THẺ ATM", "Số thẻ ATM người nhận");

    public ATMCardViewModel() {
    }

    @Bindable
    private boolean afterTextChanged = false;

    @Bindable
    private String visibility = "gone";

    public CharSequence getEdtHintImport() {
        return appData.getEdt_hint_import();
    }

    public CharSequence getTitle() {
        return appData.getTv_title();
    }

    public boolean getAfterTextChanged() {
        return afterTextChanged;
    }

    public CharSequence getVisibility() {
        return visibility;
    }

    private void setAfterTextChanged(boolean afterTextChanged) {
        this.afterTextChanged = afterTextChanged;
        notifyPropertyChanged(BR.afterTextChanged);
    }

    private void setVisibility(String visibility) {
        this.visibility = visibility;
        notifyPropertyChanged(BR.visibility);
    }

    public void afterTextChanged(CharSequence s) {
        if (s.length() == 0) {
            setAfterTextChanged(false);
            setVisibility("gone");
        } else {
            setAfterTextChanged(true);
            setVisibility("visible");
        }
    }


}
