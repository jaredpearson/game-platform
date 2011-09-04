package com.jaredpearson.game.platform;

import com.jaredpearson.game.core.Color;
import com.jaredpearson.game.core.Point;

public interface Graphics2D 
{
	public void dispose();
	
	public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle);
	public void drawLine(Point point1, Point point2);
	public void drawLine(int x1, int y1, int x2, int y2);
	
	public void setColor(Color color);
	
	/**
	 * Fills the rectangle
	 */
	public void fillRectangle(int x, int y, int width, int height);
}
