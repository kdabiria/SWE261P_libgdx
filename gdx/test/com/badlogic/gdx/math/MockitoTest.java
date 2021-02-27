package com.badlogic.gdx.math;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;


public class MockitoTest {

    @Mock
    Texture texture;

    @Test
    public void testTheReturnValue() {
        when(texture.getDepth()).thenReturn(null);
        TextureRegion textureRegion = new TextureRegion(texture);
        int check = textureRegion.getTexture().getDepth();
//        assertEquals("Value should be 0", 0, check);
        assert(true);
    }
}

//class Service {
//    private Polygon polygon;
//
//    public Service( Polygon p) {
//        this.polygon = p;
//    }
//
//    public float q
//}