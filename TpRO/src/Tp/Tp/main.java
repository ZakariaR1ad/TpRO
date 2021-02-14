package Tp;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args){



        ArrayList <Graph> ListeGraphes = new ArrayList<Graph>();
        int choix;
        int choix_b;
        Scanner s = new Scanner(System.in);
        do {

            System.out.print("Choisissez une option: \n");
            System.out.print("1.............Saisir un graphe \n");
            System.out.print("2.............Afficher la liste des graphes\n");
            System.out.print("3.............Afficher la matrice d'adjacence d'un graphe\n");
            System.out.print("4.............Afficher la matrice d'incidence d'un graphe\n");
            System.out.print("5.............Afficher la liste d'adjacence d'un graphe\n");
            System.out.print("0.............Quitter\n");
            choix = s.nextInt();

            switch (choix){
                case 1:
                    System.out.print("Entrer le nombre de sommets de ce graphe: \n");
                    int Sommets = s.nextInt();
                    System.out.print("Entrer le nombre d'arretes de ce graphe: \n");
                    int Arrets = s.nextInt();
                    System.out.print("Entrer le type de ce graphe: (O/NO): \n");
                    String Type = s.next();
                    System.out.print("Entrer les arretes de ce graphe de la forme(X,Y):  \n");
                    int Ars[][] = new int[Arrets][2];
                    for(int i=0; i< Arrets; i++){
                        System.out.print("Entrer la "+(i+1)+"ème arrete : ");
                        Ars[i][0] =s.nextInt() ;
                        Ars[i][1] =s.nextInt() ;
                    };
                    Graph g = new Graph(Sommets, Arrets, Type, Ars);
                    g.setListeAdjacence(Ars);
                    ListeGraphes.add(g);
                    break;
                case 2:
                    for(int i = 0; i <ListeGraphes.size(); i++){
                        System.out.print("Graphe Numero "+ (i+1)+
                                ", Arretes: "+ ListeGraphes.get(i).getNbr_Arret()+
                                ", Sommets: "+ListeGraphes.get(i).getNbr_sommet()+"\n");
                    }
                    break;
                case 3:
                    System.out.print("Choisissez un graphe:  \n");
                    int NumeroGraph = s.nextInt();
                    if(NumeroGraph < ListeGraphes.size()){
                        Graph ChoosenGraph = ListeGraphes.get(NumeroGraph);
                        MatriceAdjacence M = new MatriceAdjacence(ChoosenGraph);
                        M.setG(ChoosenGraph);
                        for (int i = 0; i < ChoosenGraph.getNbr_Arret(); i++) {
                            M.Ajout_Arrete(ChoosenGraph.getArrets()[i][0], ChoosenGraph.getArrets()[i][1]);
                        }
                        M.PrintMatrice();
                    }
                    break;
                case 4:
                    System.out.print("Choisissez un graphe:  \n");
                    NumeroGraph = s.nextInt();
                    if(NumeroGraph < ListeGraphes.size()){
                        Graph ChoosenGraph = ListeGraphes.get(NumeroGraph);
                        MatriceIncidence M = new MatriceIncidence(ChoosenGraph);
                        M.setG(ChoosenGraph);
                        for (int i = 0; i < ChoosenGraph.getNbr_Arret(); i++) {
                            M.Ajout_Arrete(i, ChoosenGraph.getArrets()[i][0], ChoosenGraph.getArrets()[i][1]);
                        }
                        M.PrintMatrice();
                    }
                    break;
                case 5:
                    System.out.print("Choisissez un graphe:  \n");
                    NumeroGraph = s.nextInt();
                    if(NumeroGraph < ListeGraphes.size()){
                        Graph ChoosenGraph = ListeGraphes.get(NumeroGraph);
                        MatriceIncidence M = new MatriceIncidence(ChoosenGraph);
                        try{
                            System.out.print(ChoosenGraph.getListeAdjacence());
                        }catch(Exception e){

                        }

                        }


                    break;
                case 0:
                    System.out.print("Fin du traitement");
                    break;
            }

        }while(choix != 0);




















    }
}
