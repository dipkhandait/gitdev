import java.util.*;

class Arithmetic1{

void add(int a, int b){
System.out.println("A+B="+(a+b));
}
void sub(int a, int b){
System.out.println("A-B="+(a-b));
}
void mul(int a, int b){
System.out.println("A*B="+(a*b));
}
void div(int a, int b){
System.out.println("A/B="+(a/b));
}
void mod1(int a, int b){
System.out.println("A modulus B="+(a%b));
}
} 

class Relational1{
Relational1(int a, int b){
if(a>b) System.out.println("A is greater than B");
else if (a==b) System.out.println("A is equal to B");
else System.out.println("A is less than B");
}
}

class Bitwise1{
void B_and(int a, int b){
System.out.println("A and B= "+(a&b));
}
void B_or(int a, int b){
System.out.println("A or B= "+(a|b));
}
void B_XOR(int a, int b){
System.out.println("A XOR B= "+(a^b));
}
void leftshiftby2(int a, int b){
System.out.println("A << 2= "+(a<<2));
System.out.println("B << 2= "+(b<<2));
}
void rightshiftby2(int a, int b){
System.out.println("A >> 2= "+(a>>2));
System.out.println("A >> 2= "+(b>>2));
}
}
class Logical1{
void L_and(int a, int b){
if(a!=0 && b!=0) System.out.println("a and b are non zero");
else System.out.println("Amoung a or b atleast one is zero");
}
void L_or(int a, int b){
if(a!=0 || b!=0) System.out.println("Amoung a or b atleast one is non zero");
else System.out.println("Both a anb b are zero");
}
}
class Exam {

public static void main(String args[]){
System.out.println("Enter two numbers");
Scanner ob=new Scanner(System.in);
int a=ob.nextInt();
int b=ob.nextInt();
Arithmetic1 obj1=new Arithmetic1();
obj1.add(a,b);
obj1.sub(a,b);
obj1.mul(a,b);
obj1.div(a,b);
obj1.mod1(a,b);

Relational1 obj2= new Relational1(a,b);

Bitwise1 obj3= new Bitwise1();
obj3.B_and(a,b);
obj3.B_or(a,b);
obj3.B_XOR(a,b);
obj3.leftshiftby2(a,b);
obj3.rightshiftby2(a,b);

Logical1 obj4=new Logical1();
obj4.L_and(a,b);
obj4.L_or(a,b);

}
}