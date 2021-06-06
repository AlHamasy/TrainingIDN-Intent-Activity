package id.asad.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import id.asad.intentactivity.databinding.ActivityMoveDataBinding;

public class MoveDataActivity extends AppCompatActivity {

    private ActivityMoveDataBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMoveDataBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String nama = getIntent().getStringExtra("NAMA");
        int umur = getIntent().getIntExtra("UMU", 0);
        double tinggi = getIntent().getDoubleExtra("TINGG", 0.0);

        binding.tvNama.setText(nama);
        binding.tvUmur.setText(String.valueOf(umur));
        binding.tvTinggi.setText(String.valueOf(tinggi));

    }
}