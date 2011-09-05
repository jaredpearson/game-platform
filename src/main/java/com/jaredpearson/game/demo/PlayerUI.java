package com.jaredpearson.game.demo;

import com.jaredpearson.game.core.Arc;
import com.jaredpearson.game.core.Color;
import com.jaredpearson.game.core.Point;
import com.jaredpearson.game.platform.Drawable;
import com.jaredpearson.game.platform.Graphics2D;
import com.jaredpearson.game.platform.Player;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Represents the UI of the player
 * @author jaredp
 */
public class PlayerUI
	implements Drawable
{
	private static final Logger logger = LoggerFactory.getLogger(PlayerUI.class);
	private int radius = 5;
	private Player player;
	private CollisionManager collisionManager;
	
	public PlayerUI(Player player, CollisionManager collisionManager) 
	{
		this.player = player;
		this.collisionManager = collisionManager;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void draw(Graphics2D graphics) 
	{
		graphics.setColor(Color.WHITE);
		
		//draw the circle around the user
		int diameter = radius * 2;
		graphics.drawArc((int)player.getX() - radius, (int)player.getY() - radius, diameter, diameter, 0, 360);
		
		//draw the dot of the user
		graphics.drawLine((int)player.getX(), (int)player.getY(), (int)player.getX(), (int)player.getY());
		
		Point playerPoint = new Point(player.getX(), player.getY());
		
		this.drawFacingLine(playerPoint, graphics);
		this.drawFieldOfViewCone(graphics, playerPoint);
	}
	
	private void drawFacingLine(Point playerPoint, Graphics2D graphics)
	{
		int facingLineLength = 5;
		drawLine(graphics, playerPoint, player.getFacing(), facingLineLength);
	}
	
	private void drawFieldOfViewCone(Graphics2D graphics, Point playerPoint)
	{
		Arc fovHalf = player.getFieldOfView().divide(2);
		
		//draw a line for the FOV left
		Arc fovLeft = player.getFacing().add(fovHalf.negate());
		drawLine(graphics, playerPoint, fovLeft);
		
		//draw a line for the FOV right
		Arc fovRight = player.getFacing().add(fovHalf);
		drawLine(graphics, playerPoint, fovRight);
	}
	
	/**
	 * Draws a line from the specified point at the angle until the edge of the screen or
	 * until a collision occurs.
	 */
	private void drawLine(Graphics2D graphics, Point point, Arc angle)
	{
		double angleRadian = angle.toRadian().toDouble();
		double angleCos = Math.cos(angleRadian);
		double angleSin = Math.sin(angleRadian);
		
		Point collisionPoint = null;
		for(int distance = 0; ; distance++)
		{
			double x = point.getX() + (distance * angleCos);
			double y = point.getY() + (distance * angleSin);
			
			Point checkPoint = new Point((float)x, (float)y);
			if(collisionManager.isCollisionAt(checkPoint))
			{
				logger.debug("Ray collision found at distance {}", distance);
				collisionPoint = checkPoint;
				break;
			}
		}
		
		if(collisionPoint != null)
		{
			graphics.drawLine(
					(int)point.getX(),
					(int)point.getY(),
					(int)collisionPoint.getX(),
					(int)collisionPoint.getY());
		}
		else
		{
			logger.warn("Not drawing ray because no collision found");
		}
	}
	
	/**
	 * Draws a line from the point for the length at the given angle.
	 */
	private void drawLine(Graphics2D graphics, Point point, Arc angle, int length)
	{
		double angleRadian = angle.toRadian().toDouble();
		double x = point.getX() + (length * Math.cos(angleRadian));
		double y = point.getY() + (length * Math.sin(angleRadian));
		graphics.drawLine(
				(int)point.getX(), 
				(int)point.getY(), 
				(int)x, 
				(int)y);
	}
}