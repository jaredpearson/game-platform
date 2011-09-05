package com.jaredpearson.game.demo;

import com.jaredpearson.game.core.Point;

/**
 * Interface for entities that can cause collision.
 * @author jaredp
 */
public interface Collidable 
{
	/**
	 * Determines if a collision occurs at the following point.
	 * @return Returns <code>true</code> when a collision occurs.
	 */
	public boolean isCollisionAt(Point point);
}
