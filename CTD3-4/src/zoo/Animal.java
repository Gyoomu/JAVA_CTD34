package zoo;

public class Animal {
	private int poids;
    private String nom;

    public Animal(){ // constructeur par défaut
        poids = 4;
        nom = "nom_chien";
    }

    public Animal(int poids, String nom){ // constructeur par défaut
        this.poids = poids;
        this.nom =  nom;
    }

    //accesseurs lecture
    public int getPoids() {
        return poids;
    }
    public String getNom(){
        return nom;
    }
    //accesseurs ecriture
    public void setPoids(int p){
        poids = p;
    }
    public void setNom(String n){
        nom = n;
    }

    public String toString(){
        return "(" + poids + " " + nom + ")";
    }

}
