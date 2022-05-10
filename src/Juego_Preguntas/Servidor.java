package Juego_Preguntas;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Servidor {

}
class MarcoServidor extends JFrame implements Runnable{
	
	public MarcoServidor() {
		setBounds(1200,300,120,150);
		JPanel lamina=new JPanel();
		lamina.setLayout(new BorderLayout());
		areaTexto=new JTextArea();
		lamina.add(areaTexto,BorderLayout.CENTER);
		add(lamina);
		setVisible(true);
		
		Thread hilo=new Thread(this);
		hilo.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			ServerSocket server=new ServerSocket(9090);
			String nameLlegada;
			int scoreLlegada;
			PaqueteEnvio paqueteRecibido;
			GuardaDatos datos;
			while(true) {
			Socket misocket=server.accept();
			ObjectInputStream paqueteDatos = new ObjectInputStream(misocket.getInputStream());
			paqueteRecibido= (PaqueteEnvio) paqueteDatos.readObject();
			nameLlegada=paqueteRecibido.getName();
			scoreLlegada=paqueteRecibido.getScore();
			//--------------------------------PruebaRecibo-----------------------//
			/*DataInputStream in=new DataInputStream(misocket.getInputStream());
			int mensaje_numero=in.readInt();
			areaTexto.append(("\n"+mensaje_numero));*/
			//------------------------------------------------------------------
			areaTexto.append("\n"+nameLlegada+": "+scoreLlegada);
			String mensaje= "\n"+nameLlegada+": "+scoreLlegada;
			System.out.println("al final"+mensaje);
			datos=new GuardaDatos();
			datos.EscribeArchivo(mensaje);
			misocket.close();
			}
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private JTextArea areaTexto;
}

	
