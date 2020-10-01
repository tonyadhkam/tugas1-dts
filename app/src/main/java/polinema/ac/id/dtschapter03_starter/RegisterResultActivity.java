package polinema.ac.id.dtschapter03_starter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RegisterResultActivity extends AppCompatActivity {

    // Tambahkan variabel di sini
    TextView tvResultNama, tvResultTanggalLahir, tvResultJenisKelamin, tvResultUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_result);
        // Inisialisasi variabel

        tvResultNama = findViewById(R.id.tvResultNama);
        tvResultTanggalLahir = findViewById(R.id.tvResultTanggalLahir);
        tvResultJenisKelamin = findViewById(R.id.tvResultJenisKelamin);
        tvResultUsername = findViewById(R.id.tvResultUsername);

        String[] stringArray = getIntent().getStringArrayExtra(RegisterActivity.Key_RegisterActivity);

        tvResultNama.setText(stringArray[0]);
        tvResultTanggalLahir.setText(stringArray[1]);
        tvResultJenisKelamin.setText(stringArray[2]);
        tvResultUsername.setText(stringArray[3]);


    }
}
