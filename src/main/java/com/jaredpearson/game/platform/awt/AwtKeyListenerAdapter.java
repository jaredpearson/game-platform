package com.jaredpearson.game.platform.awt;

import com.jaredpearson.game.platform.KeyListener;

/**
 * Adapter class for converting a {@link KeyListener} to and AWT KeyListener.
 * @author jaredp
 */
public class AwtKeyListenerAdapter
	implements java.awt.event.KeyListener
{
	private KeyListener inner;
	
	public AwtKeyListenerAdapter(KeyListener inner) 
	{
		this.inner = inner;
	}

	/**
	 * {@inheritDoc}
	 */
	public void keyTyped(java.awt.event.KeyEvent e) 
	{
		e.consume();
	}

	/**
	 * {@inheritDoc}
	 */
	public void keyPressed( java.awt.event.KeyEvent e) 
	{
		inner.keyPressed(new AwtKeyEventAdapter(e));
		e.consume();
	}

	/**
	 * {@inheritDoc}
	 */
	public void keyReleased(java.awt.event.KeyEvent e) 
	{
		inner.keyReleased(new AwtKeyEventAdapter(e));
		e.consume();
	}
}