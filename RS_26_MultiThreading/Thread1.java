//Java Thread by extending Thread class

class MultiThread1 extends Thread{
    public void run(){
        for(int i=0; i<200; i++){
            System.out.println("This is thread-1");
        }
    }
}

class MultiThread2 extends Thread{
    public void run(){
        for(int i=0; i<200; i++){
            System.out.println("I am thread-2");
        }
    }
}


public class Thread1 {
    public static void main(String[] args) {
        MultiThread1 t1 = new MultiThread1();
        MultiThread2 t2 = new MultiThread2();
        //The start() method moves the thread to the active state.
        t1.start();
        t2.start();
        //Here some of the time of execution is given to t1 and some are given to t2. Hence, the tasks are running concurrently.
    }
}


/*
 OUTPUT BE LIKE..... 
 This is thread-1
 This is thread-1
 This is thread-1
 This is thread-1
 This is thread-1
 vThis is thread-1
 This is thread-1
 This is thread-1
 This is thread-1
 I am thread-2
 I am thread-2
 I am thread-2
 I am thread-2
 I am thread-2
 I am thread-2
 I am thread-2
 I am thread-2
  This is thread-1
 This is thread-1
 This is thread-1
 vThis is thread-1
 This is thread-1
 This is thread-1
 This is thread-1
  I am thread-2
 I am thread-2
 I am thread-2
 I am thread-2
 I am thread-2
 I am thread-2
 I am thread-2

 */