package hello;

public class Push {

	private String stam;
	
	public Push(String i_string) {
		if(i_string.equals("eden"))
			stam = "ori";
		else
			stam = "kobi";
			
	}
	
	public String getStam() {
		return stam;
	}
	
	
}
