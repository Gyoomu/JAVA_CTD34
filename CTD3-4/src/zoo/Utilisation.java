package zoo;

public class Utilisation {
    public static void main (String args[]){
    Animal anim = new Animal(3, "chien");
    Chien chien1 = new Chien(4, "chien1", "maitre1");
    Chien chien2 = new Chien(5, "Chien2", "maitre2");
    Chien chien3 = new Chien(6, "chien3", "maitre3");
    Chat chat = new Chat(7, "Chat", "race-chat");
    //System.out.println(chien1);
    
    
    
    Animal montab [] =  {anim, chien1, chien2, chien3, chat};
    
    for(int i=0; i<montab.length; i++) {
    	System.out.println(montab[i]);
    }
   }
}
