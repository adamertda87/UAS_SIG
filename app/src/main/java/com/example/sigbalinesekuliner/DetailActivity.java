package com.example.sigbalinesekuliner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    TextView datanama, datajambuka;
    Button btncall;
    ImageView datagambar;

    public static String id, nama, jambuka, tlpn, gambar;
    public static Double latitude, longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datanama=findViewById(R.id.nama_warung);
        datajambuka=findViewById(R.id.jam_buka);
        btncall=findViewById(R.id.btn_call);
        datagambar=findViewById(R.id.gambar_warung);

        Picasso.get().load(gambar).into(datagambar);

        datanama.setText(nama);
        datajambuka.setText(jambuka);

        btncall.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+tlpn));
        startActivity(call);
    }
}
