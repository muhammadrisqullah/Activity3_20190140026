package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {
    TextView tvnama,tvnomor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);
        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");
        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);
        switch(nama)
        {
            case "Inayah":
                tvnama.setText("Inayah M");
                tvnomor.setText("081234567890");
                break;
            case "Ilham":
                tvnama.setText("Ilham R");
                tvnomor.setText("082345678901");
                break;
            case "Eris":
                tvnama.setText("Eris J");
                tvnomor.setText("083456789012");
                break;
            case "Fikri":
                tvnama.setText("M Fikri");
                tvnomor.setText("084567890123");
                break;
            case "Maul":
                tvnama.setText("Maul M");
                tvnomor.setText("085678901234");
                break;
            case "Intan":
                tvnama.setText("Intan S");
                tvnomor.setText("086789012345");
                break;
            case "Vina":
                tvnama.setText("Vina R");
                tvnomor.setText("087890123456");
                break;
            case "Gita":
                tvnama.setText("Gita S");
                tvnomor.setText("088901234567");
                break;
            case "Lutfi":
                tvnama.setText("Lutfi M");
                tvnomor.setText("089012345678");
                break;
            case "Vian":
                tvnama.setText("Vian M");
                tvnomor.setText("080123456789");
                break;
        }
    }
}