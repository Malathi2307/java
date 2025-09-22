import java.util.*;
class exercise{
public static void main(String args[]){
Scanner g=new Scanner(System.in);
System.out.println("Enter the customerid:");
int id=g.nextInt();
System.out.println("Enter the customer name:");
String name=g.nextLines();
System.out.println("previous month reading:");
int prev=g.nextInt();
System.out.println("current month reading:");
int curr=g.nextInt();
System.out.println("type of EB connection(domestic/commercial:");
string type=g.nextLines();
int unit=curr-prev;
if (type==domestic){
	if (unit=100){
	charge=1*unit;
	System.out.println(charge);}
	else if(unit>101 && unit<200){
	charge=2.50*unit;
	System.out.println(charge);}
	else if(unit>201 && unit<500){
	charge=4*unit;
	System.out.println(charge);}
	else if(unit>501){
	charge=6*unit;
	System.out.println(charge);}
	else{
		System.out.println("INVALID");}}
else if (type==commercial){
	if (unit=100){
	charge=2*unit;
	System.out.println(charge);}
	else if(unit>101 && unit<200){
	charge=4.50*unit;
	System.out.println(charge);}
	else if(unit>201 && unit<500){
	charge=6*unit;
	System.out.println(charge);}
	else if(unit>501){
	charge=7*unit;
	System.out.println(charge);}
	else{
		System.out.println("INVALID");}}
else{
System.out.println("give proper instruction");
}}
		
