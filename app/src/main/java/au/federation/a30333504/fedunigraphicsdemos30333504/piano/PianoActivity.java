package au.federation.a30333504.fedunigraphicsdemos30333504.piano;

import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import au.federation.a30333504.fedunigraphicsdemos30333504.R;


public class PianoActivity extends AppCompatActivity {

    SoundPool pianoSoundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano);
    }
}
