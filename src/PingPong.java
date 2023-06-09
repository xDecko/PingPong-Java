import javax.swing.ImageIcon;

public class PingPong {

	public static void main(String[] args) {
		// Ruta de la imagen del icono
		String iconPath = "resources/logo.png"; 

		// Cargar la imagen del icono
		ImageIcon icon = new ImageIcon(iconPath);

		// Crear la ventana del juego
		GameFrame frame = new GameFrame();
		
		// Establecer la imagen del icono para la aplicación
		frame.setIconImage(icon.getImage());
	}
}
