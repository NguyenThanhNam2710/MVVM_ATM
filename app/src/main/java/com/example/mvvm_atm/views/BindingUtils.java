package com.example.mvvm_atm.views;

import android.view.View;
import android.widget.Toast;

import androidx.databinding.BindingAdapter;

public class BindingUtils {


    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }

    public static String capitalize(String text) {
        return text.toUpperCase();
    }


    public static String test() {
        return "Nam dep trai";
    }
}
