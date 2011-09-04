package com.jaredpearson.game.platform;


/**
 * Simple implementation of the platform.
 * @author jaredp
 */
public class SimplePlatform
	implements Platform
{
	private GraphicsEngine graphicsEngine;
	private InputEngine inputEngine;
	private Console console;

	/**
	 * Creates a simple platform.
	 */
	public SimplePlatform(
			GraphicsEngine graphicsEngine, 
			InputEngine inputEngine,
			Console console) 
	{
		this.graphicsEngine = graphicsEngine;
		this.inputEngine = inputEngine;
		this.console = console;
	}

	/**
	 * {@inheritDoc}
	 */
	public GraphicsEngine getGraphicsEngine() 
	{
		return graphicsEngine;
	}

	/**
	 * {@inheritDoc}
	 */
	public InputEngine getInputEngine() 
	{
		return inputEngine;
	}

	/**
	 * {@inheritDoc}
	 */
	public Console getConsole() 
	{
		return console;
	}
}