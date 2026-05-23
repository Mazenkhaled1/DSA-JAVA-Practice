package AdvancedTopices;



class Animal {

    private String name;
    private int number ;

    public Animal(String name , int number )
    {
        this.name  = name ;
        this.number = number ;
    }

     void eat()
    {
        System.out.println("animal eats>>>");
    }


}

class Dog extends  Animal{


    public Dog(String name , int number)
    {
       super(name,number);
    }

    @Override
     void eat()
    {
        System.out.println("bla bla bla ");
    }
    protected void eat(int number )
    {
        System.out.println("bla bla bla " + number );
    }


}
public class PolyMorph {
    public static void main(String[] args)
    {
        Dog myDog = new Dog("tany wahed men el dog" , 12) ;
        myDog.eat();
        myDog.eat(2);


    }

}
