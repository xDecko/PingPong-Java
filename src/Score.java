import java.awt.*;

public class Score extends Rectangle {

	static int GAME_WIDTH;
	static int GAME_HEIGHT;
	int player1;
	int player2;
	
	Score(int GAME_WIDTH, int GAME_HEIGHT) {
		Score.GAME_WIDTH = GAME_WIDTH;
		Score.GAME_HEIGHT = GAME_HEIGHT;
	}

	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.darkGray);
		g2d.setFont(new Font("Tahoma", Font.PLAIN, 35));

		// Establecer el grosor de la línea
		float grosorLinea = 5.0f; 
		g2d.setStroke(new BasicStroke(grosorLinea));
		
		// Dibujar líneas verticales en el centro del campo de juego
		g2d.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
		g2d.drawLine(GAME_WIDTH/2, GAME_HEIGHT/2, GAME_WIDTH/2, GAME_HEIGHT);
		
		// Dibujar la puntuación de los jugadores
		g2d.drawString(String.valueOf(player1/10) + String.valueOf(player1%10), (GAME_WIDTH/2)-95, 30);
		g2d.drawString(String.valueOf(player2/10) + String.valueOf(player2%10), (GAME_WIDTH/2)+50, 30);
	}
}
