package com.jaredpearson.game.platform;


/**
 * Implementing classes provide ways of accessing the input from the platform.
 * @author jaredp
 */
public interface InputEngine
{
	/**
	 * Adds a key listener which is called when the input is pressed by the user.
	 */
	public void addKeyListener(KeyListener keyListener);
}