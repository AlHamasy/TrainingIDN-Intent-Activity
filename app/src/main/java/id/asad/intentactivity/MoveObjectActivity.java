package id.asad.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import id.asad.intentactivity.databinding.ActivityMoveObjectBinding;

public class MoveObjectActivity extends AppCompatActivity {

    private ActivityMoveObjectBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMoveObjectBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Mobil mbl = getIntent().getParcelableExtra("MOBIL");

        binding.tvMerek.setText(mbl.getMerek());
        binding.tvPlatNomor.setText(mbl.getPlatNomor());
        binding.tvKodePlat.setText(String.valueOf(mbl.getKodePlat()));
        binding.tvTahun.setText(String.valueOf(mbl.getTahun()));
        binding.tvKilometer.setText(String.valueOf(mbl.getKilometer()));
        binding.tvKondisi.setText(mbl.isKondisi() ? "Baru" : "Bekas");
    }
}