// a card guessing game!

class GuessTheCard {
  
  public static void main(String[] args) {
    int value = (int)(13.0 * Math.random()) + 1;   
    int suit = (int)(3.0 * Math.random()) + 20;
    
    //greeting   
    System.out.println("Can you guess the card I hold in my hand?");
    System.out.print("I'll let you know if your guess is right or how it is wrong.");
    System.out.print("Enter a value guess (like 3 or Jack):");
    String a = input.nextLine(); //get the value guess
    System.out.print("Now guess the suit:");  
    String b = input.nextLine(); //get the suit guess
    
    //if the guess (b) is not equal to the selected number, 
    //guesser stays in the loop asking for guesses and responding with high or low.  
    int va = convertIt(a);                  //converts the value string to a number for comparison
    int vb = convertIt(b);                  //converts the suit string to a number (20-23) for comparison
    
//the below works by comparing the assigned ints to the randomly generated ones and offering  
//prompts to re-input guesses for wrong values or suits as appropriate. 
    while (va != value && vb != suit) {
      if (va < value && vb != suit){        //for incorrect suit and low value
        System.out.println("The suit is wrong and the value is higher.");
        System.out.print("Guess again:");
        a = input.nextLine();
        System.out.print("of");
        b = input.nextLine();
        va = convertIt(a);
        vb = convertIt(b);
      }
      if (va > value && vb != suit) {        //for incorrect suit and high value
        System.out.println("The suit is wrong and the value is lower.");
        System.out.print("Guess again:");
        a = input.nextLine();
        System.out.print("of");
        b = input.nextLine();
        va = convertIt(a);
        vb = convertIt(b);
      }
    }
    while (va == value && vb != suit) {      //for incorrect suit and correct value
      System.out.print("You've got the right value! But the suit is wrong.");
      System.out.print("Guess the suit:");
      b = input.nextLine();
      vb = convertIt(b);
    }
    while (va != value && vb == suit) {      //for correct suit and low value
      if (va < value) {
        System.out.println("The suit is right but the value is higher.");
        System.out.print("Guess the value again:");
        a = input.nextLine();
        va = convertIt(a);
      }
      if (va > value) {                       //for correct suit and high value
        System.out.println("The suit is right but the value is lower.");
        System.out.print("Guess the value again:");
        a = input.nextLine();
        if (a == "A") {va=1;}
        va = convertIt(a);
      }
    }
    if (va == value && vb == suit) {          //when the suit and value are guessed correctly, the game ends
      if (va == 1) {a = "Ace";}
      if (va == 11) {a = "Jack";}
      if (va == 12) {a = "Queen";}
      if (va == 13) {a ="King";}
      if (vb == 20) {b = "Diamonds";}
      if (vb == 21) {b = "Spades";}
      if (vb == 22) {b = "Clubs";}
      if (vb == 23) {b = "Hearts";}
      System.out.print("Yes, my card is the ");
      System.out.print(a);
      System.out.print(" of ");
      System.out.print(b);
      System.out.println("!");                       //the end.
    }
  }
  
//converts the string entered to a value for comparison after each input
  public static int convertIt (String a) {
    int va = 0;
    if (a.equals("A")) {va=1;}
    if (a.equals("Ace")) {va=1;}
    if (a.equals("a")) {va=1;}
    if (a.equals("ace")) {va=1;}
    if (a.equals("2")) {va=2;}
    if (a.equals("3")) {va=3;}
    if (a.equals("4")) {va=4;}
    if (a.equals("5")) {va=5;}
    if (a.equals("6")) {va=6;}
    if (a.equals("7")) {va=7;}
    if (a.equals("8")) {va=8;}
    if (a.equals("9")) {va=9;}
    if (a.equals("10")) {va=10;}
    if (a.equals("J")) {va=11;}
    if (a.equals("Jack")) {va=11;}
    if (a.equals("j")) {va=11;}
    if (a.equals("jack")) {va=11;}
    if (a.equals("Q")) {va=12;}
    if (a.equals("Queen")) {va=12;}
    if (a.equals("queen")) {va=12;}
    if (a.equals("q")) {va=12;}
    if (a.equals("K")) {va=13;}
    if (a.equals("King")) {va=13;}
    if (a.equals("king")) {va=13;}
    if (a.equals("k")) {va=13;}
    if (a.equals("D")) {va=20;}
    if (a.equals("Diamond")) {va=20;}
    if (a.equals("Diamonds")) {va=20;}
    if (a.equals("diamonds")) {va=20;}
    if (a.equals("diamond")) {va=20;}
    if (a.equals("d")) {va=20;}
    if (a.equals("S")) {va=21;}
    if (a.equals("Spade")) {va=21;}
    if (a.equals("Spades")) {va=21;}
    if (a.equals("spades")) {va=21;}
    if (a.equals("spade")) {va=21;}
    if (a.equals("s")) {va=21;}
    if (a.equals("C")) {va=22;}
    if (a.equals("Club")) {va=22;}
    if (a.equals("Clubs")) {va=22;} 
    if (a.equals("clubs")) {va=22;} 
    if (a.equals("club")) {va=22;} 
    if (a.equals("c")) {va=22;} 
    if (a.equals("H")) {va=23;}
    if (a.equals("Heart")) {va=23;}
    if (a.equals("Hearts")) {va=23;}
    if (a.equals("hearts")) {va=23;}
    if (a.equals("heart")) {va=23;}
    if (a.equals("h")) {va=23;}
    return va;
  }
}
