package com.jaredpearson.game.core;

/**
 * Implementations provide angles within the system.  This provides an
 * encapsulation of the types of angles that can be represented in the system.  
 * @see ArcDegree
 * @see ArcRadian
 * @author jaredp
 */
public interface Arc
{
	/**
	 * Converts an angle to an integer. Check the implementation to see
	 * when truncation will occur.
	 */
	public int toInt();
	
	/**
	 * Converts the angle to an integer. Check the implementation to see
	 * when truncation will occur.
	 */
	public double toDouble();
	
	/**
	 * Adds an angle to this angle and returns the result as a new Angle.
	 */
	public Arc add(Arc arc);
	
	/**
	 * Divides the angle by the specified value and returns the result as a new angle.
	 */
	public Arc divide(double value);
	
	/**
	 * Returns a new angle that is the negation of the current angle.
	 */
	public Arc negate();
	
	/**
	 * Converts an angle to radians.
	 */
	public ArcRadian toRadian();
	
	/**
	 * Converts an angle to degrees.
	 */
	public ArcDegree toDegree();
}