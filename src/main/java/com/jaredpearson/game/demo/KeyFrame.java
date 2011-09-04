package com.jaredpearson.game.demo;

import com.jaredpearson.game.platform.GameTime;
import com.jaredpearson.game.platform.Updatable;

/**
 * Key frames are Updatables that can be triggered at the specified game time.
 * @author jaredp
 */
public class KeyFrame
	implements Updatable
{
	private long time;
	private Updatable updatable;
	private boolean finished;
	
	public KeyFrame(long time, Updatable updatable) 
	{
		this.time = time;
		this.updatable = updatable;
	}
	
	public void update(GameTime gameTime) 
	{
		if(!finished && gameTime.getTotalGameTime() >= time)
		{
			if(this.updatable != null)
			{
				this.updatable.update(gameTime);
			}
			this.finished = true;
		}
	}
	
	public boolean isFinished() 
	{
		return finished;
	}
}