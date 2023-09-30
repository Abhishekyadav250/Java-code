import java.lang.*;

public class SingleTaskFromSingleThreads extends Thread{


public void run(){

    System.out.println("Fist task");
}

public static void main(String[] args){


    SingleTaskFromSingleThreads object = new SingleTaskFromSingleThreads();

object.start();
}





}