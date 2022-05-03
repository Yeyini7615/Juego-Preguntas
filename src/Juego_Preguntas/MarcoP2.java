package Juego_Preguntas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

 class MarcoP2 extends Contador {
	
	public MarcoP2() {
		setVisible(true);
		setBounds(550,300,550,400);
		setTitle("Fisica");
		JPanel lamina2=new JPanel();
		lamina2.setLayout(new BorderLayout());
		//-------------------------------------------		
		laminaP2=new LaminaP2();
		lamina2.add(laminaP2);
		
		setLayout(new BorderLayout());
		JPanel lamina_botones=new JPanel();
		ok= new JButton("Listo");			
		JButton salir=new JButton("Salir");
		ok.addActionListener(new AccionMos2());	
		salir.addActionListener(new AccionSalir());
		lamina_botones.add(ok);
		lamina_botones.add(salir);		
		contador2=new JLabel("Puntos: ");	
		lamina_botones.add(contador2);
		add(lamina2, BorderLayout.CENTER);
		add(lamina_botones, BorderLayout.SOUTH);
		
		
		}

private LaminaP2 laminaP2;
private JButton ok;
private String mensajeLose ="Te has retirado, tu puntaje se guardara. Ingresa tu nombre";
private String nombreJugador;
public JLabel contador2;
public String rutaArchivo;

public void contador(int puntos) {
	contador.setText("Punto: "+ puntos);
	puntos=this.puntos;
}

class AccionMos2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(laminaP2.dameseleccion().equals("Rad/s")||laminaP2.dameseleccion().equals("9.8N")||laminaP2.dameseleccion().equals("Rodadura")||laminaP2.dameseleccion().equals("Ninguno de los anteriores")||laminaP2.dameseleccion().equals("Energia cinetica y energia potencial gravitatoria")){
			setVisible(false);
			MarcoP3 marco=new MarcoP3();
			
			
	}else {
		System.out.println("222");
	}
	
}
}
class AccionSalir implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		nombreJugador =JOptionPane.showInputDialog(MarcoP2.this, mensajeLose, "Has perdido", 1);
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