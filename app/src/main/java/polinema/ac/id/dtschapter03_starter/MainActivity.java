package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSkip, btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
//            intent ke welcome slide calendar
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, WelcomeSlide.class);
                startActivity(i);
                finish();
            }
        }, 1000);
    }
}
