package net.lambaraa.dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImpl implements IDao {

    @Override
    public double getDate() {
        System.out.println("version base de données");
        double t = 34;
        return t;
    }
}
