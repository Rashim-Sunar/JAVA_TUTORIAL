//Qn.1 Create a class monkey with jump() and bite() methods. Create a class Human which inherits this Monkey class
// and implements BasicAnimal interface with eat() and sleep() methods. 
//Qn.2 Demonstrate polymorphism using monkey class from above qn.

class Monkey{
    public void jump(){
        System.out.println("Jumping");
    }

    public void bite(){
        System.out.println("Biting");
    }
}

interface BasicAnimal{
     void eat();
     void sleep();
}

class Human extends Monkey implements BasicAnimal{
    public void speak(){
        System.out.println("Speaking");
    }

    @Override
    public void eat(){
        System.out.println("Eating");
    }

    @Override
    public void sleep(){
        System.out.println("Sleeping");
    }

    @Override
    public void jump(){
        System.out.println("Human jumping");
    }
}

public class RS_22_Practice {
    public static void main(String[] args) {
        Human h = new Human();
        h.speak();
        h.jump();
        h.bite();
        h.eat();
        h.sleep();

        Monkey m1 = new Human();
        // m1.speak(); --> Can not use speak method because the reference is monkey which doesn't have speak method
        m1.jump();
        m1.bite();
    }
}
