package net.lambaraa.pres;

import net.lambaraa.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("net.lambaraa");
        IMetier metier = (IMetier) context.getBean("metier");
        System.out.println("Resultat PresSpringAnnotation "+ metier.calcul());
    }
}
