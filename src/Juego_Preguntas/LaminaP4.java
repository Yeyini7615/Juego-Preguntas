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

public class LaminaP4 extends JPanel {
	public LaminaP4(){
		String pregunta1="Los componentes de un ecosistema son:";
		String pregunta2="¿Cuántas fases tiene la fotosíntesis?";
		String pregunta3="Las células reproductoras se dividen por...";
		String pregunta4="¿Qué tipos de semillas hay?";
		String pregunta5="¿Qué función tiene una glándula de secreción interna?";
		
		LinkedHashMap <String, String[]> mapa=new LinkedHashMap <String,String[]>();
		mapa.put(pregunta1, new String[] {"Animales, vegetales, microorganismos como hongos y bacterias","Productores, consumidores, componentes orgánicos, desintegradores","Productores, consumidores, desintegradores","Productores, consumidores, desintegradores, componentes inorgánicos"});
		mapa.put(pregunta2, new String[] {"No tiene fases.","Luminosa y oscura.","Primaria y secundaria.","Activa y pasiva"});
		mapa.put(pregunta3, new String[] {"Mitosis.","Meiosis.","Metamorfosis","Metodo Constructor"});
		mapa.put(pregunta4, new String[] {"Dicotiledóneas.","Monocotiledóneas.","Monocotiledóneas y dicotiledóneas.","Con fruto o sin fruto"});
		mapa.put(pregunta5, new String[] {"Verter sustancias a la sangre.","Segregar cosas dentro del organismo.","Para venderla","Para llenarla de pepas"});
		
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

