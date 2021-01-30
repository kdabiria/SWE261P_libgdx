package com.badlogic.gdx.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class PartitionTest {

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



}
