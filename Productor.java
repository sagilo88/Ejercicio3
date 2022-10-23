import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public  class  Productor extends Thread {
    double random = Math.random()*100;
    AtomicInteger valor= new AtomicInteger((int)random);
     Listado listado= new Listado();
    Productor (Listado li) {
        this.listado = li;
        this.listado.buffer.add(valor);
    }

    public void run(){
        try {
                if (listado.vacio()) {
                    this.listado.buffer.add(valor);
                    random = Math.random()*100;
                    valor.addAndGet((int) random);
                    System.out.println("ok");
                }
        }catch (Exception e){

            System.out.println(e.getMessage());
        }
    }

}
