import java.util.Scanner;
class Reverceofthenumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number,,,,");
int a=sc.nextInt();
int res=0;
int rev=0,pd=1;
for (int i=0;i>=0;i++){
res=res+(a%10);
pd=pd*(a%10);
rev=(rev*10)+(a%10);
a=a/10;
if(a==0) break;
}
System.out.println("Sum Of Digits is :\t"+res+"\nProduct of digit is :\t"+pd+"\nReversal of number is :\t"+rev);
}
}
