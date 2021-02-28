package zoo;

public class Chien extends Animal {
	String maitre;
	
	public Chien(){
		super();
		maitre = "Yoda";
	}
    public Chien(int poids, String nom, String maitre){
        super(poids, nom);
        this.maitre = maitre;
    }

    public String getMaitre() {
        return maitre;
    }
    public void setMaitre(String maitre){
        this.maitre = maitre;
    }
    public String toString(){
        return "(" + super.getPoids() + " " + super.getNom() + " " + maitre + ")";
    }
}
