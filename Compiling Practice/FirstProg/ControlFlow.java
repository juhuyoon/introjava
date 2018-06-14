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
//void = printing is only for our eyes, so it doesn't actually make an output where something is shown. Return value can be anything. 
//from void, it can be string, int, boolean, etc to specify the return value for the function. 
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



//changing from void to int to return the output that is desired.
//returning currentLikes, which is an integer, so the storage return is int
public int likePhoto(int currentLikes, String comment, boolean like) {
    System.out.println("Feedback: " + comment);
    if(like) {
        currentLikes = currentLikes + 1;
    }
    System.out.println("Number of likes: " + currentLikes);
    return currentLikes;

}

int returnedLikes = likePhoto(0, "nice", true); //returns 1
int totalLikes = likePhoto(returnedLikes, "I like this", true); //now it's the integer of 1 instead of zero and totalLikes counts up to 2. 


// Define a function with the name and parameters: makeChange(double itemCost, double dollarsProvided)
// Calculate and return the calculated change which should be the dollarsProvided minus the itemCost

// Remember to return a value you need 1) a return type and 2) a return statement

public double makeChange(double itemCost, double dollarsProvided) {
    double change = dollarsProvided - itemCost;
    return change;
}
