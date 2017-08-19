package uk.co.peartree_productions.materiallibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import uk.co.peartree_productions.material.RatioLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RatioLayout rl = (RatioLayout) findViewById(R.id.ratio_layout);
    }
}
