package com.depeloper.jhe.myapplication.network;

import com.depeloper.jhe.myapplication.model.BukuResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BukuService {
    @GET("buku/search/{pengarang}")
    Call<BukuResult> getBuku(@Path("pengarang") String pengarang);
}
