package com.jaredpearson.game.platform;

/**
 * Keeps track of the current game time.
 * @author jaredp
 */
public class GameTime
{
	private long elapsedGameTime;
	private long totalGameTime;
	
	public GameTime(long totalGameTime, long elapsedGameTime) 
	{
		this.totalGameTime = totalGameTime;
		this.elapsedGameTime = elapsedGameTime;
	}
	
	/**
	 * Gets the amount of time elapsed in the game since the last update.
	 */
	public long getElapsedGameTime() 
	{
		return elapsedGameTime;
	}
	
	/**
	 * Gets the total amount of time since the start of the game.
	 * @return
	 */
	public long getTotalGameTime() 
	{
		return totalGameTime;
	}
}