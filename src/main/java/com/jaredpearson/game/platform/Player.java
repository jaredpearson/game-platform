package com.jaredpearson.game.platform;

import com.jaredpearson.game.core.Arc;
import com.jaredpearson.game.core.ArcDegree;

/**
 * Represents the player.
 * @author jaredp
 */
public class Player
	implements Movable
{
	private Arc facing = ArcDegree.DEGREE_0;
	private float x;
	private float y;
	private float moveDistance = 2f;
	private Arc fieldOfView = new ArcDegree(60);
	
	public float getX() 
	{
		return x;
	}
	
	public float getY() 
	{
		return y;
	}
	
	public void setFacing(Arc facing) 
	{
		this.facing = facing;
	}
	
	public Arc getFacing() 
	{
		return facing;
	}
	
	/**
	 * Gets the player's field of view.
	 */
	public Arc getFieldOfView() 
	{
		return fieldOfView;
	}
	
	/**
	 * Sets the player's field of view.
	 */
	public void setFieldOfView(Arc fieldOfView) 
	{
		this.fieldOfView = fieldOfView;
	}
	
	/**
	 * Gets the distance the user moves 
	 */
	public float getMoveDistance() 
	{
		return moveDistance;
	}
	
	public void moveTo(float x, float y) 
	{
		this.x = x;
		this.y = y;
	}
}