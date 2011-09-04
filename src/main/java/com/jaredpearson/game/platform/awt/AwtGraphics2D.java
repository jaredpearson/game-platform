package com.jaredpearson.game.platform.awt;

import com.jaredpearson.game.core.Color;
import com.jaredpearson.game.core.Point;
import com.jaredpearson.game.platform.Graphics2D;

/**
 * 2D graphics implementation for AWT {@link java.awt.Graphics2D} object.
 * @author jaredp
 */
public class AwtGraphics2D 
	implements Graphics2D
{
	private java.awt.Graphics2D inner;
	
	public AwtGraphics2D(java.awt.Graphics2D inner) 
	{
		this.inner = inner;
	}
	
	public void setColor(Color color) 
	{
		this.inner.setColor(convertColor(color));
	}
	
	public void drawArc(int x, int y, int width, int height, int startAngle,
			int arcAngle) 
	{
		this.inner.drawArc(x, y, width, height, startAngle, arcAngle);
	}
	
	public void drawLine(Point point1, Point point2) 
	{
		this.drawLine((int)point1.getX(), (int)point1.getY(), (int)point2.getX(), (int)point2.getY());
	}
	
	public void drawLine(int x1, int y1, int x2, int y2) 
	{
		this.inner.drawLine(x1, y1, x2, y2);
	}
	
	public void dispose() 
	{
		this.inner.dispose();
	}
	
	public void fillRectangle(int x, int y, int width, int height) 
	{
		this.inner.fillRect(x, y, width, height);
	}
	
	/**
	 * Converts the game color to the AWT color.
	 */
	private java.awt.Color convertColor(Color color)
	{
		return new java.awt.Color(color.getRed(), color.getGreen(), color.getBlue());
	}
}
