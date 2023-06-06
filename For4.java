import java.util.Scanner;
class For4{
public static void main(String args[]){
int a=1;
Scanner sc=new Scanner(System.in);
String str="";
System.out.println("Enter The Factorial Number....");
int b=sc.nextInt();
for(int i=1;i<=b;i++){
a*=i;
}
System.out.print(" Factorial Of a Number is :\t"+a);
}
}