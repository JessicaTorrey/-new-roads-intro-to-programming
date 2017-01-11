public class BlackCard extends Card{
  
  private String color;

  //zero argument default constructor
  public BlackCard(/*String suit, char rank*/){
    /*this.suit = suit;
    this.rank = rank;*/
    color = "black";
  }
  
  public String toString(){
    return super.toString() + " " + color;
    
  }

}