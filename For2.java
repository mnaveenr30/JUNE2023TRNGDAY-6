import java.util.Scanner;
class For2{
public static void main(String args[]){
int a=0;
Scanner sc=new Scanner(System.in);
String str="";
System.out.println("Enter Ending Value....");
int b=sc.nextInt();
for(int i=0;i<=b;i++){
str=str+i+"+";
a=a+i;
}
for (int j=0;j<str.length()-1;j++){
System.out.print(str.charAt(j));
}
System.out.print("="+a);
}
}

