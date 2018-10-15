package au.federation.a30333504.fedunigraphicsdemos30333504.snow;

import au.federation.a30333504.fedunigraphicsdemos30333504.Utils;

public class SnowParticle {
    public float colour;
    public int particleSize;
    public float x;
    public float y;
    public float xSpeed;
    public float ySpeed;

    public SnowParticle()
    {
        colour = Utils.randRange(128.0f,255.0f);
        particleSize = Utils.randRange(3,13);

        x = Utils.randRange(0,SnowSketch.screenWidth);
        y = Utils.randRange(0,SnowSketch.screenHeight);

        xSpeed = Utils.randRange(1.0f,3.0f);
        ySpeed = Utils.randRange(1.0f,3.0f);
    }
    public void  update()
    {
        x += xSpeed;
        y += ySpeed;
        if (x > SnowSketch.screenWidth)
        {x = 0;}

        if (y > SnowSketch.screenWidth)
        {y = 0;}
    }
}
