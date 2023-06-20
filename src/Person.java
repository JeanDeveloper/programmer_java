public class Person {

    //VARIABLES INTERNAS
    private static char GENDER_MALE = 'H';
    public static final int INFRAWEIGHT = -1;
    public static final int IDEALWEIGHT = 0;
    public static final int SOBREWEIGHT = 1;

    private String name ;
    private int age ;
    private String document ;
    private char gender;

    //METODOS PRIVADOS
    private double weight ;

    //METODOS GET Y SET DE LOS ATRIBUTOS.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double height ;

    //CONSTRUCTOR POR DEFECTO
    public Person(){
        this("", 0, GENDER_MALE, 0, 0 );
    }
    //CONSTRUCTOR CON 3 PARAMETROS.
    public Person( String name, int age, char gender ){
        this(name, age, gender, 0,0 );
    };
    // CONSTRUCTOR CON TODOS LOS PARAMETROS DE DEFAULT.
    public Person( String name, int age, char gender, double weight, double height ) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        generarDNI();
        this.gender = gender;
        checkSex();
    }
    private void checkSex(){
        //si el sexo no es un H o una M se toma por defecto el H
        if( gender != 'H' &&  gender != 'M' ){
            this.gender = GENDER_MALE;
        }
    }
    public int calculeIMC(){
        double imc = this.weight / (Math.pow(this.height, 2));
        if( imc >= 20 && imc <=25 ){
            return IDEALWEIGHT;
        }else if( imc < 20 ) {
            return INFRAWEIGHT;
        }else{
            return SOBREWEIGHT;
        }
    }
    public Boolean isAgeOlder(){
        if( this.age >= 18 ){
            return true;
        }else{
            return false;
        }
    }
    private void generarDNI(){
        final int divisor = 23 ;

        //Generamos un numero de 8 digitos.
        int numDNI =  ((int) Math.floor(Math.random() * ( 100000000 - 10000000 ) + 10000000 ) );
        int res  = numDNI - (numDNI /divisor * divisor);

        //Calculamos la letra del DNI
        char letraDNI = generaLetraDNI(res);

        //Pasamos el DNI a String
        document = Integer.toString(numDNI) + letraDNI;

    }
    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[res];
    }
    @Override
    public String toString() {
        String sexo;
        if( this.gender == 'H' ){
            sexo = "Hombre";
        }else{
            sexo = "Mujer";
        }
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", document='" + document + '\'' +
                ", gender=" + gender +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

}