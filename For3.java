import java.util.Scanner;
class For3{
public static void main(String args[]){
int a=0;
Scanner sc=new Scanner(System.in);
String str="";
System.out.println("Enter Ending Value....");
int b=sc.nextInt();
for(int i=0;i<=b;i++){
a+=i;
}
System.out.print(" Sum :\t"+a);
}
}

