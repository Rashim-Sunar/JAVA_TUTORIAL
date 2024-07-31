
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    public void run(){
       try{
        for(int i=0; i<10; i++){
            System.out.println("I am learning...");
            Thread.sleep(50);
        }
       }catch(InterruptedException e){
        System.out.println("Thread interrupted "+e);
       }

       System.out.println(Thread.currentThread().getName());
    }
}

public class Constructors_from_Thread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Aakash");
        MyThread t2 = new MyThread("Aarav");
        t1.start();
        t2.start();
        System.out.println(t1.getName());
        // System.out.println(t1.getId()); --> .getId() method is deprecated from java19 version
        System.out.println(t2.getName());
        // System.out.println(t2.getId());
    }
}
