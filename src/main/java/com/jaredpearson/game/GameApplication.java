package com.jaredpearson.game;

import com.jaredpearson.game.demo.DemoGame;
import com.jaredpearson.game.platform.Game;
import com.jaredpearson.game.platform.Platform;
import com.jaredpearson.game.platform.awt.AwtPlatformFactory;

public class GameApplication 
{
	public static void main(String[] args) 
	{
		(new GameApplication()).run();
	}
	
	public void run()
	{
		//create the platform
		Platform platform = (new AwtPlatformFactory()).createPlatform();
		
		//create the game and start it on the platform
		Game game = new DemoGame();
		game.start(platform);
	}
}

