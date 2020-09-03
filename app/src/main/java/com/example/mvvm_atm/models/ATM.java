package com.example.mvvm_atm.models;

public class ATM {
    private String edt_hint_import;
    private String tv_title;
    private String inputType;
    private Number maxlenght;

    public ATM(String inputType) {
        this.inputType = inputType;
    }

    public ATM() {
    }

    public ATM(String edt_hint_import, String tv_title) {
        this.edt_hint_import = edt_hint_import;
        this.tv_title = tv_title;
    }

    public ATM(String edt_hint_import, String tv_title, String inputType, Number maxlenght) {
        this.edt_hint_import = edt_hint_import;
        this.tv_title = tv_title;
        this.inputType = inputType;
        this.maxlenght = maxlenght;
    }

    public Number getMaxlenght() {
        return maxlenght;
    }

    public void setMaxlenght(Number maxlenght) {
        this.maxlenght = maxlenght;
    }

    public String getEdt_hint_import() {
        return edt_hint_import;
    }

    public void setEdt_hint_import(String edt_hint_import) {
        this.edt_hint_import = edt_hint_import;
    }

    public String getTv_title() {
        return tv_title;
    }

    public void setTv_title(String tv_title) {
        this.tv_title = tv_title;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }
}
