package au.federation.a30333504.fedunigraphicsdemos30333504;

/** IMPORTANT! Change the above package name to match the name of YOUR project's package! **/

import java.util.Random;

import processing.core.PImage;

public abstract class Utils
{
    static Random random = new Random();

    // Method to return a random floating point value within a given range
    public static float randRange(float min, float max)
    {
        return (random.nextFloat() * (max - min)) + min;
    }

    // Method to return a random integer value within a given range (inclusive of min and max)
    public static int randRange(int min, int max)
    {
        //return random.nextInt(max + 1 - min) + min;
        return random.nextInt(max + 1 - min) + min;
    }

}
