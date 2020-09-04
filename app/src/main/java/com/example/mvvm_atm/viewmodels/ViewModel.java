package com.example.mvvm_atm.viewmodels;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;

import com.example.mvvm_atm.BR;

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

        }

    }

    private String successMessage = "check was successful";
    private String errorMessage = "check false";

    @Bindable
    public String toastMessage = null;


    public String getToastMessage() {
        Log.e("toast", "getToastMessage");
        return toastMessage;
    }


    private void setToastMessage(String toastMessage) {

        Log.e("toast", "setToastMessage");
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    public void onLoginClicked() {
        if (input.length() == 0) {
            Log.e("toast", "errorMessage");
            setToastMessage(errorMessage);
        } else
            Log.e("toast", "successMessage");
        setToastMessage(successMessage);
    }


    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }
}
