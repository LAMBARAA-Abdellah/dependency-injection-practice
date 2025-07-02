package net.lambaraa.metier;

import net.lambaraa.dao.DaoImpl;
import net.lambaraa.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Override
    public double calcul() {
        double t = dao.getDate();
        double result = t*2*Math.PI;
        return result;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
