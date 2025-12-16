package fr.diginamic.tp_composite;

import fr.diginamic.composite.Employe;
import fr.diginamic.composite.IElement;
import fr.diginamic.composite.Service;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CompositeTest
{
    @Test
    public void testCompositeIElement()
    {
        Employe chefDeService1 = new Employe("JB", "RANMEY", 7500);
        Employe concepteur = new Employe("Jane", "DOE", 3500);
        List<IElement> employes1 = List.of(chefDeService1, concepteur);
        Service serviceBigData = new Service("Big data");
        serviceBigData.setElements(employes1);

        Employe chefDeService2 = new Employe("Kevin", "GUINEAU", 7500);
        Employe leadDev = new Employe("Paul", "MARTIN", 4500);
        List<IElement> employes2 = List.of(chefDeService2, leadDev);
        Service javaDev = new Service("Big data");
        javaDev.setElements(employes2);

        Employe directeur = new Employe("Cécile", "RASPEY", 10000);
        Employe architecte = new Employe("Bilel", "BECHKAR", 8000);
        List<IElement> employes3 = List.of(directeur, architecte, serviceBigData, javaDev);
        Service serviceDSIN = new Service("DSIN");
        serviceDSIN.setElements(employes3);

        double salaireBigData = serviceBigData.calculerSalaire();
        double salaireJavaDev = javaDev.calculerSalaire();
        double salaireDSIN = serviceDSIN.calculerSalaire();

        System.out.println();

        assertEquals(salaireBigData, 11000d, 0);
        assertEquals(salaireJavaDev, 12000d, 0);
        assertEquals(salaireDSIN, 41000d, 0);
    }
}
