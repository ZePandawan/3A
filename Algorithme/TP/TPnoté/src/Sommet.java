import java.util.Vector;

public class Sommet{
	//Attributs
	int position;
	Vector<Sommet> voisin = new Vector<Sommet>();
	
	//Constructeurs
	public Sommet(int position) {
		this.position=position;
	}
	
	//toString
	public String toString() {
		String toReturn = position+":(";
		for(int i=0;i<voisin.size()-1;i++) {
			toReturn+=voisin.get(i).position + ",";
		}
		return toReturn + voisin.get(voisin.size()-1).position +")";
	}
	
	//M�thode ajout sommet dans une liste (qui du coup contient tous les voisons d'un nb)
	public void addVoisin(Sommet s) {
		voisin.add(s); //fonction toute faite pour ajout� un element dans un vecteur
	}
	
	//m�thode return true si s est un voisin
	public boolean isVoisin(Sommet s) {
		return voisin.contains(s); //Dans voisins, est-ce que s est l� ?
	}
	
	public static void main(String[] args) {
		Sommet s1= new Sommet(0);
		Sommet s2= new Sommet(1);
		s1.addVoisin(s2);
		
		System.out.println(s1.isVoisin(s2));
		System.out.println(s2.isVoisin(s1));
		
	}
	
	
}
