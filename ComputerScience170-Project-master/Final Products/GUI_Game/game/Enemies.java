import java.util.*;
import java.lang.*;
/**
 * This class extends Sarz and stores the enemies so that they can
 * be pulled into teh program.
 * @author: Riley Clarkson, Anirrudh Krishnan, Zac Gallagher
 */
public class Enemies extends Sarz{

  private String enemyName;
  private double enemyHealth;
  private double enemyHitPoints;
  private String enemyLocation;
  public String enemyImage;
  Enemies[] enemies;

  public Enemies(){
    enemyName = null;
    enemyHealth = 0.0;
    enemyHitPoints = 0.0;
    enemyLocation = null;
    enemies = new Enemies[9];

  }
  /**
   * initializes enemies
   * @param   enemyName type String
   * @param   enemyHealth type double
   * @param   enemyHitPoints type double
   * @param   enemyLocation type String
   */
  public Enemies(String enemyName, double enemyHealth, double enemyHitPoints, String enemyLocation) {
    this.enemyName = enemyName;
    this.enemyHealth = enemyHealth;
    this.enemyHitPoints = enemyHitPoints;
    this.enemyLocation = enemyLocation;

  }
  /** Making enemy types here that can be picked from randomly in Sarz
   */
  public void generateEnemies(){

    enemies[0] = new Enemies("DRAGON", 100.00, 100.00, "CAVE");
    enemies[1] = new Enemies("SATURN FLY TRAP", 10.00, 15.00, "FOREST");
    enemies[2] = new Enemies("ICE APE", 50.00, 40.00, "TUNDRA");
    enemies[3] = new Enemies("RED SPOTTED PYTHON", 25.00, 50.00, "GRASSLAND");
    enemies[4] = new Enemies("SWARM OF BLUE HORNETS", 15.00, 15.00, "FOREST");
    enemies[5] = new Enemies("NEEDLE CAT", 35.00, 30.00, "GRASSLAND");
    enemies[6] = new Enemies("SAKAI", 20.00, 10.00, "TUNDRA");
    enemies[7] = new Enemies("SWINGING SQUIRREL", 25.00, 30.00, "FOREST");
    enemies[8] = new Enemies("FLYING PENGUIN", 40.00, 30.00, "TUNDRA");
  }
  /**
   * Setters and Getters are all below here.
   * @return enemies; enemyName; enemyHealth; enemyHitPoints; enemyLocation;
   */
  public Enemies[] getEnemies(){
    return enemies;
  }

  public void setEnemies(Enemies[] enemiesArray){
    enemies = enemiesArray;
  }

  public String getEnemyName() {
    return enemyName;
  }

  public void setEnemyName(String enemyName) {
    this.enemyName = enemyName;
  }


  public double getEnemyHealth() {
    return enemyHealth;
  }

  public void setEnemyHealth(double enemyHealth) {
    this.enemyHealth = enemyHealth;
  }

  public double getEnemyHitPoints() {
    return enemyHitPoints;
  }

  public void setEnemyHitPoints(double enemyHitPoints) {
    this.enemyHitPoints = enemyHitPoints;
  }

  public String getEnemyLocation() {
    return enemyLocation;
  }

  public void setEnemyLocation(String enemyLocation) {
    this.enemyLocation = enemyLocation;
  }
}
