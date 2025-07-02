package net.lambaraa.pres;

import net.lambaraa.dao.DaoImpl;
import net.lambaraa.metier.MetierImpl;

public class Pres1{
    public static void main(String[] arg) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("Pres 1 Resultat " + metier.calcul());
    }
}
