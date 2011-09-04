package com.jaredpearson.game.core;

/**
 * Implementation of an angle in degrees.
 * @author jaredp
 */
public class ArcDegree
	implements Arc
{
	public final static ArcDegree DEGREE_0 = new ArcDegree(0);
	public final static ArcDegree DEGREE_90 = new ArcDegree(90);
	public final static ArcDegree DEGREE_180 = new ArcDegree(180);
	public final static ArcDegree DEGREE_270 = new ArcDegree(270);
	public final static ArcDegree DEGREE_360 = new ArcDegree(360);
	
	private double degree;

	public ArcDegree(ArcDegree degree)
	{
		this.degree = degree.toDouble();
	}
	
	public ArcDegree(double degree) 
	{
		this.degree = degree;
	}
	
	public ArcDegree(int degree) 
	{
		this.degree = degree;
	}

	/**
	 * {@inheritDoc}
	 */
	public int toInt()
	{
		return (int)degree;
	}

	/**
	 * {@inheritDoc}
	 */
	public double toDouble()
	{
		return degree;
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean equals(Object obj) 
	{
		return this.degree == ((ArcDegree)obj).degree;
	}

	/**
	 * {@inheritDoc}
	 */
	public Arc add(Arc arc)
	{
		ArcDegree degree = arc.toDegree();
		return new ArcDegree(this.degree + degree.toDouble());
	}
	
	/**
	 * {@inheritDoc}
	 */
	public Arc divide(double value)
	{
		return new ArcDegree(this.degree / value);
	}

	/**
	 * {@inheritDoc}
	 */
	public Arc negate() 
	{
		return new ArcDegree(-this.degree);
	}

	/**
	 * {@inheritDoc}
	 */
	public ArcRadian toRadian()
	{
		return new ArcRadian(this.degree * (Math.PI/180));
	}

	/**
	 * {@inheritDoc}
	 */
	public ArcDegree toDegree() 
	{
		return this;
	}
}