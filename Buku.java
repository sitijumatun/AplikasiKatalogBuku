package com.depeloper.jhe.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Buku {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("sampul")
    @Expose
    private String sampul;
    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("pengarang")
    @Expose
    private String pengarang;
    @SerializedName("tahun_terbit")
    @Expose
    private String tahunTerbit;
    @SerializedName("isbn")
    @Expose
    private String isbn;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSampul() {
        return sampul;
    }

    public void setSampul(String sampul) {
        this.sampul = sampul;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}

