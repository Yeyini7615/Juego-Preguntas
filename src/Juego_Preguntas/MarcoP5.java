package Juego_Preguntas;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

class MarcoP5 extends JFrame {
		
		public MarcoP5() {
			setVisible(true);
			setBounds(550,300,550,400);
			setTitle("Astrofisicanuclear");
			JPanel lamina5=new JPanel();
			lamina5.setLayout(new BorderLayout());
			//-------------------------------------------		
			laminaP5=new LaminaP5();
			lamina5.add(laminaP5);
			
			setLayout(new BorderLayout());
			JPanel lamina_botones=new JPanel();
			ok= new JButton("Listo");			
			JButton salir=new JButton("Salir");
			ok.addActionListener(new AccionMos4());	
			salir.addActionListener(new AccionSalir());
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
			System.out.println("222");
		}
		
	}
	}
	class AccionSalir implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			nombreJugador =JOptionPane.showInputDialog(MarcoP5.this, mensajeLose, "Has perdido", 1);
			File ruta=new File("src/Juego_Preguntas/Historial.txt");
			rutaArchivo = ruta.getAbsolutePath();
			
			try {
				ruta.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Escribiendo nP=new Escribiendo();
			nP.escribir(rutaArchivo);
			
		}
		
	}
	class Escribiendo{
		public void escribir(String ruta_H)  {
			String mensaje= String.valueOf(nombreJugador)+puntos;
			
			try {
				FileWriter escritura=new FileWriter(rutaArchivo, true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("No se encontro el archivo");
			}
		}
	}
}


