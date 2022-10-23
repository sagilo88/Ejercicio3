import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Lector extends Thread{
   Listado listado;
    Lector (Listado li){
        this.listado=li;

    }
    public void run(){
        try {
                if (!this.listado.vacio()) {
                    System.out.println(this.listado.buffer.get(0));
                    this.listado.buffer.clear();
                }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}
