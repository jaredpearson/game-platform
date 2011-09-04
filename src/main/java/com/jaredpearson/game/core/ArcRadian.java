package com.jaredpearson.game.core;

/**
 * Implementation of an angle in radians.
 * @author jaredp
 */
public class ArcRadian
	implements Arc
{
	private double radian;
	
	public ArcRadian(double radian) 
	{
		this.radian = radian;
	}

	/**
	 * {@inheritDoc}
	 */
	public int toInt()
	{
		return (int)radian;
	}

	/**
	 * {@inheritDoc}
	 */
	public double toDouble()
	{
		return radian;
	}

	/**
	 * {@inheritDoc}
	 */
	public ArcRadian toRadian()
	{
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	public ArcDegree toDegree()
	{
		return new ArcDegree(this.radian * (180/Math.PI));
	}

	/**
	 * {@inheritDoc}
	 */
	public Arc add(Arc arc)
	{
		ArcRadian radian = arc.toRadian();
		return new ArcRadian(this.radian + radian.toDouble());
	}
}