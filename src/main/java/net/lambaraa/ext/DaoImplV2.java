package net.lambaraa.ext;


import net.lambaraa.dao.IDao;

public class DaoImplV2 implements IDao {

    public double getDate() {
        System.out.println("version capteurs ....");
        double t = 12;
        return t;
    }
}
