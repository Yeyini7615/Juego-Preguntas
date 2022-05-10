package Juego_Preguntas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

class LeerHisto{
	public void lee() {
		
		try {
			FileReader entrada=new FileReader("src/Juego_Preguntas/Historial.txt");
			BufferedReader buffer=new BufferedReader(entrada);
			marco=new JFrame();
			marco.setBounds(200,150,150,150);
			panelTexto=new JTextArea();
			panelTexto.setEditable(false);
			lamina=new JPanel();
			marco.setVisible(true);
			
			lamina.add(panelTexto);
			marco.add(lamina);
			String mensaje="";
			
			while(mensaje!=null) {
				mensaje=buffer.readLine();
				System.out.println(mensaje);
				panelTexto.append("\n"+mensaje);
			}
			
			
			
			
			entrada.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public JFrame marco;
	public JPanel lamina;
	public JTextArea panelTexto;
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



