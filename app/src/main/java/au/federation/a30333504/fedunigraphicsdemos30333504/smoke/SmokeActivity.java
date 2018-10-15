package au.federation.a30333504.fedunigraphicsdemos30333504.smoke;
import au.federation.a30333504.fedunigraphicsdemos30333504.R;
import processing.android.PFragment;
import processing.core.PApplet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;


public class SmokeActivity extends AppCompatActivity {
    public static LinearLayout mainlayout;
    private PApplet sketch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smoke);
        mainlayout = (LinearLayout)findViewById(R.id.smokeLinearLayout);
        sketch = new SmokeSketch();
        PFragment fragment = new PFragment(sketch);
        fragment.setView(mainlayout,this);
    }
}
