package com.jaredpearson.game.platform.awt;

import java.awt.Canvas;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import com.jaredpearson.game.platform.Console;
import com.jaredpearson.game.platform.GraphicsEngine;
import com.jaredpearson.game.platform.InputEngine;
import com.jaredpearson.game.platform.Platform;
import com.jaredpearson.game.platform.SimpleConsole;
import com.jaredpearson.game.platform.SimplePlatform;

/**
 * Factory for creating an AWT platform.
 * @author jaredp
 */
public class AwtPlatformFactory 
{
	/**
	 * Creates the default platform.
	 */
	public Platform createPlatform()
	{
		int width = 640;
		int height = 480;
		
		JFrame frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(width, height);
	    frame.setIgnoreRepaint(true);
	    frame.setResizable(false);
		
		Canvas canvas = new Canvas();
		canvas.setBounds(0, 0, 640, 480);
		canvas.setIgnoreRepaint(true);
		frame.add(canvas);
		
		frame.pack();
		frame.setVisible(true);
		canvas.requestFocusInWindow();
		
		//initialize the double buffer
		canvas.createBufferStrategy(2);
		BufferStrategy strategy = canvas.getBufferStrategy();
		
		//create the platform objects
		Console console = createConsole();
		GraphicsEngine graphicsEngine = new AwtGraphicsEngine(strategy, width, height);
		InputEngine inputEngine = new AwtComponentInputEngine(canvas);
		
		return new SimplePlatform(graphicsEngine, inputEngine, console);
	}
	
	protected Console createConsole()
	{
		return new SimpleConsole(System.out);
	}
}
