
package genericsocjp;
import java.util.List;
import java.util.ArrayList;

public class GenericsOCJP {

    public static void callingGenericMethod(List<Machine> list){
        for(Machine call: list){
            System.out.println(call + " ");
        }
    }
    public static void callingGenericMethod1(List<Camera> list){
        for(Camera call: list){
            System.out.println(call + " ");
        }
    }
    public static void callingGenericMethod2(List<?> list){
        for(Object call: list){
            System.out.println(call + " ");
        }
    }
    public static void callingGenericMethod3(List<? extends Machine> list){
        for(Machine call: list){
            System.out.println(call + " ");
        }
    }
    public static void callingGenericMethod4(List<? extends Camera> list){
        for(Camera call: list){
            System.out.println(call + " ");
        }
    }
    public static void callingGenericMethod5(List<? super Machine> list){
        for(Object call: list){
            System.out.println(call + " ");
        }
    }
    public static void callingGenericMethod6(List<? super Camera> list){
        for(Object call: list){
            System.out.println(call + " ");
        }
    }
    public static void main(String[] args) {
       //1:
       List<Machine> list1=new ArrayList<>();
       list1.add(new Machine());
       list1.add(new Camera());
       list1.add(new Picture());
       callingGenericMethod(list1); // this is for Machine type.
       System.out.println("-----------------------------------");
       List<Camera> list2=new ArrayList<>();
       list2.add(new Camera());
       list2.add(new Picture());
       //list2.add(new Machine()); // MAchine is not subtype of Camera.
       callingGenericMethod1(list2);// this is for Camera type.
       System.out.println("-----------------------------------");
       
       List<Machine> list3=new ArrayList<>();
       list3.add(new Machine());
       list3.add(new Camera());
       list3.add(new Picture());
       callingGenericMethod2(list3); // Type MAchine can accept all instances of subclass
       List<Camera> list4=new ArrayList<>();
       list4.add(new Camera());
       list4.add(new Picture());
        callingGenericMethod2(list4);// type Camera can axcept its subclass but not its Super-Class
       List<Picture> list5=new ArrayList<>();
       list5.add(new Picture());
       callingGenericMethod2(list5);// type Picture can axcept Only its instance as it is a junior class.
       System.out.println("-----------------------------------");
 
              callingGenericMethod3(list3); // In extends keyword all classes extending Machine is axceptble.
              callingGenericMethod3(list4);
              callingGenericMethod3(list5);
              callingGenericMethod4(list4);// All classes extending Camera is applicable.
              callingGenericMethod4(list5);
              
       System.out.println("-----------------------------------");
              callingGenericMethod5(list3);// In super only super classes of MAchine and MAchine itself is allowed.
              //callingGenericMethod5(list4);
              //callingGenericMethod5(list5);
              
              
              callingGenericMethod6(list3);// IN super of Camera ..Only super class of Camre i.e MAchine is allowed.
              callingGenericMethod6(list4);
              //callingGenericMethod6(list5);
           
    }
    
}
