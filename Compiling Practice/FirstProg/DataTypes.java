//https://stackoverflow.com/questions/215497/in-java-difference-between-package-private-public-protected-and-private
//https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
int maxInt = 2147483647; //normal integer
long muchMOre = 214748347 * 10000000; //long = much larger integer. Storage/calculation takes much longer also only store natural numbers. 
double fraction = 99.275; //takes longer to calculate, used to store large numbers or just fraction numbers. 

//char you must have single quotes. 
char answer = 'b';
char three = '3'; //char = character storage, it also can only store ONE LETTER so a '10' won't be accepted.
//Strings
//for Java, you need double quotes around the text for Strings
String name = "Adam";
String fulltext = 'text of some sentence';

boolean fact = true;
boolean condition = false; //true or false storage


//Numbers
//use double to do accurate math divisions
double specific=  5/2.0;
double specific2 = 24/5.0;

//Strings
//for Java, you need double quotes around the text for Strings
String name = "Adam";

//Casting
double div = 5/2 //results in 2.5, but returns 2 via truncations
double current = 17;
double rate = 1.5;
double future = current * rate;
System.out.println(future); //output = 25.5
int approx = (int) future; //output is 25, and this (int) is casting. 


