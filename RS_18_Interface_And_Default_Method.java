/*
  Java Interfaces Example & Default Methods
Default methods In Java:
An interface can have static and default methods.
Default methods enable us to add new functionality to existing interfaces.
This feature was introduced in java 8 to ensure backward compatibility while updating an interface. 
A class implementing the interface need not implement the default methods.
Interfaces can also include private methods for default methods to use.
You can easily override a default method like any other method of an interface.
 */


interface MyCamera{
    void takeSnap();
    void recordVideo();

    //Private method can not be used from outside of the same class.
    private void greet(){
        System.out.println("Good morning");
    }
    // interface can contain default method only which needs to be overridden in the implemented class
    //But by using default access modifier, we can specify new features in interface. It can also be overridden in implemented class.
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k quality");
    };
}


interface Wifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling" +phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting....");
    }
}

class MySmartPhone extends MyCellPhone implements Wifi, MyCamera{
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

    // @Override
    // public void record4kVideo(){
    //     System.out.println("4k video recorded on smartPhone");
    // }
}

public class RS_18_Interface_And_Default_Method {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String[] arr = ms.getNetworks();
        for(String item: arr){
            System.out.println(item);
        }

        ms.record4kVideo();
    }
}
