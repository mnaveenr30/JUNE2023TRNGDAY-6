import java.util.Scanner;
class PalindromeString{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
int len=str.length()-1;
String rv="";
for(int i=len;i>len;i--){
rv=rv+str.charAt(i);
}
if(rv.equals(str)){
System.out.println("Palindrome");
}
else{
System.out.println("Not a Palindrome");
}
}
}