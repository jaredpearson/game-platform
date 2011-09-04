package com.jaredpearson.game.demo;

import com.jaredpearson.game.platform.AbstractGame;
import com.jaredpearson.game.platform.Game;
import com.jaredpearson.game.platform.State;

public class DemoGame
	extends AbstractGame
	implements Game
{
	public DemoGame() 
	{
	}
	
	@Override
	protected State getStartState() 
	{
		return new PlayingGameState();
	}
}
