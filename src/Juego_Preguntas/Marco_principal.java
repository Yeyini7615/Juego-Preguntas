package Juego_Preguntas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

class Marco_principal extends JFrame {
	public Marco_principal(){
		setVisible(true);
		setBounds(550,300,550,400);
		setTitle("Bienvenidos al juego");
		setLayout(new BorderLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		Lamina_botonesP laminaP=new Lamina_botonesP();
		add(laminaP, BorderLayout.SOUTH);
		JPanel pLabel1=new JPanel();
		pLabel1.setLayout(new FlowLayout());
		JTextPane instrucciones=new JTextPane();
		instrucciones.setText("Instrucciones: "+"\n"+"1.Debe responder 5 preguntas correctamente."+"\n"+"2. Solo tiene un unico intento."
		+"\n"+"3.Puede retirarse cuando quiera, su puntaje sera guardado."+"\n"+"4. Si falla una pregunta perdera todo.");
		instrucciones.setEditable(false);
		pLabel1.add(instrucciones);
		add(pLabel1, BorderLayout.CENTER);
		
	}

}
