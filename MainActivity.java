package com.depeloper.jhe.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.depeloper.jhe.myapplication.adapter.BukuAdapter;
import com.depeloper.jhe.myapplication.model.Buku;
import com.depeloper.jhe.myapplication.model.BukuResult;
import com.depeloper.jhe.myapplication.network.APIClient;
import com.depeloper.jhe.myapplication.network.BukuService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    private static String EXTRA = "extra";
    String pengarang = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtSearch = (EditText)findViewById(R.id.edt_search);
        edtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                pengarang = edtSearch.getText().toString().trim();
                loadBuku(pengarang);
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        loadBuku("");
    }

    private void loadBuku(String pengarang) {
        BukuService service = APIClient.getRetrofit().create(BukuService.class);
        Call<BukuResult> bukus = service.getBuku(pengarang);
        bukus.enqueue(new Callback<BukuResult>() {
            @Override
            public void onResponse(Call<BukuResult> call, Response<BukuResult> response) {
                tampilkan(response.body().getBukus());
            }

            @Override
            public void onFailure(Call<BukuResult> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "GAGAL",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void tampilkan(List<Buku> bukus) {
        BukuAdapter bukuAdapter = new BukuAdapter(this, R.layout.item_buku, bukus);
        listView = (ListView)findViewById(R.id.list_buku);
        listView.setAdapter(bukuAdapter);
        bukuAdapter.notifyDataSetChanged();
    }
}
