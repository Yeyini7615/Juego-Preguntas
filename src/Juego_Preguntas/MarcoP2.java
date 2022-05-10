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
		setResizable(false);
		setLocationRelativeTo(null);
		//-------------------------------------------		
		laminaP2=new LaminaP2();
		lamina2.add(laminaP2);
		
		setLayout(new BorderLayout());
		JPanel lamina_botones=new JPanel();
		ok= new JButton("Listo");			
		JButton salir=new JButton("Salir");
		salir.setActionCommand("2");
		ok.addActionListener(new AccionMos2());	
		salir.addActionListener(new EnviaTexto());
		lamina_botones.add(ok);
		lamina_botones.add(salir);		
		contador2=new JLabel();
		contadorM2=new Contador();
		lamina_botones.add(contadorM2.cuenta(10, contador2));
		add(lamina2, BorderLayout.CENTER);
		add(lamina_botones, BorderLayout.SOUTH);
		
		
		}

private LaminaP2 laminaP2;
private JButton ok;
private String nombreJugador;
public JLabel contador2;
public String rutaArchivo;
private Contador contadorM2;

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
			contadorM2.setPuntos(10);
			
	}else {
		JOptionPane.showMessageDialog(null,"Respuesta incorrecta");
		setVisible(false);
	}
	
	}
	}
}
