package Tp;

import java.util.ArrayList;
import java.util.Hashtable;

public class Graph {
    private int Nbr_sommet;
    private int Nbr_Arret;
    private String Type;
    private int[][] Arrets;
    Hashtable<Integer, ArrayList<Integer>> ListeAdjacence;

    public Hashtable<Integer, ArrayList<Integer>> getListeAdjacence() {
        return ListeAdjacence;
    }

    public void setListeAdjacence(int[][] Arret) {
        Hashtable<Integer, ArrayList<Integer>> Listtmp = new Hashtable<Integer, ArrayList<Integer>>();
        if(this.getType().equals("NO")){
            for (int[] i : Arret) {
                if (Listtmp.containsKey(i[0])) {
                    Listtmp.get(i[0]).add(i[1]);
                } else {
                    ArrayList<Integer> TmpArr = new ArrayList<Integer>();
                    TmpArr.add(i[1]);
                    Listtmp.put(i[0], TmpArr);
                }
                if (Listtmp.containsKey(i[1])) {
                    Listtmp.get(i[1]).add(i[0]);
                } else {
                    ArrayList<Integer> TmpArr = new ArrayList<Integer>();
                    TmpArr.add(i[0]);
                    Listtmp.put(i[1], TmpArr);
                }
            }
        }else{
            for (int[] i : Arret) {
                if (Listtmp.containsKey(i[0])) {
                    Listtmp.get(i[0]).add(i[1]);
                } else {
                    ArrayList<Integer> TmpArr = new ArrayList<Integer>();
                    TmpArr.add(i[1]);
                    Listtmp.put(i[0], TmpArr);
                }
            }
        }
        this.ListeAdjacence = Listtmp;
    }

    public Graph(int S, int A, String T, int[][] Ar){
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
