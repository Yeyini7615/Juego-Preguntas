package Juego_Preguntas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class LaminaP2 extends JPanel {

	public LaminaP2(){
		String pregunta1="En que unidad se mide la velocidad angular?";
		String pregunta2="Una masa de un kilogramo, a que peso equivale en Newton";
		String pregunta3="En cual de estos sistemas no existe rozamiento";
		String pregunta4="Que tipo de fuerza existe cuando un cuerpo rueda sobre otro";
		String pregunta5="La energia mecanica es la suma de dos energias";
		
		LinkedHashMap <String, String[]> mapa=new LinkedHashMap <String,String[]>();
		mapa.put(pregunta1, new String[] {"m/s","Newton","(Velociad Luz)/Velocidad Oscuridad","Rad/s"});
		mapa.put(pregunta2, new String[] {"6.3N","7.2N","5.8N","9.8N"});
		mapa.put(pregunta3, new String[] {"El cielo","Una pista de hielo","El espacio","Ninguno de los anteriores"});
		mapa.put(pregunta4, new String[] {"Deslizamiento","Viscoso","Rodadura","Atraccion"});
		mapa.put(pregunta5, new String[] {"Energia cinetica y energia potencial gravitatoria","Energia cinetica y energia de rozamiento","Energia cinetica y energia hidraulica","Energia cinetica y energia electrica"});
		
		int AA=0;
		while(AA==0) {
		AA=(int) (Math.random()*6);
	
		}
		
		Object[] m=mapa.keySet().toArray();
		String Titulo=(String) m[AA-1];
		
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), Titulo));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		grupo=new ButtonGroup();
		
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
		
		String[] n= (mapa.get(pregunta));
		String[] nueva=n;
		 for(int i=0; i<n.length; i++) {
			JRadioButton bot=new JRadioButton(n[i]);
			bot.setActionCommand(n[i]);
			add(bot);
			grupo.add(bot);
			bot.setSelected(i==0);
		}
		 
	}
	public  ButtonGroup grupo;
	
	public String dameseleccion() {
		ButtonModel miboton=grupo.getSelection();
		String s= miboton.getActionCommand();
		return s;
}
}

