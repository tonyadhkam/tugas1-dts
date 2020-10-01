package polinema.ac.id.dtschapter03_starter;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import Adapter.Adapter;
import fragment.welcome.Assign;
import fragment.welcome.Calendar;
import fragment.welcome.SuperHero;

public class WelcomeSlide extends AppCompatActivity {

    public Adapter adapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide);

        viewPager = findViewById(R.id.vp);
        tabLayout = findViewById(R.id.tl);

        adapter = new Adapter(getSupportFragmentManager());
        adapter.addFragment(new Calendar(),"");
        adapter.addFragment(new Assign(),"");
        adapter.addFragment(new SuperHero(),"");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }


}
