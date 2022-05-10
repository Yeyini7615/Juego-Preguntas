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
		setResizable(false);
		setLocationRelativeTo(null);
		//-------------------------------------------		
		laminaP1=new LaminaP1();
		lamina1.add(laminaP1);
		
		setLayout(new BorderLayout());
		JPanel lamina_botones=new JPanel();
		ok= new JButton("Listo");			
		salir=new JButton("Salir");
		salir.setActionCommand("1");
		ok.addActionListener(new AccionMos());	
		salir.addActionListener(new EnviaTexto());
		lamina_botones.add(ok);
		lamina_botones.add(salir);		
		contador=new JLabel();
		contadorM1=new Contador();
		lamina_botones.add(contadorM1.cuenta(0, contador));
		add(lamina1, BorderLayout.CENTER);
		add(lamina_botones, BorderLayout.SOUTH);
		
		
		}

private LaminaP1 laminaP1;
private JButton ok, salir;
private String mensajeLose ="Te has retirado, tu puntaje se guardara. Ingresa tu nombre";
private String nombreJugador;
public String rutaArchivo;
public JLabel contador;	
private Contador contadorM1;

class AccionMos extends PaqueteEnvio implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(laminaP1.dameseleccion().equals("entre 4 y 6 Litros")||laminaP1.dameseleccion().equals("Rusia y Vaticano")||laminaP1.dameseleccion().equals("Don Quijote")||laminaP1.dameseleccion().equals("Sodio y Cloro")||laminaP1.dameseleccion().equals("Infinitos")) {
			setVisible(false);
			datos.setScore(10);
			MarcoP2 marco=new MarcoP2();
			contadorM1.setPuntos(10);
		
			
			
	}else {
		JOptionPane.showMessageDialog(null,"Respuesta incorrecta");
		
	}
	
   }
 }
}



