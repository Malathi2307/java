import java.util.*;
class employee{
public static void main(String args[]){
Scanner g=new Scanner(System.in);
System.out.println("name of the employee:");
String name=g.nextLine();
System.out.println("Age:");
int age=g.nextInt();
System.out.println("Salary:");
int salary=g.nextInt();
if(salary>=25000 && age<=60 && salary>=25000){
System.out.println("hi"+name+"you are eligible to apply for loan");
}
else{
System.out.println("INVALID");
}}}

