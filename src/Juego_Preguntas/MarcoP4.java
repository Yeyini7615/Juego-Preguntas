package Juego_Preguntas;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

class MarcoP4 extends Contador {
	
	public MarcoP4() {
		setVisible(true);
		setBounds(550,300,550,400);
		setTitle("Biologia");
		JPanel lamina4=new JPanel();
		lamina4.setLayout(new BorderLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		//-------------------------------------------		
		laminaP4=new LaminaP4();
		lamina4.add(laminaP4);
		
		setLayout(new BorderLayout());
		JPanel lamina_botones=new JPanel();
		ok= new JButton("Listo");			
		JButton salir=new JButton("Salir");
		salir.setActionCommand("4");
		ok.addActionListener(new AccionMos4());	
		salir.addActionListener(new EnviaTexto());
		lamina_botones.add(ok);
		lamina_botones.add(salir);		
		contador=new JLabel();
		contadorM4= new Contador();
		lamina_botones.add(contadorM4.cuenta(30,contador));
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
private Contador contadorM4;

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
			contadorM4.setPuntos(30);
			
			
	}else {
		JOptionPane.showMessageDialog(null,"Respuesta incorrecta");
		setVisible(false);
	}
	
	}
	}


}
