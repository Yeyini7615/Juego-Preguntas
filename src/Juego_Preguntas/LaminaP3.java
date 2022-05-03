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

public class LaminaP3 extends JPanel{
	public LaminaP3(){
		String pregunta1="Hacen parte de la Estructura geopolitica del Estado";
		String pregunta2="La muerte del estado se presenta por:";
		String pregunta3="Cual es el punto mas dificil de alcanzar de todo el planeta";
		String pregunta4="Que es Zelandia";
		String pregunta5="El punto mas profundo de la fosa de las Marianas esta a: ";
		
		LinkedHashMap <String, String[]> mapa=new LinkedHashMap <String,String[]>();
		mapa.put(pregunta1, new String[] {"Fronteras,hinterland,riqueza,hearland","Fronteras,hinterland,heartland,comunicaciones","La gente y Ls RR.NN","Plate es plata"});
		mapa.put(pregunta2, new String[] {"Fusion de Nucleos Vitales","Desarrollando las leyes de crecimiento espacial","Por accion violenta","Uribe"});
		mapa.put(pregunta3, new String[] {"El punto G","El punto Nemo","El punto(2,3)","El punto RACH"});
		mapa.put(pregunta4, new String[] {"Una ciudad islandesa","Un parque tematico","Un continente","Una cerveza"});
		mapa.put(pregunta5, new String[] {"11.144 metros de profundidad","11.054 metros de profundidad","11.044 metros de profundidad","11.034 metros de profundidad"});
		
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

