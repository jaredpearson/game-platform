package com.jaredpearson.game.demo;

import java.util.ArrayList;
import java.util.List;

import com.jaredpearson.game.platform.GameTime;
import com.jaredpearson.game.platform.Updatable;

/**
 * Processes a list of key frames.
 * @author jaredp
 */
public class Animation
	implements Updatable
{
	private List<KeyFrame> keyFrames = new ArrayList<KeyFrame>();
	
	public Animation(KeyFrame... keyFrames)
	{
		for(KeyFrame keyFrame : keyFrames)
		{
			this.keyFrames.add(keyFrame);
		}
	}
	
	public Animation(List<KeyFrame> keyFrames)
	{
		this.keyFrames.addAll(keyFrames);
	}
	
	public void update(GameTime gameTime) 
	{
		for(KeyFrame keyFrame : keyFrames)
		{
			keyFrame.update(gameTime);
		}
	}
}