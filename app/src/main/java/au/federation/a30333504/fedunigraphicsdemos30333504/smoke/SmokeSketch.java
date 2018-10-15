package au.federation.a30333504.fedunigraphicsdemos30333504.smoke;

import android.util.Log;

import java.util.ArrayList;
import java.util.Iterator;

import processing.core.PApplet;
import processing.core.PImage;

public class SmokeSketch extends PApplet {
    static int screenWidth;
    static int screenHeight;
    PImage backgroundImage;
    PImage smokeImage;
    ArrayList<SmokeParticle> smokeParticleList = new ArrayList<SmokeParticle>();

    public void settings()
    {
        size(displayWidth,displayHeight);
        fullScreen(P2D);
    }

    public void setup()
    {
        screenWidth = displayWidth;
        screenHeight = displayHeight;
        backgroundImage = loadImage("bonfire_background.png");
        smokeImage = loadImage("smoke_particle.png");
        backgroundImage.resize(screenWidth, screenHeight);

    }

    public void draw()
    {

        image(backgroundImage, 0.0f, 0.0f);
        for (int i = 0; i < touches.length; i++)
        {

            SmokeParticle sp = new SmokeParticle(touches[i].x, touches[i].y);
            smokeParticleList.add(sp);
        }

        // Loop over all out particles using an iterator to avoid concurrent modification errors
        Iterator<SmokeParticle> spIter = smokeParticleList.iterator();
        while (spIter.hasNext()) {
            SmokeParticle sp = spIter.next();

            if (sp.alpha < 0) {
                spIter.remove();
                Log.d("Test", "" + sp.alpha);
            } else {

                /** WRITE LOGIC HERE SO THAT IF sp.alpha is <= 0 you call spIter.remove() to remove
                 the particle from the list...
                 ...otherwise if the particle alpha is greater than zero we do the following.. **/
                // Move coordinate system to be centred on and rotated to orientation of particle
                translate(sp.x, sp.y);
                rotate(sp.rotationRads);
                // Set the alpha via a call to tint and draw the image at the origin
                tint(255, sp.alpha);
                image(smokeImage, 0.0f, 0.0f, sp.particleSize, sp.particleSize);
                // Un-rotate & move coordinate system back to screen origin (i.e. top left of screen)
                rotate(-sp.rotationRads);
                translate(-sp.x, -sp.y);
                // Update the particle so it rises, grows in size, rotates and alpha is decreased
                Log.d("Test", "" + sp.alpha);
                sp.update();
            } // End of while loop over smoke particles
        }
        }
}
