import java.util.concurrent;

class Bookseat{

    int total_seat=113;


    void bookseat(int seats){
        if(total_seat>seats){

            System.out.println("Seat book successfully   ");

        }
        else{
                        System.out.println("Seat can't book successfully   ");

        }
    }
}


public class Synchronises extends Thread{

    static Boookseat obj;

    int seats;

    public void run(){

        b.bookseat(seats);

    }

    public static void main(String[] args){

Synchronises abhishek = new Synchronises();

abhishek.seats =7;

abhishek.start();

Synchronises lenovo = new Synchronises();
lenovo.seats =8;

lenovo.start();


    }
}