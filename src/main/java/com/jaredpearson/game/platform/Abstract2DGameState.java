package com.jaredpearson.game.platform;

public abstract class Abstract2DGameState 
	implements State
{
	/**
	 * Starts the game life cycle including the game loop.
	 */
	public void start(Platform platform)
	{
		//initialize objects
		this.initialize(platform);
		
		//start the game loop
		long startGameTime = System.currentTimeMillis();
		long lastLoopTime = startGameTime;
		while(true)
		{
			//calculate the game loop time
			GameTime gameTime = new GameTime(System.currentTimeMillis() - startGameTime, System.currentTimeMillis() - lastLoopTime);
			
			//update the entities
			update(gameTime);
			
			//draw the graphics
			Graphics2D graphics = platform.getGraphicsEngine().getGraphics2D();
			try
			{
				draw(graphics);
			}
			finally
			{
				graphics.dispose();
				platform.getGraphicsEngine().show();
			}
		}
	}

	/**
	 * Initializes the objects/entities used in the game.
	 */
	protected abstract void initialize(Platform platform);
	
	/**
	 * Updates the objects/entities with the current time.
	 */
	protected abstract void update(GameTime gameTime);
	
	/**
	 * Draws the objects/entities to the current graphics buffer.
	 */
	protected abstract void draw(Graphics2D graphics);
}
