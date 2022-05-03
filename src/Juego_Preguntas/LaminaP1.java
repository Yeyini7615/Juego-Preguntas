package Juego_Preguntas;

import java.awt.Button;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class LaminaP1 extends JPanel{
	public LaminaP1() {
		
		
		String pregunta1="Cuantos litros de sangre tiene una persona adulta?";
		String pregunta2="Cual es el pais mas grande y mas pequenio del mundo?";
		String pregunta3="Cual es el libro mas vendido despues de la biblia?";
		String pregunta4="La sal comun esta formada por estos dos elementos.";
		String pregunta5="Cuantos decimales tiene el numero Pi";
		
		LinkedHashMap <String, String[]> mapa=new LinkedHashMap <String,String[]>();
		mapa.put(pregunta1, new String[] {"Entre 2 y 4 Litros","entre 4 y 6 Litros","Tiene 10 litros","Depende de los tiros en la cabeza"});
		mapa.put(pregunta2, new String[] {"Rusia y Vaticano","China y Cuba","Brasil y Senegal","El uberrimo y tu casa"});
		mapa.put(pregunta3, new String[] {"El senior de los anillos","Don Quijote","El Principito","Juegue LOL sin tiltearse"});
		mapa.put(pregunta4, new String[] {"Oro y Plomo","Sal y El tarrito","Sodio y Cloro","Cristal y Sodio"});
		mapa.put(pregunta5, new String[] {"Infinitos","1.000","35004185254984","IOExeption Match Error"});
		
		int AA=0;
		while(AA==0) {
		AA=(int) (Math.random()*6);
	
		}
		
		Object[] m=mapa.keySet().toArray();
		String Titulo=(String) m[AA-1];
		
		
		
		String pregunta="";
		if(AA==1) {
			pregunta=pregunta1;
		}else if(AA==2) {
			pregunta=pregunta2;
		}else if(AA==3) {
			pregunta=pregunta3;
		}else if(AA==4) {
			pregunta=pregunta4;
		}else if(AA==5) {
			pregunta=pregunta5;
		}
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), Titulo));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		grupo=new ButtonGroup();
		
		String[] n= (mapa.get(pregunta));
		String[] nueva=n;
		 for(int i=0; i<n.length; i++) {
			JRadioButton bot=new JRadioButton(n[i]);
			bot.setActionCommand(n[i]);// Le da acciones para tomarlas con el metodo dameseleccion y usar el string para comparara
			add(bot);
			grupo.add(bot);
			bot.setSelected(i==0);
		}
		 
		 
	}				
	private ButtonGroup grupo;
			 	
	public String dameseleccion() {
		ButtonModel miboton=grupo.getSelection();
		String s= miboton.getActionCommand();// Saco el comando dado como String para comparar.
		return s;
	}
	

}