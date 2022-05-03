package Juego_Preguntas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Lamina_botonesP extends JPanel {
	public Lamina_botonesP() {
		JButton Boton1=new JButton("Nuevo Juego");
		JButton Boton2=new JButton("Historial de juego");
		Boton2.addActionListener(new AccionH());
		Boton1.addActionListener(new Accion_botones());
		add(Boton1, BorderLayout.SOUTH);
		add(Boton2, BorderLayout.SOUTH);
		
		
	}

}
class Accion_botones implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		MarcoP1 inicio=new MarcoP1();
	}
class AccionH implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		LeerHisto acc=new LeerHisto();
		acc.lee();
	}
	
}
	
}
