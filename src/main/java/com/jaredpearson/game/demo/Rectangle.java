package com.jaredpearson.game.demo;

import com.jaredpearson.game.core.Color;
import com.jaredpearson.game.core.Point;
import com.jaredpearson.game.platform.Drawable;
import com.jaredpearson.game.platform.Graphics2D;
import com.jaredpearson.game.platform.Movable;

/**
 * Represents a basic rectangle that can be drawn to the screen.
 * @author jaredp
 */
public class Rectangle
	implements Drawable, Movable, Collidable
{
	private Point[] points;
	private float height;
	private float width;
	
	public Rectangle(float x, float y, float width, float height) 
	{
		points = new Point[]{
			new Point(x, y),
			new Point(x + width, y + height),
		};
		this.height = height;
		this.width = width;
	}

	/**
	 * {@inheritDoc}
	 */
	public void draw(Graphics2D graphics) 
	{
		graphics.setColor(Color.RED);
		drawRectangle(graphics, points[0], points[1]);
	}
	
	/**
	 * Draws the rectangle to the screen.
	 */
	private void drawRectangle(Graphics2D graphics, Point point1, Point point2)
	{
		graphics.drawLine(
				(int)point1.getX(), 
				(int)point1.getY(), 
				(int)point2.getX(), 
				(int)point1.getY());
		graphics.drawLine(
				(int)point2.getX(), 
				(int)point1.getY(), 
				(int)point2.getX(), 
				(int)point2.getY());
		graphics.drawLine( 
				(int)point2.getX(), 
				(int)point2.getY(),
				(int)point1.getX(), 
				(int)point2.getY());
		graphics.drawLine(
				(int)point1.getX(), 
				(int)point2.getY(),
				(int)point1.getX(), 
				(int)point1.getY());
	}
	
	public void moveTo(Point point)
	{
		this.moveTo(point.getX(), point.getY());
	}
	
	public void moveTo(float x, float y)
	{
		points[0].setX(x);
		points[0].setY(y);
		
		points[1].setX(points[0].getX() + width);
		points[1].setY(points[0].getY() + height);
	}

	/**
	 * Determines if a collision occurs at the following point.
	 * @return Returns <code>true</code> when a collision occurs.
	 */
	public boolean isCollisionAt(Point point)
	{
		return point.getX() >= this.points[0].getX() && point.getX() < this.points[1].getX()
				&& point.getY() >= this.points[0].getY() && point.getY() < this.points[1].getY();
	}
}