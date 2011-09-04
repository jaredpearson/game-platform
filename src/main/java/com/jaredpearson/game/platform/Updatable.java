package com.jaredpearson.game.platform;

/**
 * Implementing classes can be updated during the update phase.
 * @author jaredp
 */
public interface Updatable
{
	/**
	 * Updates the entity.
	 */
	public abstract void update(GameTime gameTime);
}