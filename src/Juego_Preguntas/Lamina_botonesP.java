package Juego_Preguntas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Lamina_botonesP extends JPanel {
	public Lamina_botonesP() {
		JButton Boton1=new JButton("Nuevo Juego");
		JButton Boton2=new JButton("Historial de juego");
		Boton2.addActionListener(new Historial());
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


}
class Historial implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		LeerHisto n=new LeerHisto();
		n.lee();
	}
	
}
