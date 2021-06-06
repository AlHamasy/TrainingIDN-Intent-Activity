package id.asad.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.asad.intentactivity.databinding.ActivityMoveResultBinding;

public class MoveResultActivity extends AppCompatActivity {

    private ActivityMoveResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMoveResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnKirimData.setOnClickListener(v -> {

            String namaBarang = binding.edtNamaBarang.getText().toString();
            String jumlahBarang = binding.edtJumlahBarang.getText().toString();

            Intent intent = new Intent();
            intent.putExtra("NAMA-BARANG", namaBarang);
            intent.putExtra("JUMLAH-BARANG", jumlahBarang);
            setResult(200, intent);
            finish();
        });
    }
}