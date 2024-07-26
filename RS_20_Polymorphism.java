/*
  POLYMORPHISM : one action different form...Eg. smartphone can be used as camera, wifi, cellpone ,etc. 
  Similar to dunamic dispatch method
 */


interface MyCamera1{
    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("Good morning");
    }
    
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k quality");
    };
}


interface Wifi1{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone1{
    void callNumber(int phoneNumber){
        System.out.println("Calling" +phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting....");
    }
}

class MySmartPhone1 extends MyCellPhone1 implements Wifi1, MyCamera1{
    @Override
     public void  takeSnap(){
        System.out.println("Taking snap");
    }

    @Override
    public void recordVideo(){
        System.out.println("Recording video");
    }

    @Override
    public String [] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Aakash5G", "Bivek5G", "Nabin5G"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network){
        System.out.println("Connecting to network "+network);
    }
}



public class RS_20_Polymorphism {
    public static void main(String[] args) {
        MyCamera1 c1 = new MySmartPhone1(); //This is smartphone but use it only as camera only...
        c1.takeSnap();
        c1.record4kVideo();
        c1.record4kVideo();
        // c1.getNetworks(); --> Not allowed
        // c1.sampleMeth(); --> Not allowed

    }   
}
