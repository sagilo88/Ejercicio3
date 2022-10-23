import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Listado{
 ArrayList<AtomicInteger> buffer;
  Listado(){
  buffer=new ArrayList<AtomicInteger>(0);
  }
 public synchronized boolean vacio(){
 boolean res= this.buffer.isEmpty();
  return res;
 }
}