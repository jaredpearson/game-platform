package com.jaredpearson.game.platform;


/**
 * Represents the platform to run the game on.
 * @author jaredp
 */
public interface Platform
{
	/**
	 * Gets the current graphics engine.  This engine is
	 * used to draw graphics to the screen.
	 */
	public GraphicsEngine getGraphicsEngine();
	
	/**
	 * Gets the current input engine. This engine is used
	 * to add listeners for input.
	 */
	public InputEngine getInputEngine();
	
	/**
	 * Gets the current console, which allows for the 
	 * game to write messages to a console like screen.
	 */
	public Console getConsole();
}