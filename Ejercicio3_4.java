import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Ejercicio3_4 {

    public static void main(String[] args){
        Listado lista = new Listado();
    Productor p=new Productor(lista);
    Lector l= new Lector(lista);
    try{
        p.start();
        l.start();
        for(int i=0;i<100000;i++) {
            if (!lista.vacio()) {
                p.join();
                l.start();
            }
            if(lista.vacio()) {
                l.join();
                p.start();
            }
        }
    } catch (Exception e){
        System.out.println(e.getMessage());
    }
    }
}

