import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Game {
  Sarz s = new Sarz();

  Scanner keyboard = new Scanner(System.in);
  /**
   * This method first reads in a text file in which the introduction for the game exists.
   * It then calls in the method writeOutput(); during which it calls upon other methods as
   * well.
   */
  public void premise(){
    s.clearScreen();
    Scanner inputStream = null;

    try{
      inputStream = new Scanner(new File("SarzIntro.txt"));
    }
    catch(FileNotFoundException e){
      System.out.println("Error in introduction.");
      System.exit(0);
    }
    while(inputStream.hasNextLine()){
      String line = inputStream.nextLine();
      System.out.println(line);
    }
    inputStream.close();
    writeOutput();
  }
  /**
   * This method simply invokes other methods and is summoned in the Main function.
   */
  public void play(){
    s.mapGeneration();
    s.userMoveIntro();
    s.moveForward();
  }
  /**
   * This method first invokes setPlayerName, which asks the player for their name.
   * This is followed by offering them [the player] one of the items to enhance their
   * experience through the game.
   */
  public void writeOutput() {
    s.setPlayerName();
    System.out.println("\nYou have the choice between taking two items to help you on your journey: \n");
    System.out.print("Either some MEDICINE or a MACHETE. \n");
    System.out.println("");
    s.getWeapon();
  }
  /**
   * This method just calls reset, and then proceeds to execute main.
   */
  public void playAgain(){
    System.out.println("Would you like to play again?");
    System.out.println("Enter 1 for YES or 2 for NO.");
    String playChoice = null;
    playChoice = keyboard.nextLine();
    switch (playChoice) {
      case "1":
        s.reset();
        Main.main(new String[0]);
        break;
      case "2":
        System.out.println("Thanks for visiting Sarz++.");
        System.exit(0);
        break;
      default:
        System.out.println("Invalid input. Please enter a valid choice.");
        playAgain();
        break;
    }
  }
}
