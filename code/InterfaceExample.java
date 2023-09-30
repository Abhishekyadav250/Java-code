import java.io.*;
interface Building {
    void heightDisplay();
}
public class InterfaceExample implements Building {
    public void heightDisplay()
    {
        System.out.println("height is 5");
    }
    public static void main(String[] args){
        InterfaceExample gfg = new InterfaceExample();
        InterfaceExample.heightDisplay();
    }
}