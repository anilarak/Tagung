package tagung;


public class Main {
	public static void main(String[] args) {
		
		Teilnehmer karo = new Teilnehmer("Karo", "karo@mail.de" , "Student");
		Teilnehmer hurakami = new Teilnehmer("Hurakami", "hurakami@mail.co.jp","Nichtmitglied");
		Workshop hacken = new Workshop (113, "Hacken wie ein Pro", "08.03.2013");
		Workshop minimalism = new Workshop (223, "Minimalismus", "07.03.2013");
		Referent plass = new Referent ("Andreas Plaß", "plass@haw-hamburg.de", "HAW Hamburg");
		Referent steve = new Referent ("Steve Jobs", "steve@geist.de", "Apple");
		Rahmenprogramm gamejam = new Rahmenprogramm ("Gamejam", "07.03.2013", "13:00","Inno Games");

		
		hacken.setReferent(plass);
		minimalism.setReferent(steve);
		hacken.addWsteilnehmer(karo);
		
		System.out.println(hacken);
		System.out.print(minimalism);
		
	}
	
}
