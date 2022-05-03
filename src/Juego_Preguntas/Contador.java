package Juego_Preguntas;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Contador extends JFrame {
	int puntos;

	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public JLabel cuenta(int puntos, JLabel a) {
		
		a.setText("Puntos: "+ puntos);
		puntos=this.puntos;
		return a;
		
	}
	public JLabel contador;	
	public JLabel contador2;
	public JLabel contador3;
	public ArrayList puntosLista;
}
