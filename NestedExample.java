import java.util.Scanner;

class NestedExample {

public static void main(String args[]){

Scanner obj = new Scanner(System.in);

System.out.print("Enter your age");
int age = obj.nextInt();


if(age>=18){
  System.out.println("eligible to join");
  System.out.print("Enter your percentage");
int percentage = obj.nextInt();
   if(percentage>=60){
      System.out.println("enough mark");
}else{
System.out.println("not enough mark");
}
}else{
System.out.println("not eligible to join");
}








}
}