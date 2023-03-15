package singletonRegistry.main;

import singletonRegistry.InstitutiePublica;

public class main {
    public static void main(String args[]){
        InstitutiePublica politie=  InstitutiePublica.getInstitutieOptimizata("Politie");
        InstitutiePublica pompieri = InstitutiePublica.getInstitutie("Pompieri");
        InstitutiePublica politieLocala=  InstitutiePublica.getInstitutieOptimizata("Politie");

        politie.setNumarAngajati(10);
        politieLocala.setNumarAngajati(20);
        pompieri.setNumarAngajati(5);

        System.out.println(politie);
        System.out.println(politieLocala);
        System.out.println(pompieri);
    }
}
