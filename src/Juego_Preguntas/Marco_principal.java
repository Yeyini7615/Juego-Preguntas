package Juego_Preguntas;

import java.awt.BorderLayout;

import javax.swing.JFrame;

class Marco_principal extends JFrame {
	public Marco_principal(){
		setVisible(true);
		setBounds(550,300,550,400);
		setTitle("Bienvenidos al juego");
		setLayout(new BorderLayout());
		Lamina_botonesP laminaP=new Lamina_botonesP();
		add(laminaP, BorderLayout.SOUTH);
		TituloP titulo=new TituloP();
		add(titulo);
	}

}
