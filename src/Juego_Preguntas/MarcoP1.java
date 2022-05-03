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

 class MarcoP1 extends Contador {
	
	public MarcoP1() {
		setVisible(true);
		setBounds(550,300,550,400);
		setTitle("Cultura General.");
		JPanel lamina1=new JPanel();
		lamina1.setLayout(new BorderLayout());
		//-------------------------------------------		
		laminaP1=new LaminaP1();
		lamina1.add(laminaP1);
		
		setLayout(new BorderLayout());
		JPanel lamina_botones=new JPanel();
		ok= new JButton("Listo");			
		JButton salir=new JButton("Salir");
		ok.addActionListener(new AccionMos());	
		salir.addActionListener(new AccionSalir());
		lamina_botones.add(ok);
		lamina_botones.add(salir);		
		contador=new JLabel();
		Contador contadorM1=new Contador();
		lamina_botones.add(contadorM1.cuenta(0, contador));
		add(lamina1, BorderLayout.CENTER);
		add(lamina_botones, BorderLayout.SOUTH);
		
		
		}

private LaminaP1 laminaP1;
private JButton ok;
private String mensajeLose ="Te has retirado, tu puntaje se guardara. Ingresa tu nombre";
private String nombreJugador;
public String rutaArchivo;
public JLabel contador;	

class AccionMos implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(laminaP1.dameseleccion().equals("entre 4 y 6 Litros")||laminaP1.dameseleccion().equals("Rusia y Vaticano")||laminaP1.dameseleccion().equals("Don Quijote")||laminaP1.dameseleccion().equals("Sodio y Cloro")||laminaP1.dameseleccion().equals("Infinitos")) {
			setVisible(false);
			MarcoP2 marco=new MarcoP2();
			
			
			
	}else {
		System.out.println("222");
	}
	
}
}
class AccionSalir implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		nombreJugador =JOptionPane.showInputDialog(MarcoP1.this, mensajeLose, "Has perdido", 1);
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



