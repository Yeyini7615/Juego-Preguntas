package Juego_Preguntas;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

class MarcoP5 extends Contador {
		
		public MarcoP5() {
			setVisible(true);
			setBounds(550,300,550,400);
			setTitle("Astrofisicanuclear");
			JPanel lamina5=new JPanel();
			lamina5.setLayout(new BorderLayout());
			setResizable(false);
			setLocationRelativeTo(null);
			//-------------------------------------------		
			laminaP5=new LaminaP5();
			lamina5.add(laminaP5);
			
			setLayout(new BorderLayout());
			JPanel lamina_botones=new JPanel();
			ok= new JButton("Listo");			
			JButton salir=new JButton("Salir");
			salir.setActionCommand("5");
			ok.addActionListener(new AccionMos4());	
			salir.addActionListener(new EnviaTexto());
			lamina_botones.add(ok);
			lamina_botones.add(salir);		
			contador=new JLabel();
			contadorM5=new Contador();
			lamina_botones.add(contadorM5.cuenta(50, contador));
			add(lamina5, BorderLayout.CENTER);
			add(lamina_botones, BorderLayout.SOUTH);
			
			
			}

	private LaminaP5 laminaP5;
	private JButton ok;
	private String mensajeLose ="Te has retirado, tu puntaje se guardara. Ingresa tu nombre";
	private String nombreJugador;
	public int  puntos=0;
	public String rutaArchivo;
	private Contador contadorM5;
	private JLabel contador;

	public void contador(int puntos) {
		contador.setText("Punto: "+ puntos);
		puntos=this.puntos;
	}

	class AccionMos4 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(laminaP5.dameseleccion().equals("Todos son radioactivos")||laminaP5.dameseleccion().equals("Hidrogeno")||laminaP5.dameseleccion().equals("La gravedad")||laminaP5.dameseleccion().equals("El Gran Colicionador de Hadrones")||laminaP5.dameseleccion().equals("Enana Amarilla de Tipo GII")) {
				setVisible(false);
				Marco_Win marco= new Marco_Win();
				marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				contadorM5.setPuntos(50);
		}else {
			JOptionPane.showMessageDialog(null,"Respuesta incorrecta");
			setVisible(false);
		}
		
	}
	}
}	