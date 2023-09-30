interface I1{

    void show();

}

interface I2{

    void display();
}

public class Interface implements I1,I2{

    public void show(){

        System.out.println("Code is correct");

    }
    public void display(){
        
System.out.println("Sucessfully compile");

    }


    public static void main(String[] args){

        Interface obj = new Interface();

        obj.display();
    }
}