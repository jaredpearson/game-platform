package com.jaredpearson.game.demo;

import java.util.List;

import com.jaredpearson.game.core.Point;

/**
 * Manager for collisions detection.
 * @author jaredp
 */
public class CollisionManager 
{
	private List<Object> entities = null;
	private int worldWidth;
	private int worldHeight;
	
	public CollisionManager(List<Object> entities, int worldWidth, int worldHeight) 
	{
		this.entities = entities;
		this.worldHeight = worldHeight;
		this.worldWidth = worldWidth;
	}
	
	/**
	 * Determines if a collision occurs at the following point.
	 * @return Returns <code>true</code> when a collision occurs.
	 */
	public boolean isCollisionAt(Point point)
	{
		//check each entity for collision
		for(Object entity : entities)
		{
			if(entity instanceof Collidable)
			{
				if(((Collidable)entity).isCollisionAt(point))
				{
					return true;
				}
			}
		}
		
		//check world for collision
		if(point.getX() > worldWidth || 
				point.getX() < 0 || 
				point.getY() < 0 || 
				point.getY() > worldHeight)
		{
			return true;
		}
		
		return false;
	}
}
