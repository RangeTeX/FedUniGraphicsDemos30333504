package au.federation.a30333504.fedunigraphicsdemos30333504.piano;

import android.media.SoundPool;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import au.federation.a30333504.fedunigraphicsdemos30333504.R;



public class PianoActivity extends AppCompatActivity {

    SoundPool pianoSoundPool;
    private int activePointerId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano);


    }

    public boolean onTouchEvent(MotionEvent event) {
     int pointerIndex = event.getActionIndex();

     int pointerId = event.getPointerId(pointerIndex);
     int maskedAction = event.getActionMasked();

     switch (maskedAction){

         case MotionEvent.ACTION_DOWN:
         case MotionEvent.ACTION_POINTER_DOWN: {
             float x = event.getX(pointerIndex);
             float y = event.getY(pointerIndex);
             Log.d("Action Down", "Action Down| X: " + x + " Y: " + y);
             break;
         }
         case MotionEvent.ACTION_MOVE: {
             int pointerCount = event.getPointerCount();

             for (int i= 0; i < pointerCount; ++i)
             {
                 pointerIndex = i;
                 pointerId = event.getPointerId(pointerIndex);
                 float x = event.getX(pointerIndex);
                 float y = event.getY(pointerIndex);
                 Log.d("Action Move", "Action Move| X: " + x + " Y: " + y);
                 if (x > 0 && x < 250 && y > 650 || x > 0 && x <=150)
                 {
                     Log.d("Key", "Key C HIT" );
                 }
             }

             break;
         }
     }

    return true;
    }
}


