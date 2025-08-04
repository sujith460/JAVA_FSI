import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(6);
        al.add(4);
        System.err.println("forward");
        Iterator<Integer> it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.err.println("backward");
        ListIterator<Integer> i=al.listIterator(al.size());
        while(i.hasPrevious()){
            System.out.println(i.previous());
        }
    }
}