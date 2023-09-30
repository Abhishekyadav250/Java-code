// import java.lang.*;

public class RunableThread implements Runnable{


    public void run (){


        System.out.println("Task Run");
    }


    public static void main(String[] args){

RunableThread obj = new RunableThread();

Thread object = new  Thread(obj);


object.start();


    }
}