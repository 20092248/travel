package Faire_Groupe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Equipe {

	public static void main(String[] args) {
		
		List<Personne> etudiant = new ArrayList<Personne>();
		for(String gars : args) {
			Personne ok= new Personne(gars);
			etudiant.add(ok);
			
		}
	
		for (Personne o : etudiant) {
			o.setRang((Math.random()*3)+1);
		}
		Comparator<Personne> Calculus = new Comparator<Personne>() {
		

			@Override
			public int compare(Personne arg0, Personne arg1) {
				return(arg0.getRang() < arg1.getRang() ? -1 : 1);
			}
				
		};
		
		etudiant.sort(Calculus);
		for(Personne gars : etudiant) {
			System.out.println(gars.nom+" "+gars.rang);
		}
	}
}
				
				
				


				
			
			

