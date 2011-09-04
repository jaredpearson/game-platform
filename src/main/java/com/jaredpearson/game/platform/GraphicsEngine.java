package com.jaredpearson.game.platform;

/**
 * Implementing classes provide an interface for accessing the 
 * current graphics technology on the platform. 
 * @author jaredp
 */
public interface GraphicsEngine
{
	/**
	 * Gets the height of the drawable area in pixels
	 */
	public int getHeight();
	
	/**
	 * Gets the width of the drawable area in pixels
	 */
	public int getWidth();
	
	/**
	 * Gets the 2D graphics object referencing the current buffer.
	 */
	public Graphics2D getGraphics2D();
	
	/**
	 * Shows the current buffer to the screen.
	 */
	public void show();
}