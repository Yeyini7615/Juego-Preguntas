package Juego_Preguntas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class Contador extends JFrame {
	

	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
		
	}
	public JLabel cuenta(int puntos, JLabel a) {
		
		a.setText("Puntos: "+ puntos);
		puntos=this.puntos;
		
		return a;
		
	}
public JLabel contador;
	

int puntos=0; 

class Servidor {
	public Servidor() {
		
		
	}
}
//----------------- Clase para los eventos de los botones de salida----------------//
class EnviaTexto implements ActionListener{
	private int Score;
	
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String nombre=JOptionPane.showInputDialog(null, "Se ha retirado, ingrese su nombre");
			String comando=e.getActionCommand();
			salida(nombre, comando);
		}	
		public void salida(String nombre, String comando) {
			
			int i=Integer.parseInt(comando);
			switch (i) {
			case 1: datos.setScore(0);
				break;
			case 2: datos.setScore(10);
				break;
			case 3: datos.setScore(20);
				break;
			case 4: datos.setScore(30);
				break;
			case 5: datos.setScore(50);	
				
			}
			InetAddress address;
			
			try {
				
				address = InetAddress.getLocalHost();
				String ip =address.getHostAddress();
				Socket misocket=new Socket(ip,9090);
				
				
				datos.setName(nombre);
				
				ObjectOutputStream outDatos=new ObjectOutputStream(misocket.getOutputStream());
				outDatos.writeObject(datos);
				//---------------------------------Prueba Socket----------------------------//
				//DataOutputStream out=new DataOutputStream(misocket.getOutputStream());
				//out.writeInt(puntos);
				outDatos.close();
				System.exit(0);
			}catch(IOException e1) {
				System.out.println(e1.getMessage());
			}
		}
		
	}
PaqueteEnvio datos=new PaqueteEnvio();
}
//------------------- Clase con los metodos gettters y setters de los datos a enviar-------------//
class PaqueteEnvio implements Serializable{
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int score=0;

}

