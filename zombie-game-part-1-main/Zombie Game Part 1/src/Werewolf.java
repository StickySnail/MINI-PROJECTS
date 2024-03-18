
public class Werewolf extends Sprite {

    Werewolf(int x, int y) {
        super(x, y,
                Settings.WEREWOLF_SIZE,
                Settings.WEREWOLF_SPEED,
                Settings.WEREWOLF_IMAGE);
    }

    @Override
    public void updatePosition() {

        if (x < dest_x) {
            int min = dest_x - x < speed ? dest_x - x : speed;
            x += min;
        } else if (x > dest_x) {
            int min = x - dest_x < speed ? x - dest_x : speed;
            x -= min;
        }

        if (y < dest_y) {
            int min = dest_y - y < speed ? dest_y - y : speed;
            y += min;
        } else if (y > dest_y) {
            int min = y - dest_y < speed ? y - dest_y : speed;
            y -= min;
        }

    }

}
