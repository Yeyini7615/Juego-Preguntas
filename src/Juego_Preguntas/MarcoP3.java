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

 class MarcoP3 extends JFrame {
	
	public MarcoP3() {
		setVisible(true);
		setBounds(550,300,550,400);
		setTitle("Geopolitica y Geografia");
		JPanel lamina3=new JPanel();
		lamina3.setLayout(new BorderLayout());
		//-------------------------------------------		
		laminaP3=new LaminaP3();
		lamina3.add(laminaP3);
		
		setLayout(new BorderLayout());
		JPanel lamina_botones=new JPanel();
		ok= new JButton("Listo");			
		JButton salir=new JButton("Salir");
		ok.addActionListener(new AccionMos3());	
		salir.addActionListener(new AccionSalir());
		lamina_botones.add(ok);
		lamina_botones.add(salir);		
		contador=new JLabel();
		Contador contadorM3=new Contador();
		lamina_botones.add(contadorM3.cuenta(20, contador));
		add(lamina3, BorderLayout.CENTER);
		add(lamina_botones, BorderLayout.SOUTH);
		
		
		}

private LaminaP3 laminaP3;
private JButton ok;
private String mensajeLose ="Te has retirado, tu puntaje se guardara. Ingresa tu nombre";
private String nombreJugador;
public JLabel contador;
public String rutaArchivo;


class AccionMos3 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(laminaP3.dameseleccion().equals("Fronteras,hinterland,heartland,comunicaciones")||laminaP3.dameseleccion().equals("Por accion violenta")||laminaP3.dameseleccion().equals("El punto Nemo")||laminaP3.dameseleccion().equals("Un continente")||laminaP3.dameseleccion().equals("11.034 metros de profundidad")) {
			setVisible(false);
			MarcoP4 marco= new MarcoP4();
			Contador prueba=new Contador();
			prueba.setPuntos(20);
			System.out.println(prueba.getPuntos());
			
			
	}else {
		System.out.println("2");
	}
	
}
}
class AccionSalir implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		nombreJugador =JOptionPane.showInputDialog(MarcoP3.this, mensajeLose, "Has perdido", 1);
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
	


