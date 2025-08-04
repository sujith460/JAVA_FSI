import java.util.*;
public class Generic<T> {
    public void print(T a){
        System.out.println("Arugument recieved -->"+a);
    }
    public static void main(String[] args) {
        Generic g=new Generic<>();
        g.print(10);
        g.print("SUJIH");
        ArrayList l=new ArrayList();
        l.add("sujith");
        String s=(String)l.get(0);
        System.out.println(s);
    }
    
}
