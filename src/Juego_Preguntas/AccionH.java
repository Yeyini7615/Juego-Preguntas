package Juego_Preguntas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class AccionH implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		LeerHisto acc=new LeerHisto();
		acc.lee();
		
	}

}
class LeerHisto{
	public void lee() {
		
		try {
			FileReader entrada=new FileReader("src/Juego_Preguntas/Historial.txt");
			BufferedReader buffer=new BufferedReader(entrada);
			
			while(mensaje!=null) {
				mensaje=buffer.readLine();
				System.out.println(mensaje);
				
			}
			entrada.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, mensaje, "Hola", 1);
		
	}
	public String mensaje;

}

