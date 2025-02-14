
public class GraphAdj implements Graph{
	//Attributs
	Matrice adj;
	
	//Constructeur
	public GraphAdj(int k) {
		this.adj = new Matrice(k);
	}
	
	//toString
	@Override
	public String toString() {
		return "GraphAdj " + adj ;
	}
	
	//Gets et Sets
	public Matrice getAdj() {
		return adj;
	}
	public void setAdj(Matrice adj) {
		this.adj = adj;
	}
	
	//M�thode ajout voisin
	public static void addA(Matrice m, int i, int j) {
		m.mat[i][j]=1;
	}
	

	//m�thode voisins
	@Override
	public boolean isVoisin(int i, int j) {
		if(this.adj.mat[i][j]!=0) return true;
		else return false;
	}
	
	//M�thode distance minimale entre deux sommets
	public int distanceSommets(int i, int j) {
		int cpt=1;
		while(this.adj.puissance(cpt).mat[i][j]==0 && cpt<this.adj.mat.length) {
			cpt+=1;
		}
		return cpt;
	}
	
	//Main
	public static void main(String[] args) {
		Graph myGraph = new GraphAdj(5);
		System.out.println("myGraph vide :\n" +myGraph);
		addA(myGraph.getAdj(), 1, 4);
		addA(myGraph.getAdj(),0,2);
		System.out.println("Avec deux arretes" + myGraph);
		System.out.println(myGraph.distanceSommets(0,2));
	}

}
