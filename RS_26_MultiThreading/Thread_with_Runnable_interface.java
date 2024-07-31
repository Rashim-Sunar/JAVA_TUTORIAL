//Creating java threads using Runnable Interface... 

class runnableThread1 implements Runnable{
    public void run(){
        for(int i=0; i<200; i++){
            System.out.println("I'm bullet-1 in thread-1");
        }
    }
}

class runnableThread2 implements Runnable{
    public void run(){
        for(int i=0; i<200; i++){
            System.out.println("I'm bullet-2 from thread-2");
        }
    }
}

public class Thread_with_Runnable_interface {
    public static void main(String[] args) {
        runnableThread1 bullet1 = new runnableThread1();
        runnableThread2 bullet2 = new runnableThread2();
        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}

/*
 OUTPUT BE LIKE... 
 I'm bullet-1 in thread-1
 I'm bullet-1 in thread-1
 I'm bullet-1 in thread-1
 I'm bullet-1 in thread-1
 I'm bullet-1 in thread-1
 I'm bullet-2 from thread-2
 I'm bullet-2 from thread-2
 I'm bullet-2 from thread-2
 I'm bullet-2 from thread-2
 I'm bullet-2 from thread-2
  I'm bullet-1 in thread-1
 I'm bullet-1 in thread-1
 I'm bullet-1 in thread-1
 I'm bullet-1 in thread-1
 I'm bullet-1 in thread-1
  I'm bullet-2 from thread-2
 I'm bullet-2 from thread-2
 I'm bullet-2 from thread-2
 I'm bullet-2 from thread-2
 I'm bullet-2 from thread-2
 ........so on 

 */
