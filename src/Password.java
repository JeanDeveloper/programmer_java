public class Password {

    //CONSTANTES

    private final static int  LONG_DEF = 8;

    private int lenght;
    private String pass;

    public Password(int len) {
        this.lenght = len ;
        this.pass = generatePass();
    }

    public String generatePass(){
        String password = "";

        for( int i = 0; i < lenght; i++ ){
            //GENERAMOS UN NUMERO ALEATORIO, SEGUN ESTE ELIGE SI AÑADIR UNA MINUSCULA, MAYUSCULA O NUMERO
            int eleccion = ( (int) Math.floor(Math.random() * 3 + 1) );

            if( eleccion == 1 ){
                char minuscula = (char)((int)Math.floor(Math.random()*(123-97)+97));
                password += minuscula;
            }else{
                if (eleccion == 2) {
                    char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
                    password+=mayusculas;
                }else{
                    char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                    password+=numeros;
                }
            }

        }
        return password;
    };

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Boolean isFuerte(){

        int number = 0;
        int lowercase = 0;
        int uppercase = 0;


        //Vamos caracter a caracter y comprobamos que tipo de caracter es

        for (int i=0;i<pass.length();i++){
            if (pass.charAt(i)>=97 && pass.charAt(i)<=122){
                lowercase+=1;
            }else{
                if (pass.charAt(i)>=65 && pass.charAt(i)<=90){
                    uppercase+=1;
                }else{
                    number+=1;
                }
            }
        }
        //Si la constraseña tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
        if (number>=5 && lowercase>=1 && uppercase>=2){
            return true;
        }else{
            return false;
        }

    }


}
