/*
 As we already know java being completely object-oriented works within a 
 multithreading environment in which thread scheduler assigns the processor 
 to a thread based on the priority of thread. Whenever we create a thread in Java, 
 it always has some priority assigned to it. Priority can either be given by 
 JVM while creating the thread or it can be given by the programmer explicitly.

 The priority order ranges from 0 to 10. 
  Three constants are defined in it: NORM_PRIORITY-5, MIN_PRIORITY-1 , MAX_PRIORITY-10

  Thread with the highest priority will get an execution chance prior to other threads.
  If two threads have the same priority then we can’t expect which thread will execute first.
  It depends on the thread scheduler’s algorithm(Round-Robin, First Come First Serve, etc)

 */


 class MyThread1 extends Thread{
    public MyThread1(String name){
        super(name);
    }

    public void run(){
        for(int i=0; i<50; i++){
            System.out.println("I am Thread: "+ this.getName());
    }
        }
 }

public class Thread_Priority {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("Aakash");
        MyThread1 t2 = new MyThread1("Bivek");
        MyThread1 t3 = new MyThread1("Aarav");
        MyThread1 t4 = new MyThread1("Nabin");
        MyThread1 t5 = new MyThread1("Dipsan");
        t1.setPriority(1);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(2);
        t5.setPriority(10);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();  
        System.out.println(Thread.activeCount()); //Returns an estimate of the number of active threads in the current thread’s thread group and its subgroups
    }
}
