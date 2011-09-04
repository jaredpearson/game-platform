package com.jaredpearson.game.platform;

import java.io.PrintStream;


/**
 * Simple implementation that prints all messages to the stream.
 * @author jaredp
 */
public class SimpleConsole
	implements Console
{
	private PrintStream printStream;
	
	public SimpleConsole(PrintStream printStream) 
	{
		this.printStream = printStream;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void writeStatus(String message)
	{
		printStream.println(message);
	}
}