import java.util.Scanner;
class Reverceofthenumber1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number,,,,");
String str=sc.nextLine();
String rev="";
int len=str.length()-1;
for (int i=len;i>=0;i--){
rev=rev+str.charAt(i);
}
System.out.println("Reversal of String is :\t"+rev);
}
}
