package com.depeloper.jhe.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BukuResult {
    @SerializedName("bukus")
    @Expose
    private List<Buku> bukus = null;

    public List<Buku> getBukus() {
        return bukus;
    }

    public void setBukus(List<Buku> bukus) {
        this.bukus = bukus;
    }
}
