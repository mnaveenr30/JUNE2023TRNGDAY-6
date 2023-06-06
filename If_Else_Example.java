import java.util.*;
class If_Else_Example{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
float a=sc.nextFloat();
float b=sc.nextFloat();
if(a==0||b==0) System.out.println("Division is Error");
else System.out.println("Division "+a+" / "+b+" is :"+(a/b));
}
}