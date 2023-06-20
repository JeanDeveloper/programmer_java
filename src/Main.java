import generics.DummyList;
import models.Shirt;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        DummyList<Shirt> shirtList = new DummyList<>();

        Shirt shirt = new Shirt();
        shirt.setModel("Camisa con Mangas");
        shirt.setTalla(1);

        Shirt shirt2 = new Shirt();
        shirt2.setModel("Camisa sin Mangas");
        shirt2.setTalla(2);

        shirtList.add(shirt);
        shirtList.add(shirt2);
        shirtList.getList();

        Shirt[] shirts = new Shirt[2];
        shirts[0] = shirt;
        shirts[1] = shirt2;
        System.out.println("Obteniendo la lista  2");

        DummyList<Shirt> shirtList2 = new DummyList<>(shirts);

        Shirt shirt3 = new Shirt();
        shirt3.setModel("Camisa sin Cuello");
        shirt3.setTalla(3);
        System.out.println("Añadiendo un elemento a la lista 2");
        shirtList2.add(shirt3);
        shirtList2.getList();

        List<Integer> partList = new ArrayList<>(3);

        partList.add( Integer.valueOf(1111));
        partList.add( Integer.valueOf(2222));
        partList.add( Integer.valueOf(3333));

        Set<String> mySet = new HashSet<>();
        mySet.add("j");
        mySet.add("e");
        mySet.add("a");
        mySet.add("n");


        for(String i: mySet){
            System.out.println(i);
        }

        Set<String> mySetT = new TreeSet<>();

        System.out.println("Usando Tree");

        mySetT.add("j");
        mySetT.add("e");
        mySetT.add("a");
        mySetT.add("n");

        for(String i: mySetT){
            System.out.println(i);
        }

        Map <Integer, String> myMap = new HashMap<>();

        myMap.put(1, "Hola");
        myMap.put(2, "bye");
        myMap.put(3, "chao");
        myMap.put(4, "Bienvenido");
        myMap.put(5, "Que esta pasando?");

        var result = (String) myMap.get(1);
        var result2 = (String) myMap.get(2);

        System.out.println("result = " + result);
        System.out.println("result = " + result2);

        int valor = 1;
        Integer valorInteger = valor;

        valorInteger = null;

    }
}