//Throwing userdefined exception... 

class MyException extends Exception{
  public MyException(String msg){
   //Call the constructor of parent Exception...
    super(msg);
  }
}

public class TestThrow3 {
    public static void main(String[] args) {
      try{
	//Throw an object of userdefined exception...
	throw new MyException("Exception occured in main class. This is a custom exception");
      }catch(MyException e){ 
	System.out.println(e.getMessage());	
      }
   }
}
