package com.badlogic.gdx.math;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;



public class MockitoTest {
    private Polygon polygon;

    @Spy
    private Vector2 vector2 = new Vector2(2.0f, 4.0f);

    @Before
    public void setup() {
        polygon = mock(Polygon.class);
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testContainsMethod() {
        when(polygon.contains(2.0f, 4.0f)).thenReturn(true);
        boolean check = polygon.contains(2.0f, 4.0f);
        assertTrue(check);
    }

    @Test
    public void testContainWithVector () {
        when(polygon.contains(vector2)).thenReturn(true);
        boolean check = polygon.contains(vector2);
        assertTrue(check);
    }

    @Test
    public void testgetX() {
        doReturn(2.0f).when(polygon).getX();
        float value = polygon.getX();

        assertEquals(2.0f, value, 0.0002);
    }
}
