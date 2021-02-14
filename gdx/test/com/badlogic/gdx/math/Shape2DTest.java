
package com.badlogic.gdx.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class Shape2DTest {

	@Test
	public void testCircle () {
		Circle c1 = new Circle(0, 0, 1);
		Circle c2 = new Circle(0, 0, 1);
		Circle c3 = new Circle(2, 0, 1);
		Circle c4 = new Circle(0, 0, 2);

		assertTrue(c1.overlaps(c1));
		assertTrue(c1.overlaps(c2));
		assertFalse(c1.overlaps(c3));
		assertTrue(c1.overlaps(c4));
		assertTrue(c4.overlaps(c1));
		assertTrue(c1.contains(0, 1));
		assertFalse(c1.contains(0, 2));
		assertTrue(c1.contains(c1));
		assertFalse(c1.contains(c4));
		assertTrue(c4.contains(c1));
	}

	@Test
	public void testRectangle () {
		Rectangle r1 = new Rectangle(0, 0, 1, 1);
		Rectangle r2 = new Rectangle(1, 0, 2, 1);
		assertTrue(r1.overlaps(r1));
		assertFalse(r1.overlaps(r2));
		assertTrue(r1.contains(0, 0));
	}

	@Test
	public void testPolygonRotation(){
		float[] f = { 50.0f, -87.0f,
				-59.0f, -87.0f,
				-100.0f, 0.0f,
				-50.0f,  87.0f,
				50.0f,  87.0f,
				100.0f, 0.0f};

		Polygon p = new Polygon(f);
		p.setRotation(15.0f);

		assertEquals(15f, p.getRotation(),0);
	}

	@Test
	public void testPolygonScale(){
		float[] f = { 50.0f, -87.0f,
				-59.0f, -87.0f,
				-100.0f, 0.0f,
				-50.0f,  87.0f,
				50.0f,  87.0f,
				100.0f, 0.0f};

		Polygon p = new Polygon(f);
		p.setScale(10f,12f);

		assertEquals(10f, p.getScaleX(),0);
		assertEquals(12f, p.getScaleY(),0);
	}

	@Test
	public void testPolygonOrigin(){
		float[] f = { 50.0f, -87.0f,
				-59.0f, -87.0f,
				-100.0f, 0.0f,
				-50.0f,  87.0f,
				50.0f,  87.0f,
				100.0f, 0.0f};

		Polygon p = new Polygon(f);
		p.setOrigin(10f,12f);

		assertEquals(10f, p.getOriginX(),0);
		assertEquals(12f, p.getOriginY(),0);
	}

	@Test
	public void testPolygonPosition(){
		float[] f = { 50.0f, -87.0f,
				-59.0f, -87.0f,
				-100.0f, 0.0f,
				-50.0f,  87.0f,
				50.0f,  87.0f,
				100.0f, 0.0f};

		Polygon p = new Polygon(f);
		p.setPosition(100f,150f);

		assertEquals(100f, p.getX(),0);
		assertEquals(150f, p.getY(),0);
	}

	@Test
	public void testPolygonArea(){
		float[] f = { 50.0f, -87.0f,
				-59.0f, -87.0f,
				-100.0f, 0.0f,
				-50.0f,  87.0f,
				50.0f,  87.0f,
				100.0f, 0.0f};

		Polygon p = new Polygon(f);
		float area = p.area();
		assertEquals(-26491.5, area,0);
	}

	@Test
	public void testPolygonContains(){
		float[] f = { 50.0f, -87.0f,
				-59.0f, -87.0f,
				-100.0f, 0.0f,
				-50.0f,  87.0f,
				50.0f,  87.0f,
				100.0f, 0.0f};

		Polygon p = new Polygon(f);
		boolean contain = p.contains(-2f,-1f);
		assertTrue(contain);
	}


	@Test
	public void testPolygonDoesNotContain(){
		float[] f = { 50.0f, -87.0f,
				-59.0f, -87.0f,
				-100.0f, 0.0f,
				-50.0f,  87.0f,
				50.0f,  87.0f,
				100.0f, 0.0f};

		Polygon p = new Polygon(f);
		boolean contain = p.contains(-150,-1f);
		assertFalse(contain);
	}

	@Test
	public void testPolygonVertices(){
		float[] f = { 50.0f, -87.0f,
				-59.0f, -87.0f,
				-100.0f, 0.0f,
				-50.0f,  87.0f,
				50.0f,  87.0f,
				100.0f, 0.0f};

		Polygon p = new Polygon();
		p.setVertices(f);
		assertArrayEquals(f, p.getVertices(),0);
	}

}
