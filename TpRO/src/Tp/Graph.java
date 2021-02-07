package Tp;

import java.util.ArrayList;

public class Graph {
    private int Nbr_sommet;
    private int Nbr_Arret;
    private String Type;
    private int[][] Arrets;


    public Graph(int S,int A,String T,int[][] Ar){
        Nbr_Arret = A;
        Nbr_sommet = S;
        Type = T;
        Arrets =  Ar;

    };

    public int[][] getArrets() {
        return Arrets;
    }

    public void setArrets(int[][] arrets) {
        Arrets = arrets;
    }

    public int getNbr_sommet() {
        return Nbr_sommet;
    }

    public void setNbr_sommet(int nbr_sommet) {
        Nbr_sommet = nbr_sommet;
    }

    public int getNbr_Arret() {
        return Nbr_Arret;
    }

    public void setNbr_Arret(int nbr_Arret) {
        Nbr_Arret = nbr_Arret;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
    public void PrintArretes(){
        for(int i=0; i< Arrets.length; i++){
            System.out.print('('+Integer.toString(Arrets[i][0])+','+Integer.toString(Arrets[i][1])+')');
        }
    }


}
