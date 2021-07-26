import java.util.*;
class ExceptionHandling{

public static void main(String[] args){
System.out.println("1st Exception!!");
try {
int[] arr = new int[5];
arr[6] = 1;
} 
catch (IndexOutOfBoundsException e) {
System.out.println("Exception caught\n"+e);
}


System.out.println("2nd Exception!!");
try { 
int num = Integer.parseInt ("JavaException"); 
System.out.println(num); 
} 
catch(NumberFormatException e){ 
System.out.println("Number format exception\n"+e); 
} 


System.out.println("3rd Exception!!");
try{
int a = 0;
int b =20;
int c = b/a;
}
catch(ArithmeticException e){
System.out.println("ArithmeticException\n"+e);
}
finally{
System.out.println("Finally block is executed Successfully");
}

}
}