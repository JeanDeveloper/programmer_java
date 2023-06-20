import comparator.ShirtAnios;
import models.Shirt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Run {

    public static void main(String[] args) {

        Shirt shirt = new Shirt();
        shirt.setModel("Camisa con Mangas");
        shirt.setTalla(2);
        shirt.setAnios(5);

        Shirt shirt2 = new Shirt();
        shirt2.setModel("Camisa sin Mangas");
        shirt2.setTalla(1);
        shirt2.setAnios(3);

        Shirt shirt3 = new Shirt();
        shirt3.setModel("Camisa sin cuello");
        shirt3.setTalla(4);
        shirt3.setAnios(10);

        System.out.println(shirt.compareTo(shirt3));

        List<Shirt> miLista = new ArrayList<>();

        miLista.add(shirt);
        miLista.add(shirt2);
        miLista.add(shirt3);

        for (Shirt s: miLista){
            System.out.println(s);
        }

        System.out.println("----------------");

        Collections.sort(miLista);

        for (Shirt s: miLista){
            System.out.println(s);
        }

        System.out.println("----------------");

        miLista.sort(new ShirtAnios());

        for (Shirt s: miLista){
            System.out.println(s);
        }







    }
}
