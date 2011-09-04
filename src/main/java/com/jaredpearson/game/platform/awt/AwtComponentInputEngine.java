package com.jaredpearson.game.platform.awt;

import java.awt.Component;

import com.jaredpearson.game.platform.InputEngine;
import com.jaredpearson.game.platform.KeyListener;

/**
 * Input Engine implementation that uses an AWT component to receive input from
 * the user. 
 * @author jaredp
 */
public class AwtComponentInputEngine
	implements InputEngine
{
	private Component component;
	
	/**
	 * Creates a new input engine that uses the input events triggered by an AWT 
	 * component.
	 */
	public AwtComponentInputEngine(Component component) 
	{
		this.component = component;
	}

	/**
	 * {@inheritDoc}
	 */
	public void addKeyListener(KeyListener keyListener) 
	{
		this.component.addKeyListener(new AwtKeyListenerAdapter(keyListener));
	}
}