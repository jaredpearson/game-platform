package com.jaredpearson.game.core;

public class Color 
{
	public final static Color BLACK = new Color(0, 0, 0); 
	public final static Color BLUE = new Color(0, 0, 255); 
	public final static Color DARK_GRAY = new Color(64, 64, 64);
	public final static Color GRAY = new Color(128, 128, 128);
	public final static Color GREEN = new Color(0, 255, 0);
	public final static Color RED = new Color(255, 0, 0);
	public final static Color WHITE = new Color(255, 255, 255);
	
	private int red;
	private int blue;
	private int green;
	
	public Color(int red, int green, int blue)
	{
		//TODO: add validation to values
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	public int getRed() 
	{
		return red;
	}
	
	public int getGreen() 
	{
		return green;
	}
	
	public int getBlue() 
	{
		return blue;
	}
}
