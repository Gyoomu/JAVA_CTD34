package zoo;

public class Chat extends Animal {
	String race;
	
	public Chat(){
		super();
		this.race = "race";
	}
    public Chat(int poids, String nom, String race){
        super(poids, nom);
        this.race = race;
    }

 String getRace() {
    	return race;
    }
    
    public void setRace(String race) {
    	this.race = race;
    }
    public String toString(){
        return "(" + super.getPoids() + " " + super.getNom() + " " + race + ")";
    }
} coucou
