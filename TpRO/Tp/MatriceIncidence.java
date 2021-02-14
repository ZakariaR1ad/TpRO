package Tp;

public class MatriceIncidence {

    private int [][] Matrice;
    private Graph G;

    public MatriceIncidence() {
    }
    public MatriceIncidence(Graph g) {
        Matrice = new int[g.getNbr_sommet()][g.getNbr_Arret()];
        G = g;
    }

    public int[][] getMatrice() {
        return Matrice;
    }

    public void setMatrice(int[][] matrice) {
        Matrice = matrice;
    }

    public Graph getG() {
        return G;
    }

    public void setG(Graph g) {
        G = g;
    }
    public void Ajout_Arrete(int i, int j, int k){
        if(G.getType().equals("NO")){
            Matrice[j - 1][i] = 1;
            Matrice[k - 1][i] = 1;
        }
        else if(G.getType().equals("O")) {
            Matrice[j - 1][i] = 1;
            Matrice[k - 1][i] = -1;
        }
    }
    public void PrintMatrice(){
        for(int i =0; i< Matrice.length; i++){
            for(int j=0; j<Matrice[0].length; j++){
                System.out.print(Matrice[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}
