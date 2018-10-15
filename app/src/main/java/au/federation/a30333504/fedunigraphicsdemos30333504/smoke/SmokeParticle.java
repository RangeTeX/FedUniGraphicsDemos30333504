package au.federation.a30333504.fedunigraphicsdemos30333504.smoke;

import au.federation.a30333504.fedunigraphicsdemos30333504.Utils;
import processing.core.PApplet;
import processing.core.PImage;

public class SmokeParticle {
    public float x;
    public float y;
    public float alpha;
    public float rotationRads;
    public float particleSize;



    public SmokeParticle(float PosX, float PosY)
    {
        alpha = 255.0f;
        x= PosX;
        y= PosY;
        rotationRads = Utils.randRange(0.0f,6.28f);
        particleSize = Utils.randRange(60.0f,120.0f);


    }

    public void update()
    {
        y -= 4.0f;
        alpha -= 2.0f;
        rotationRads += 0.05;
        particleSize *= 1.008f;
    }

}
