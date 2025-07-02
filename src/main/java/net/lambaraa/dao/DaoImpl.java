package net.lambaraa.dao;

public class DaoImpl implements IDao {

    @Override
    public double getDate() {
        System.out.println("version base de données");
        double t = 34;
        return t;
    }
}
