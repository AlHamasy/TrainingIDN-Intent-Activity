package id.asad.intentactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import id.asad.intentactivity.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Log.d(TAG, "onCreate");
    }

    // activity
    // first in last out
    // intent implicit = belum jelas tujuannya
    // intent explicit = jelas tujuannya
    public void moveActivity(View view) {

        // intent explicit
        Intent intent = new Intent(MainActivity.this, MoveActivity.class);
        startActivity(intent);
    }

    public void moveDataActivity(View view) {

        String nama = "Adit";
        int umur = 25;
        double tinggi = 168.4;

        // intent explicit
        Intent intent = new Intent(MainActivity.this, MoveDataActivity.class);
        intent.putExtra("NAMA", nama);
        intent.putExtra("UMUR", umur);
        intent.putExtra("TINGGI", tinggi);
        startActivity(intent);
    }

    public void moveObjectActivity(View view) {

        Mobil mbl = new Mobil();
        mbl.setMerek("BMW");
        mbl.setKodePlat('A');
        mbl.setKilometer(12.8);
        mbl.setTahun(2021);
        mbl.setKondisi(true);
        mbl.setPlatNomor("A54D");

        // intent explicit
        Intent intent = new Intent(MainActivity.this, MoveObjectActivity.class);
        intent.putExtra("MOBIL", mbl);
        startActivity(intent);
    }

    public void moveResultActivity(View view) {

        // intent explicit
        Intent intent = new Intent(MainActivity.this, MoveResultActivity.class);
        startActivityForResult(intent,100);
    }

    public void moveApplication(View view) {

        // implicit intent
        // google maps = waze, gmail = yahoo = mail,
        String tel = "0813998877";
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + tel));
        startActivity(intent);
    }

    // dipanggil ketika menggunakan method startActivityForResult
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 100){
            if (resultCode == 200){

                String namaBarang = data.getStringExtra("NAMA-BARANG");
                String jumlahBarang = data.getStringExtra("JUMLAH-BARANG");

                binding.tvJumlahBarang.setText(jumlahBarang);
                binding.tvNamaBarang.setText(namaBarang);
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    public void tampilToast(View view) {

    }
}

























