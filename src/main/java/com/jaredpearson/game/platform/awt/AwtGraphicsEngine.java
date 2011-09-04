package com.jaredpearson.game.platform.awt;

import java.awt.image.BufferStrategy;

import com.jaredpearson.game.platform.Graphics2D;
import com.jaredpearson.game.platform.GraphicsEngine;

/**
 * Simple implementation of the graphics engine that uses a AWT buffer strategy.
 * @author jaredp
 */
public class AwtGraphicsEngine
	implements GraphicsEngine
{
	private BufferStrategy strategy;
	private int width;
	private int height;
	
	public AwtGraphicsEngine(BufferStrategy strategy, int width, int height) 
	{
		this.strategy = strategy;
		this.width = width;
		this.height = height;
	}

	/**
	 * {@inheritDoc}
	 */
	public int getHeight() 
	{
		return height;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public int getWidth() 
	{
		return width;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public Graphics2D getGraphics2D() 
	{
		return new AwtGraphics2D((java.awt.Graphics2D)strategy.getDrawGraphics());
	}

	/**
	 * {@inheritDoc}
	 */
	public void show() 
	{
		strategy.show();
	}
}