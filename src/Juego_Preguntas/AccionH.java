package Juego_Preguntas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
class GuardaDatos{
	public GuardaDatos() {
		CreaArchivo();
		
	}
	
	public String ruta;
	public void CreaArchivo() {
		
		File archivo=new File("src/Juego_Preguntas/Historial.txt");
		ruta=archivo.getAbsolutePath();
		
		try {
			archivo.createNewFile();
		}catch(Exception e) {System.out.println("No se puede crear");};
	}
	public void EscribeArchivo(String mensaje) {
		
		try {
			FileWriter escrito=new FileWriter(ruta,true);
			for( int i=0; i<mensaje.length();i++) {
				escrito.write(mensaje.charAt(i));
			}
			escrito.close();
		}catch(Exception e) {};		
	}
}



