import java.awt.*;
import java.util.*;

public class Ball extends Rectangle {

    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed = 5;

// Constructor de la clase Ball, Crea un objeto Ball con la posición inicial (x, y), ancho y alto dados.
Ball(int x, int y, int width, int height) {

    super(x, y, width, height);
    // Crea una instancia de la clase Random para generar números aleatorios
    random = new Random();
    int randomXDirection = random.nextInt(2);
    if (randomXDirection == 0)
        randomXDirection--;
    setXDirection(randomXDirection * initialSpeed);
    // Genera un número aleatorio para determinar la dirección vertical de la pelota
    int randomYDirection = random.nextInt(2);
    // Si el número aleatorio es 0, se establece la dirección a -1, de lo contrario, se establece en 1
    if (randomYDirection == 0)
        randomYDirection--;
    // Establece la dirección vertical multiplicada por la velocidad inicial
    setYDirection(randomYDirection * initialSpeed);
}


    // Establece la dirección horizontal de la pelota
    public void setXDirection(int randomXDirection) {
        xVelocity = randomXDirection;
    }

    // Establece la dirección vertical de la pelota
    public void setYDirection(int randomYDirection) {
        yVelocity = randomYDirection;
    }

    // Mueve la pelota según su dirección
    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    // Dibuja la pelota en el lienzo
    public void draw(Graphics g) {
        Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        g.setColor(randomColor);
        g.fillRect(x, y, height, width);
    }
}
