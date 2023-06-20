package beans;

public class CacheAny <T, B >{
    private T t;
    private B b;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public void addT(T t){
        this.t = t;
    }
    public T getT(){
        return this.t;
    }

    /*
    Conversiones
    Si el generico es de una sola clase se coloca T.
    Si tiene 2 elementos se suele colocar K, V
    K,V,S,T,F.
    */

}
