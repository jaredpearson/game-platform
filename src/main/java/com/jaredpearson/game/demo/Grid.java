package com.jaredpearson.game.demo;

import com.jaredpearson.game.core.Color;
import com.jaredpearson.game.core.Point;
import com.jaredpearson.game.platform.Drawable;
import com.jaredpearson.game.platform.Graphics2D;

/**
 * Object that draws a 2D grid
 * @author jaredp
 */
public class Grid
	implements Drawable
{
	private Point center;
	private float height;
	private float width;
	
	public Grid(float x, float y, float width, float height) 
	{
		this.center = new Point(x, y);
		this.width = width;
		this.height = height;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void draw(Graphics2D graphics) 
	{
		//draw horizontal lines
		for(int i = (int)center.getY(); i < height; i++)
		{
			if(i % 10 == 0)
			{
				if(i % 100 == 0)
				{
					graphics.setColor(Color.GRAY);
				}
				else
				{
					graphics.setColor(Color.DARK_GRAY);
				}
				graphics.drawLine(0, i, (int)this.width, i);
			}
		}
		
		//draw vertical lines
		for(int i = (int)center.getX(); i < width; i++)
		{
			if(i % 10 == 0)
			{
				if(i % 100 == 0)
				{
					graphics.setColor(Color.GRAY);
				}
				else
				{
					graphics.setColor(Color.DARK_GRAY);
				}
				graphics.drawLine(i, 0, i,(int)this.height);
			}
		}
	}
}