package com.depeloper.jhe.myapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.depeloper.jhe.myapplication.R;
import com.depeloper.jhe.myapplication.model.Buku;
import com.squareup.picasso.Picasso;

import java.util.List;

public class BukuAdapter extends ArrayAdapter<Buku> {
    public BukuAdapter(@NonNull Context context, int resource, @NonNull List<Buku> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_buku, parent, false
            );
        }

        Buku buku = getItem(position);

        TextView tvJudul = (TextView) convertView.findViewById(R.id.tv_judul);
        tvJudul.setText(buku.getNama());

        TextView tvPengarang = (TextView)convertView.findViewById(R.id.tv_pengarang);
        tvPengarang.setText(buku.getPengarang());

        TextView tvTahun = (TextView)convertView.findViewById(R.id.tv_tahun);
        tvTahun.setText(buku.getTahunTerbit());

        TextView tvISBN = (TextView)convertView.findViewById(R.id.tv_isbn);
        tvISBN.setText(buku.getIsbn());

        ImageView imageView = (ImageView)convertView.findViewById(R.id.img_sampul);
        Picasso.with(convertView.getContext()).load("http://192.168.43.228/katalogbuku/LaraSort/" +buku.getSampul()).into(imageView);

        return convertView;
    }

}
