package net.lambaraa.ext;


import net.lambaraa.dao.IDao;
import org.springframework.stereotype.Component;

@Component("d2")
public class DaoImplV2 implements IDao {
    @Override
    public double getDate() {
        System.out.println("version capteurs ....");
        double t = 12;
        return t;
    }
}
