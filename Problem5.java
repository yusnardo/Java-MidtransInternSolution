package Midtrans;

import java.time.LocalTime;
import java.util.ArrayList;
/**
 *
 * @author Yusnardo
 */
public class Problem5 {
    public static void main (String[]args){
        ArrayList<Bus> c = new ArrayList<>();
        ArrayList<Bus> d = new ArrayList<>();
        Bus bus1 = new Bus(LocalTime.of(10,0), LocalTime.of(10,5));
        Bus bus2 = new Bus(LocalTime.of(10,5), LocalTime.of(10,15));
        Bus bus3 = new Bus(LocalTime.of(10,10), LocalTime.of(10,30));
        Bus bus4 = new Bus(LocalTime.of(10,25), LocalTime.of(10,40));
        Bus bus5 = new Bus(LocalTime.of(10,45), LocalTime.of(10,50));
        
        d.add(bus1);
        d.add(bus2);
        d.add(bus3);
        d.add(bus4);
        d.add(bus5);
        
        for (int i = 0; i<=55; i+=5){
            LocalTime now = LocalTime.of(10,i);
            for (int j = 0; j < d.size(); j++) {
                Bus bus = d.get(j);
                if (bus.getA().toString().equals(now.toString())) {
                    c.add(bus);
                    d.remove(bus);                    
                }
            }
            if (!c.isEmpty()) {
                for (int k = 0; k < c.size(); k++) {
                    Bus bus = c.get(k);
                    if (bus.getB().toString().equals(now.toString())) {
                        c.remove(bus);                    
                    }
                }
            }
            System.out.println(now + " : " + c.size() + " Bus ");
        }
    }
}
class Bus{
    private LocalTime a;
    private LocalTime b;
    
    public Bus(LocalTime a, LocalTime d) {
        this.a = a;
        this.b = b;
    }
    public LocalTime getA() {
        return a;
    }
    public void setA(LocalTime a) {
        this.a = a;
    }
    public LocalTime getB() {
        return b;
    }
    public void setD(LocalTime b) {
        this.b = b;
    }
}
