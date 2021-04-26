package main;

import entites.*;

public class program {
    public static void main(String[] args) {
    // AÇAI DE 350ML COM NUTELLA
        System.out.println("SEM DECORATOR");
        Acai ac1 = new Açai350ml();
        System.out.println("Preço R$ :"+ac1.preco() +" "+ac1.getDescricao());
        System.out.println("-----------------------------");


        ac1 = new Nutella(ac1);
        System.out.println(ac1.getDescricao());
        System.out.println("COM DECORATOR");
        System.out.println("Preço R$ :"+ac1.preco() +" "+ac1.getDescricao());
        System.out.println("-----------------------------------------");
        System.out.println("SEM DECORATOR");
         Acai ac2 = new Açai500ml();
        System.out.println("Preço R$ :"+ac2.preco() +" "+ac2.getDescricao());
        System.out.println("-----------------------------------------");

    // AÇAI DE 500 COM OVOMALTINE
        System.out.println("COM DECORATOR");
        ac2 = new Ovomaltine(ac2);
        System.out.println(ac2.getDescricao());
        System.out.println("Preço R$ :"+ac2.preco() +" "+ac2.getDescricao());
        System.out.println("-----------------------------------------");


    }
}
