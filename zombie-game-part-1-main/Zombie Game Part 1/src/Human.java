
public class Human extends Sprite {

	Human(int x, int y) {
		super(x, y,
				Settings.HUMAN_SIZE,
				Settings.HUMAN_SPEED,
				Settings.HUMAN_IMAGE);
	}

	@Override
	public void updatePosition() {
		int SCARED = 7;
		if (x < dest_x) {
			int min = dest_x - x < speed ? dest_x - x : speed;
			x += min + SCARED;
		} else if (x > dest_x) {
			int min = x - dest_x < speed ? x - dest_x : speed;
			x -= min + SCARED;
		}

		if (y < dest_y) {
			int min = dest_y - y < speed ? dest_y - y : speed;
			y += min + SCARED;
		} else if (y > dest_y) {
			int min = y - dest_y < speed ? y - dest_y : speed;
			y -= min + SCARED;
		}
	}

}
