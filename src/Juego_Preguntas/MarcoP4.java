package Juego_Preguntas;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

class MarcoP4 extends JFrame {
	
	public MarcoP4() {
		setVisible(true);
		setBounds(550,300,550,400);
		setTitle("Biologia");
		JPanel lamina4=new JPanel();
		lamina4.setLayout(new BorderLayout());
		//-------------------------------------------		
		laminaP4=new LaminaP4();
		lamina4.add(laminaP4);
		
		setLayout(new BorderLayout());
		JPanel lamina_botones=new JPanel();
		ok= new JButton("Listo");			
		JButton salir=new JButton("Salir");
		ok.addActionListener(new AccionMos4());	
		salir.addActionListener(new AccionSalir());
		lamina_botones.add(ok);
		lamina_botones.add(salir);		
		contador=new JLabel("Puntos: ");	
		lamina_botones.add(contador);
		add(lamina4, BorderLayout.CENTER);
		add(lamina_botones, BorderLayout.SOUTH);
		
		
		}

private LaminaP4 laminaP4;
private JButton ok;
private String mensajeLose ="Te has retirado, tu puntaje se guardara. Ingresa tu nombre";
private String nombreJugador;
public JLabel contador;
public int  puntos=0;
public String rutaArchivo;

public void contador(int puntos) {
	contador.setText("Punto: "+ puntos);
	puntos=this.puntos;
}

class AccionMos4 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(laminaP4.dameseleccion().equals("Productores, consumidores, desintegradores, componentes inorgánicos")||laminaP4.dameseleccion().equals("Luminosa y oscura.")||laminaP4.dameseleccion().equals("Meiosis.")||laminaP4.dameseleccion().equals("Monocotiledóneas y dicotiledóneas.")||laminaP4.dameseleccion().equals("Verter sustancias a la sangre.")) {
			setVisible(false);
			MarcoP5 marco=new MarcoP5();
			puntos+=10;
			
	}else {
		System.out.println("222");
	}
	
}
}
class AccionSalir implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		nombreJugador =JOptionPane.showInputDialog(MarcoP4.this, mensajeLose, "Has perdido", 1);
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
