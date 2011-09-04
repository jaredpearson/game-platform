package com.jaredpearson.game.platform;


/**
 * Listener for when a input key is triggered.
 * @author jaredp
 * @see InputEngine#addKeyListener(KeyListener)
 */
public interface KeyListener
{
	/**
	 * Invoked when a key is pressed.
	 */
	public void keyPressed(KeyEvent e);
	
	/**
	 * Invoked when a key is released.
	 */
	public void keyReleased(KeyEvent e);
}