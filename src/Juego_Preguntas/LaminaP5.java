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

public class LaminaP5 extends JPanel {
	public LaminaP5(){
		String pregunta1="Que isotopos no son radioactivos?";
		String pregunta2="Cual es el mayor componente de la masa de las estrellas";
		String pregunta3="Fenomeno natural que origina la formacion de estrellas";
		String pregunta4="Que es el LHC";
		String pregunta5="De que color es el Sol?";
		
		LinkedHashMap <String, String[]> mapa=new LinkedHashMap <String,String[]>();
		mapa.put(pregunta1, new String[] {"Uranio","La Toxica","Todos son radioactivos","El polonio"});
		mapa.put(pregunta2, new String[] {"Hidrogeno","Helio","Xenon","Fosforo"});
		mapa.put(pregunta3, new String[] {"Energica Espectrofotonal","Fusion Nuclear","La gravedad","El pepe"});
		mapa.put(pregunta4, new String[] {"Long Hexaminal Counter","El Gran Colicionador de Hadrones","La Hija Culera","Last Hombol Close"});
		mapa.put(pregunta5, new String[] {"Enana Amarilla de Tipo EII ","(258,45,92)","Enana Amarilla de Tipo GII","Enana Amarilla de Tipo RIII"});
		
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
			bot.setSelected(i==2);
		}
		 
	}
	public  ButtonGroup grupo;
	public String dameseleccion() {
		ButtonModel miboton=grupo.getSelection();
		String s= miboton.getActionCommand();
		return s;
}
}