import javax.swing.*;

public class PersonaApp {
    public static void main(String[] args) {

        //INTRODUCIMOS LOS DATOS
        String name = JOptionPane.showInputDialog("Introduce el nombre.");

        String text = JOptionPane.showInputDialog("Introduce la edad.");
        int edad = Integer.parseInt(text);

        text = JOptionPane.showInputDialog("Introduce el Sexo.");
        char sex  = text.charAt(0);

        text = JOptionPane.showInputDialog("Introduce el Peso");
        double peso = Double.parseDouble(text);

        text = JOptionPane.showInputDialog("Introduce la Altura");
        double altura = Double.parseDouble(text);

        //Creamos objetos con cada constructor.
        Person person1 = new Person();
        Person person2 = new Person(name, edad, sex);
        Person person3 =  new Person( name, edad, sex, peso, altura);

        //Los datos que no esten completos los insertamos con los metodos SET
        person1.setName("Laura");
        person1.setAge(30);
        person1.setGender('M');
        person1.setHeight(60);
        person1.setWeight(1.6);

        person2.setWeight(90.5);
        person2.setHeight(1.80);

        //USAMOS METODOS PARA REALIZAR LA MISMA ACCION PARA CADA OBJETO
        System.out.println("Persona 1");
        ShowWeightMessage(person1);
        showAgeOlder(person1);
        System.out.println(person1.toString());

        System.out.println("Persona 2");
        ShowWeightMessage(person2);
        showAgeOlder(person2);
        System.out.println(person2.toString());

        System.out.println("Persona 3");
        ShowWeightMessage(person3);
        showAgeOlder(person3);
        System.out.println(person3.toString());

    }

    public static void ShowWeightMessage( Person person ) {
        int IMC = person.calculeIMC();
        switch (IMC){
            case Person.IDEALWEIGHT -> System.out.println(" La persona esta en su peso ideal");
            case Person.INFRAWEIGHT -> System.out.println(" La persona esta por debajo de su peso ideal");
            case Person.SOBREWEIGHT -> System.out.println(" La persona esta por encima de su peso ideal");
        }
    }

    public static void showAgeOlder( Person person ){
        if( person.isAgeOlder() ){
            System.out.println("La persona es mayor de edad");
        }
        else{
            System.out.println("La persona no es mayor de edad");
        }
    }

}
