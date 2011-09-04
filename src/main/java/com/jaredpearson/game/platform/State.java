package com.jaredpearson.game.platform;


/**
 * Implementing classes provide a state for the game.  This could be 
 * the game while the user is playing or a menu system.
 * @author jaredp
 */
public interface State
{
	/**
	 * Starts the state with the current platform.
	 */
	public void start(Platform platform);
}