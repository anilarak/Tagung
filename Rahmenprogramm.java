package tagung;

import java.util.*;

public class Rahmenprogramm {
	
	private String bezeichnung;
	private String datum;
	private String zeit;
	private String ort;
	
	public Rahmenprogramm(String bezeichnung, String datum, String zeit, String ort) {
		this.bezeichnung = bezeichnung;
		this.datum = datum;
		this.zeit = zeit;
		this.ort = ort;
		
	}
	
	private ArrayList <Teilnehmer> rpteilnehmer;
	
	public void addTeilnehmer(Teilnehmer teilnehmer){
		rpteilnehmer.add(teilnehmer);
	}

}
