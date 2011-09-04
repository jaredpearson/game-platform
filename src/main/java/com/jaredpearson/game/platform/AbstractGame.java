package com.jaredpearson.game.platform;

public abstract class AbstractGame 
	implements Game
{
	public void start(Platform platform) 
	{
		//allow implementors to do something before game's first state is called.
		this.initialize();
		
		//get the start state and call it
		State state = this.getStartState();
		state.start(platform);
	}
	
	protected void initialize()
	{
	}
	
	protected abstract State getStartState();
}
