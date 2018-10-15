package au.federation.a30333504.fedunigraphicsdemos30333504.snow;

import android.util.Log;

import java.util.ArrayList;

import au.federation.a30333504.fedunigraphicsdemos30333504.R;
import processing.core.PApplet;
import processing.core.PImage;

public class SnowSketch extends PApplet {

    //SnowParticle ParticleArray[] = new SnowParticle[300];
    ArrayList<SnowParticle> ParticleArray = new ArrayList<SnowParticle>();

    static int screenWidth;
    static int screenHeight;
    PImage backgroundImage;



    public void settings()
    {
        size(displayWidth,displayHeight);
    }

    public void setup()
    {
        screenWidth = displayWidth;
        screenHeight = displayHeight;
        backgroundImage = loadImage("mountain_background.jpg");
        backgroundImage.resize(screenWidth, screenHeight);

    for (int i = 0; i < 300; i++)
    {
        ParticleArray.add(new SnowParticle());
    }

    }


    public void draw()
    {
        image(backgroundImage, 0.0f, 0.0f);
        for (int i = 0; i < 300; i++)
        {
           SnowParticle sp = ParticleArray.get(i);
            stroke(sp.colour);
            strokeWeight(sp.particleSize);
            point(sp.x, sp.y);
            sp.update();

        }


    }


}
