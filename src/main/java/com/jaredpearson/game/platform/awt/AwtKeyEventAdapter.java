package com.jaredpearson.game.platform.awt;

import com.jaredpearson.game.platform.KeyEvent;

/**
 * Adapter class for converting an AWT key event to a {@link KeyEvent}.
 * @author jaredp
 */
public class AwtKeyEventAdapter
	implements KeyEvent
{
	private java.awt.event.KeyEvent inner;
	
	public AwtKeyEventAdapter(java.awt.event.KeyEvent inner)
	{
		this.inner = inner;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public int getKeyCode() 
	{
		return inner.getKeyCode();
	}
}