package Tp;

public class MatriceAdjacence {
    private int [][] Matrice;
    private Graph G;

    public Graph getG() {
        return G;
    }

    public void setG(Graph g) {
        G = g;
    }

    public MatriceAdjacence() {
    }
    public MatriceAdjacence(Graph g){
        G = g;
        Matrice = new int[g.getNbr_sommet()][g.getNbr_sommet()];
    }
    public int[][] getMatrice() {
        return Matrice;
    }

    public void setMatrice(int[][] matrice) {
        Matrice = matrice;
    }

    public void Ajout_Arrete(int i, int j){
        if(G.getType().equals("NO")){
            Matrice[i - 1][j - 1] = 1;
            Matrice[j - 1][i - 1] = 1;
        }
        else if(G.getType().equals("O")) {
            Matrice[i - 1][j - 1] = 1;
        }
    }
    public void PrintMatrice(){
        for(int i =0; i< Matrice.length; i++){
          for(int j=0; j<Matrice.length; j++){
              System.out.print(Matrice[i][j]+" ");
          }
            System.out.print("\n");
        }

    }
}
