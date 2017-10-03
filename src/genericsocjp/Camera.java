
package genericsocjp;

public class Camera extends Machine {
    static int count;
    
    public String toString(){
        return "This is my Camera....";
    }
    
    public static void snap(){
        System.err.println("This is my"+ count + " picture..");
        count++;
    }
}
