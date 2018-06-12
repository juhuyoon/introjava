//if else statements via Java


boolean isRaining; // true or false
// Write an if statement below that prints out "Windshield wipers on." when isRaining is true.
if(isRaining) {
    System.out.println("Windshield wipers on.");
};


boolean isLightGreen;
boolean isLightYellow;
//if multiple else if statements, it will take on only the very first condition. 
if (isLightGreen) {
    System.out.println ("Drive");
} else if(isLightYellow) {
    System.out.println("Slow Down");
} else {
    System.out.println("Stop");
}

//Boolean Expressions
//double equal = equality
//one equal = variable assignment
int x = 10;
x >= 10; //true
x == 9 //false


//in Java, just initial statement of booleans are considered true immediately
int ticketPrice = 10;
int age;
boolean isStudent;
if(age <= 15) {
    ticketPrice = 5;
} else if(age > 60) {
    ticketPrice =5;
} else if(isStudent) {
    ticketPrice = 5;
}

//Three maiun logical operators:
3 < 5  && 2 > 15 //response is false as both are not true
3 < 5 || 2 > 15 //response is true since one is true
!(3 < 5) //false since it's not 

false && true || true  //&& will evaluate first, then ||, so end result is true
false && (true || true) //inside parentheses evaluates first, so end result is false 

//nested
boolean action;
boolean romance;
boolean horror;
boolean comedy;

if(action && romance) {
    System.out.println("action & romance");
    if(comedy || horror) {
        System.out.println("also is either comedy or horror");
    }
}

//switch statement
int passcode;
String coffeeType;
switch(passcode) {
    case 555: coffeeType = "Espresso";
        break;
    case 312: coffeeType = "Vanilla Latte";
        break;
    case 629: coffeeType = "Drip Coffee";
        break;;
    default: coffeeType = "Unknown";
        break;
}
System.out.println(coffeeType);


//random function practices:
//public = access modifier that allows anyone to use this public functions
//void = return type. This function is not returning any data. When it's only performing actions and not returning any results, then void is the use. 
//function name = "chorus", just the name. 

//parameters = variables in the parentheses of our function, that we can use inside our function

public void chorus() {
    System.out.printtln("Something");
    System.out.printtln("Something");
    System.out.printtln("Something");
    System.out.printtln("Something");
    System.out.printtln("Something");
}

chorus();
//call it by prompting this code to run

boolean playButton; // true or false

// Define a function playMusic() below.
// This should print out: "Music is playing" when playButton is true
// and "Music is paused" when playButton is false.
public void playMusic() {
    if(playButton) {
        System.out.println("Music is playing");
    } else {
        System.out.println("Music is paused");
    }
}

//setting variables with int, string etc?
int something = 15; 