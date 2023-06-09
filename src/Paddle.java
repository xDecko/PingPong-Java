import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Paddle extends Rectangle {

    private int id;
    private int yVelocity;
    private int speed = 25; // Ajusta la velocidad según tus necesidades
    private Timer timer;

    public Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.id = id;

        timer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                move();
            }
        });
        timer.setInitialDelay(0);
    }

    // Maneja el evento cuando se presiona una tecla
    public void keyPressed(KeyEvent e) {
        switch (id) {
            case 1:
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(-speed);
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(speed);
                }
                break;
            case 2:
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirection(-speed);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(speed);
                }
                break;
        }
    }

    // Maneja el evento cuando se suelta una tecla
    public void keyReleased(KeyEvent e) {
        switch (id) {
            case 1:
                if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(0);
                }
                break;
            case 2:
                if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(0);
                }
                break;
        }
    }

    // Establece la dirección del movimiento vertical del paddle
    public void setYDirection(int yDirection) {
        yVelocity = yDirection;
    }

    // Mueve el paddle en base a la dirección y velocidad
    public void move() {
        y = y + yVelocity;
    }

    // Inicia el movimiento del paddle
    public void startMoving() {
        timer.start();
    }

    // Detiene el movimiento del paddle
    public void stopMoving() {
        timer.stop();
    }

    // Dibuja el paddle en la pantalla
    public void draw(Graphics g) {
        g.setColor(Color.darkGray);
        g.fillRect(x, y, width, height);
    }
}
