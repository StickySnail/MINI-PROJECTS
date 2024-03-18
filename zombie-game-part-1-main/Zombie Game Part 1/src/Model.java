import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Model is the class
 * that manages all data about
 * game characters.
 * <p>
 * This class implements GraphicsUpdater, which means that
 * it can be used to update a frame of animation.
 * <p>
 * Depends on:
 * <ul>
 * <li>{@link Zombie}
 * </ul>
 * 
 * @author Freddy Falcon
 * @version 1.0.0
 * @since 1.0
 */
public class Model implements GraphicsUpdater {

	private List<Sprite> sprites;
	private Sprite player;

	/**
	 * A Model constructor that creates a Zombie
	 * with a random position.
	 *
	 */
	public Model(int numZombies, int numWerewoolfs) {
		System.out.println("Model()");

		sprites = new ArrayList<Sprite>();

		Random r = new Random();

		for (int i = 0; i < numZombies; i++) {
			int x = r.nextInt(Settings.WIDTH);
			int y = r.nextInt(Settings.HEIGHT);
			Sprite z = new Zombie(x, y);
			sprites.add(z);
		}

		for (int i = 0; i < numWerewoolfs; i++) {
			int x = r.nextInt(Settings.WIDTH);
			int y = r.nextInt(Settings.HEIGHT);
			Sprite w = new Werewolf(x, y);
			sprites.add(w);
		}

	}

	/**
	 * A method that updates the {@link Graphics} object
	 * used by the view. The {@link Zombie} positions are also
	 * updated when this method is called.
	 * 
	 * @param g
	 *          A {@link Graphics} object reference. The model
	 *          can update a {@link Graphics} object with {@link Zombie} data.
	 */
	@Override
	public void update(Graphics g) {
		if (player != null) {
			player.updatePosition();
			player.update(g);
		}

		for (Sprite sprite : sprites) {
			if (player != null)
				sprite.setDest(player.getX(), player.getY());
			sprite.updatePosition();
			sprite.update(g);
		}

	}

	/**
	 * A method for setting the (x, y) coordinates of a the characters
	 * managed by the Model.
	 * 
	 * @param x
	 *          the x-coordinate
	 * @param y
	 *          the y-coordinate
	 */
	public void setSpriteDestinations(int x, int y) {
		if (player == null)
			player = new Human(x, y);
		else
			player.setDest(x, y);

	}

}