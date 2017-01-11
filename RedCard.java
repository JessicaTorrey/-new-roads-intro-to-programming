public class RedCard extends Card{
  
  private String color;

  //zero argument default constructor
  public RedCard(/*String suit, char rank*/){
    /*this.suit = suit;
    this.rank = rank;*/
    color = "red";
  }
  
  public String toString(){
    return super.toString() + " " + color;
    
  }

}