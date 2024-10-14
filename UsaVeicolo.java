import java.util.ArrayList;
import java.util.Random;
//per generare randomicamente i veicoli guasti 
public class UsaVeicolo {
	
	public static void main(String[] args) {
		
		//String targa, String marca, String modello,, String tipologia
		Vettura v1= new Vettura("bh123t2", "opel","corsa", "utilitaria");
		Vettura v2= new Vettura("sn123ui", "volkswaken","T rock", "suv");
		Vettura v3= new Vettura("lr123dk", "ferrari","enzo", "Sogno");
		
		//creo dei motocicli
		//(String targa, String marca, String modello, , int clindrata)
		
		Motociclo m1= new Motociclo("we234io", "ducati","998",998);
		Motociclo m2= new Motociclo("wl234eo", "honda","hornet",600);
		Motociclo m3= new Motociclo("Vl234er", "piaggio","Vespa",200);
		
		//ora camnbio lo stato di guasto ad alcuni veicoli  cambiaStatoGuasto
				v1.cambiaStatoGuasto();
				m3.cambiaStatoGuasto();
				v1.cambiaStatoGuasto();
		//potreu fare un random che mi guasta numeri a caso
				
		ArrayList<Veicolo> listaVeicoli= new ArrayList<>();
		listaVeicoli.add(v1);
		listaVeicoli.add(v2);
		listaVeicoli.add(v3);
		listaVeicoli.add(m1);
		listaVeicoli.add(m2);
		listaVeicoli.add(m3);
		
		
		
		
		
		//il programma stampa la targa dei veicoli guasti . con boolean true 
		

		for (Veicolo Vei : listaVeicoli) {
			
			if(Vei.isGuasto()) {
				System.out.println("la targa del veiclo guasto è " + Vei.getTarga() +", modello "+Vei.getModello());
			}
			
		}
		

	}

}
