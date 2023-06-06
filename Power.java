import java.util.Scanner;
class Power{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number,,,,");
int num=sc.nextInt();
int res=num;
System.out.println("Enter The Power,,,,");
int pow=sc.nextInt();
for (int i=1;i<pow;i++){
res*=num;
}
System.out.println(num+" Power of "+pow+" is :\t"+res);
}
}