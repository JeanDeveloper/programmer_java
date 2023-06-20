package generics;

public class DummyList <T>{
    private T[] ts;

    private int SIZE = 10;

    private int INDEXLAST = 0;

    public DummyList(){
        this.ts =  (T[]) new Object[SIZE];
    }

    public DummyList( T[] ts ){
        this.ts = ts;
        INDEXLAST = ts.length;
        SIZE = ts.length;
    }

    public void add(T t){
        if(INDEXLAST < SIZE){
            ts[INDEXLAST] = t;
        }else{
            this.ts = createNewList(this.ts);
            this.SIZE = this.ts.length;
            this.ts[INDEXLAST] = t;
        }
        INDEXLAST++;
    }

    public void getList(){
        for(T t: this.ts){
            System.out.println(t);
        }
    }

    private T[] createNewList(T[] current){
        System.out.println("Creando Nueva Lista");
        T[] result = (T[]) new Object[current.length + 10];

        for (int i = 0; i < current.length ; i++) {
            result[i] = current[i];
        }

        return result;

    }

}