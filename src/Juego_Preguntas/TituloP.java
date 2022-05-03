package Juego_Preguntas;

import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TituloP extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("Bienvenidos al Juego de Preguntas y Respuestas\nInstrucciones", 125, 100);
		}
}
