import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Sprite implements GraphicsUpdater {

    protected Image image;
    protected int x;
    protected int y;
    protected int dest_x;
    protected int dest_y;
    protected int size;
    protected int speed = 10;

    Sprite(int x, int y, int size, int speed, String imagePath) {
        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException ioe) {
            System.out.println("Unable to load image file.");
        }
        setPos(x, y);
        setDest(x, y);
        setSize(size);
        setSpeed(speed);
    }

    Sprite(Sprite s) {
        this.x = s.x;
        this.y = s.y;
        this.dest_x = s.dest_x;
        this.dest_y = s.dest_y;
        this.size = s.size;
        this.speed = s.speed;
        this.image = s.image;
    }

    public abstract void updatePosition();

    /**
     * Implementation of {@link GraphicsUpdater#update}.
     *
     * @param g
     *          The {@link Graphics} object to be modified.
     */
    @Override
    public void update(Graphics g) {
        g.drawImage(image, x, y, size, size, null);
    }

    // Misc. setters and getters
    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setDest(int x, int y) {
        dest_x = x - getSize() / 2;
        dest_y = y - getSize() / 2;
    }

    public void setPos(int x, int y) {
        this.x = x - getSize() / 2;
        this.y = y - getSize() / 2;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
