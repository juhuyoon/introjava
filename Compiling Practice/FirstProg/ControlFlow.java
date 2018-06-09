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
