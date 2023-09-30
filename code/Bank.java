import  java.util.Scanner;


public class Bank{

    private int saving;


public Bank(int deposite, int widthraw )
{
    saving = deposite-widthraw;
}

    public int money(){

     

     return saving;



    }

    public static void main(String[] args){

Bank b = new Bank(400,300);

System.out.println(b.money());



    }
}