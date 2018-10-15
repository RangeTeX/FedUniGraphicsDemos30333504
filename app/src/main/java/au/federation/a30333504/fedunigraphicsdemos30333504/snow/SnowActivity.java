package au.federation.a30333504.fedunigraphicsdemos30333504.snow;
import au.federation.a30333504.fedunigraphicsdemos30333504.R;
import processing.android.PFragment;
import processing.core.PApplet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;


public class SnowActivity extends AppCompatActivity {
    public static LinearLayout mainlayout;
    private PApplet sketch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snow);
        mainlayout = (LinearLayout)findViewById(R.id.snowLinearLayout);
        sketch = new SnowSketch();
        PFragment fragment = new PFragment(sketch);
        fragment.setView(mainlayout,this);

    }

    @Override
    public void onRequestPermissionsResult(int requestCode,String permissions[], int[] grantResults)
    {
        if (sketch != null) {
            sketch.onRequestPermissionsResult(
                    requestCode, permissions, grantResults);
        }

    }
    @Override
    public void onNewIntent(Intent intent) {
        if (sketch != null) { sketch.onNewIntent(intent); }
    }

}
