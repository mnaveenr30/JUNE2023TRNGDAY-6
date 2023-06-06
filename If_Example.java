import java.util.Scanner;
class If_Example{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
double b=sc.nextDouble();
if(a==b){
System.out.println("max = Min = "+a);
}
else if(a>b){
System.out.println("Max is :"+a+"\t Min is :"+b);
}
else{
System.out.println("Max is :"+b+"\t Min is :"+a);
}
System.out.println("Avarage is : "+(a+b)/2);
}
}