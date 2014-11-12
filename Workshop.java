package tagung;

import java.util.ArrayList;

public class Workshop {
	
	private int nummer;
	private String bezeichnung;
	private String datum;
	
	
	
	private ArrayList<Teilnehmer> wsteilnehmer;
	private Referent referent;
	
	public Workshop (int nummer, String bezeichnung, String datum){
		this.nummer = nummer;
		this.bezeichnung = bezeichnung;
		this.datum = datum;
		
	}
	
	public void addWsteilnehmer(Teilnehmer teilnehmer){
		wsteilnehmer.add(teilnehmer);
	}
	
	public void setReferent (Referent referent){
		this.referent = referent;
	}
	
	 public String toString(){
			return "Workshop Bezeichnung = " + bezeichnung + ", Referent = " + referent.name  + ", "
					+ "Teilnehmer= " + wsteilnehmer.name + "";
			
		}
}
