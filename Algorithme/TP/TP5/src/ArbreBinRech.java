
public class ArbreBinRech<T> {
		//Nous allons ecrire des m�thodes permettant d'afficher les 4 parcours 
		//d'arbres binaires de recherche
		
	    //Attributs
		int k;
		private T element; 
	    private ArbreBinRech<T> gauche; 
	    private ArbreBinRech<T> droit;
	    
	    //Constructeurs
	    public ArbreBinRech(int k, T element) {
	        this.k = k;
	        this.element = element;
	        this.gauche = null;
	        this.droit = null;
	    }

	    public ArbreBinRech(int k, T element, ArbreBinRech<T> gauche, ArbreBinRech<T> droit) {
			super();
			this.k = k;
			this.element = element;
			this.gauche = gauche;
			this.droit = droit;
		}

		//Gets et sets
		 public T get(int k) {
				if(this.k==k) return this.element;
				else if(k<this.k) return gauche.get(k);
				else return droit.get(k);
		}
		
	    //To String
		public String toString() {
			return "" + this.k;
		}
		
		//Ajout �l�ment
		public void add(int k, T element) {
			if(k<this.k) {
				if(this.gauche!=null) gauche.add(k, element);
				else this.gauche = new ArbreBinRech<T>(k,element);
			}
			else {
				if(this.droit!=null) droit.add(k, element);
				else this.droit = new ArbreBinRech<T>(k,element);
			}
		}
	   
		public static void main(String[] args) {
			
		}
}
