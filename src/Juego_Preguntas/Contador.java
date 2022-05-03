package Juego_Preguntas;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Contador extends JFrame {

	public JLabel cuenta(int puntos, JLabel a) {
		puntos=this.puntos;
		a.setText("Punto: "+ puntos);
		return a;
		
	}
	public int puntos;
	public JLabel contador;	
	public JLabel contador2;
	public JLabel contador3;
}
