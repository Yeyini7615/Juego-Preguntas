package Juego_Preguntas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import java.awt.Canvas;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

public class Marco_Win extends Contador {

	private JPanel contentPane;

	public Marco_Win() {
		setTitle("Felicitaciones ganaste");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 351);
		premio();
		setVisible(true);
	}
	public void premio() {	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPremio1 = new JButton("Premio 1");
		btnPremio1.setBounds(90, 220, 104, 25);
		btnPremio1.setActionCommand("5");
		btnPremio1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null,"Gracias por Jugar");	
			String nombre=JOptionPane.showInputDialog(null, "Felicitaciones, ingresa tu nombre para registrar tu puntaje");
			String comando=e.getActionCommand();
			EnviaTexto n=new EnviaTexto();
			n.salida(nombre,comando);
			System.exit(0);
			}
			
		});
		contentPane.add(btnPremio1);
		
		JLabel lblNewLabel = new JLabel("Escoge tu premio");
		lblNewLabel.setBounds(187, 11, 127, 19);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setToolTipText("");
		contentPane.add(lblNewLabel);
		
		JButton btnPremio2 = new JButton("Premio 2");
		btnPremio2.setBounds(348, 222, 96, 23);
		btnPremio2.setActionCommand("5");
		btnPremio2.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, "Gracias por jugar");
			String nombre=JOptionPane.showInputDialog(null, "Felicitaciones, ingresa tu nombre para registrar tu puntaje");
			String comando=e.getActionCommand();
			EnviaTexto n=new EnviaTexto();
			n.salida(nombre,comando);
			System.exit(0);
			}
			
		});
		contentPane.add(btnPremio2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("src\\Juego_Preguntas\\oculus-quest-2.png"));
		lblNewLabel_1.setBounds(20, 45, 238, 201);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("src\\Juego_Preguntas\\rtx.jpg"));
		lblNewLabel_2.setBounds(279, 43, 207, 168);
		contentPane.add(lblNewLabel_2);
	}
	
}
