package tagung;

public class Referent {
	
	//Geschummelt?
	public String name;
	private String email;
	private String firma;
	
	public Referent (String name, String email, String firma){
		this.name = name;
		this.email = email;
		this.firma = firma;
	}
	
	public String getName(String name){
		return name;
	}

}
