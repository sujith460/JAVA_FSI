import java .io.*;
public class Threads implements Runnable{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"--> running");
        }
        try{
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName()+"--> executed");
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"--> ended");
    }
    public static void main(String[] args) {
        
        Threads obj=new Threads();
        Thread t1=new Thread(obj);
        t1.setName("thread1");
        t1.start();

        Thread t2=new Thread(obj);
        t2.setName("thread2");
        t2.start();

        Thread t3=new Thread(obj);
        t3.setName("thread3");
        t3.start();
    }
}
