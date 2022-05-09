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
	public JLabel contador2;
	public JLabel contador3;
	public ArrayList puntosLista;

int puntos=0; 

class Servidor {
	public Servidor() {
		
		
	}
}

class EnviaTexto implements Runnable, ActionListener{
	
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			InetAddress address;		
			try {
				
				address = InetAddress.getLocalHost();
				String ip =address.getHostAddress();
				Socket misocket=new Socket(ip,9090);
				
				PaqueteEnvio datos=new PaqueteEnvio();
				datos.setName("Yeyini");
				datos.setScore(puntos);
				ObjectOutputStream outDatos=new ObjectOutputStream(misocket.getOutputStream());
				outDatos.writeObject(datos);
				//---------------------------------Prueba Socket----------------------------//
				/*DataOutputStream out=new DataOutputStream(misocket.getOutputStream());
				out.writeInt(puntos);
				out.close();*/
				
			}catch(IOException e1) {
				System.out.println(e1.getMessage());
			}
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
}
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
	private int score;

}

