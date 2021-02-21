package com.badlogic.gdx.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class PartitionTest {

    @Test
    public void PolygonTestWithZeroInput(){
        float[] ver = {};
        try{
            Polygon p = new Polygon(ver);
            fail("Should not be able to create the Polygon class");
        }
        catch (IllegalArgumentException e){
            assertEquals("Expecting an exception","polygons must contain at least 3 points.", e.getMessage());
        }
    }



    @Test
    public void PolygonTestWithFiveInput(){
        float[] ver = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        try{
            Polygon p = new Polygon(ver);
            fail("Should not be able to create the Polygon class");
        }
        catch (IllegalArgumentException e){
            assertEquals("Excpecting an exception","polygons must contain at least 3 points.", e.getMessage() );
        }
    }

    @Test
    public void PolygonTestWithSixInput(){
        float[] ver = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f};
        try{
            Polygon p = new Polygon(ver);
            assertEquals("Constructing polygon with array size 6", ver, p.getVertices());
        }
        catch (IllegalArgumentException e){
            fail("Wrong array size");
        }
    }

    @Test
    public void PolygonTestWithMoreThanSixInput(){
        float[] ver = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f};
        try{
            Polygon p = new Polygon(ver);
            assertEquals("Constructing polygon with array size more than SIX", ver, p.getVertices());
        }
        catch (IllegalArgumentException e){
            fail("Wrong array size");
        }
    }

    @Test
    public void BounceWithNum1(){
        try {
            Interpolation.Bounce bounce = new Interpolation.Bounce(1);
            fail("Should not creaeted the class!");
        }
        catch (IllegalArgumentException e){
            assertEquals("Expecting exception", "bounces cannot be < 2 or > 5: 1", e.getMessage());
        }
    }

    @Test
    public void BounceWithNum2(){
        try {
            Interpolation.Bounce bounce = new Interpolation.Bounce(2);
            assertEquals("Size of the widths should be 2", 2, bounce.widths.length);
            assertEquals("Size of the heights should be 2", 2, bounce.heights.length);
        }
        catch (IllegalArgumentException e){
            fail("Should not throw an exception!");
        }
    }

    @Test
    public void BounceWithNum4(){
        try {
            Interpolation.Bounce bounce = new Interpolation.Bounce(4);
            assertEquals("Size of the widths should be 4",  4, bounce.widths.length);
            assertEquals("Size of the heights should be 4", 4, bounce.heights.length);
        }
        catch (IllegalArgumentException e){
            fail("Should not throw an exception!");
        }
    }

    @Test
    public void BounceWithNum5(){
        try {
            Interpolation.Bounce bounce = new Interpolation.Bounce(5);
            assertEquals("Size of the widths should be 5",  5, bounce.widths.length);
            assertEquals("Size of the heights should be 5", 5, bounce.heights.length);
        }
        catch (IllegalArgumentException e){
            fail("Should not throw an exception!");
        }
    }

    @Test
    public void BounceWithNum6(){
        try {
            Interpolation.Bounce bounce = new Interpolation.Bounce(6);
            fail("Should not creaeted the class!");
        }
        catch (IllegalArgumentException e){
            assertEquals("Expecting exception", "bounces cannot be < 2 or > 5: 6", e.getMessage());
        }
    }
}
