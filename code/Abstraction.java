abstract class Vehicle{

    abstract void strat();
}

class car extends  Vehicle{

    void strat(){

        System.out.println("Car starts with key");
    }
}


class scooter extends Vehicle{

    void strat(){

        System.out.println("Scooter starts with kick");

    }
}

public class Abstraction extends car{


    public static void main(String[] args){

        car c = new car();
c.strat();
        
    }







}