/**
 * This method will store all of the UserStats that are input throughout the game
 * and will be called upon to feed it back in.
 * @author: Anirrudh Krishnan, Riley Clarkson, Zac Gallagher
 */
public class UserStats {

  String userName;
  String decision;

  private double hp;
  private int day;
  private int hour;
  private int hours;
  private boolean weaponChoice;
  private double hitPoints;
  /**
   * initializes all values in this method.
   */
  public UserStats(){
    userName = null;
    decision = null;
    weaponChoice = false;
    hitPoints = 0.0;
    hp = 0.0;
    day = 0;
    hour = 0;
  }
  /**
   * This sets the default things that the user will start with,
   * including the Health and the Damage that they can do.
   * @param  userName takes in a String
   * Everything under this function is either a setter or a getter.
   */
  public UserStats(String userName){
    this.userName = userName;
    decision = null;
    hitPoints= 15.00;
    hp = 150.00;
    day = 1;
    hour = 1;
  }
  /**
   * Setters and Getters follow under!
   * @return hitPoints; userName; decision; hp; day; hour;
   */
  public double getHitPoints() {
    return hitPoints;
  }

  public String getUserName(){
    return userName;
  }

  public String getDecision(){
    return decision;
  }

  public double getHP(){
    return hp;
  }

  public int getDay(){
    return day;
  }

  public int getHour(){
    return hour;
  }

  public void setHitPoints(double hitPoints){
    this.hitPoints = hitPoints;
  }

  public void setUserName(String userName){
    this.userName = userName;
  }

  public void setDecision(String decision){
    this.decision = decision;
  }

  public void setHP(double hp){
    this.hp = hp;
  }

  public void setDay(int day){
    this.day = day;
  }

  public void setHour(int hour){
    this.hour = hour;
  }

  public double setMedicine() {
    setHP(getHP() + 30.00);
    return hp;
  }

  public void setMachete(boolean weaponChoice){
    this.weaponChoice = weaponChoice;
  }
  public boolean getMachete(){
    return weaponChoice;
  }
}
