import java.util.Random;
/**
 * This class defines and intizlizes the plants on the board.
 * @author: Riley Clarkson, Anirrudh Krishnan, Zac Gallagher
 */
public class Item extends Sarz{

  private String itemName;
  private String itemLocation;
  private int useful;
  Random r = new Random();
  Item[] plants;
  Item[] water;
  Item[] uselessItems;
  /**
   * Enumarated values tell the items where to go in the array.
   */
  private enum Plants{

    MANGO("MANGO"), PEACH("PEACH"), BANANA("BANANA"), APPLE("APPLE"), ORANGE("ORANGE"), LEMON("LEMON");

    private String name;

    private Plants(String name){
      this.name = name;
    }

    public String toString(){
      return name;
    }
  }

  private enum Biomes{

    FOREST("FOREST"), TUNDRA("TUNDRA"), GRASSLAND("GRASSLAND"), CAVE("CAVE");

    private String name;

    private Biomes(String name){
      this.name = name;
    }

    public String toString(){
      return name;
    }
  }

  private enum UselessItems{

    NAIL("NAIL"), ROCK("ROCK"), STICK("STICK"), PENNY("PENNY");

    private String name;

    private UselessItems(String name){
      this.name = name;
    }

    public String toString(){
      return name;
    }
  }
  /**
   * Item intializes the item amounts in the array.
   */
  public Item(){
    itemName = null;
    plants = new Item[6];
    water = new Item[1];
    uselessItems = new Item[11];
  }
  /**
   * Initialize item variables to use function.
   * @param   itemName type String
   * @param   useful type int
   * @param  itemLocation type String
   */
  public Item(String itemName, int useful, String itemLocation){
    this.itemName = itemName;
    this.useful = useful;
    this.itemLocation = itemLocation;
  }
  /**
   * Generate the items here in this method
   */
  public void generateItems(){
    for (int i = 0; i < 5; i++){
      plants[i] = new Item((Plants.values()[r.nextInt(5)]).name(), 2, Biomes.values()[r.nextInt(3)].name());
    }

    water[0] = new Item("LAKE", 1, Biomes.values()[r.nextInt(3)].name());

    for (int i = 0; i < 10; i++){
      uselessItems[i] = new Item((UselessItems.values()[r.nextInt(4)]).name(), 0, Biomes.values()[r.nextInt(3)].name());
    }
  }
  /**
   * Setters and Getters
   * @return itemName; itemLocation; useful;
   */
  public String getItemName() {
      return itemName;
  }
  public void setItemName(String itemName) {
      this.itemName = itemName;
  }
  public String getItemLocation() {
    return itemLocation;
  }
  public void setItemLocation(String itemLocation){
    this.itemLocation = itemLocation;
  }
  public int getUseful() {
    return useful;
  }
  public void setUseful(int useful){
    this.useful = useful;
  }
}
