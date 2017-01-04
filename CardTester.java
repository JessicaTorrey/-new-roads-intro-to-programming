//this calss is to test the Card object
public class CardTester{
  
  //main method for testing
  public static void main(String[] args){
    
    //creating a Card object
    Card c = new Card();
    
    c.setColor("black");
    
    //pring out card
    System.out.println(c.toString());
    
    //second card in hand
    Card c2 = new Card();
    
    c2.setColor("red");
    //set suit
    //set rank
    
    c2.setSuit("hearts");
    c2.setRank('7');
    
    System.out.println(c.toString());
    
    Card c3 = new Card();
    c3.setColor("black");
    c3.setSuit("clubs");
    c3.setRank('J');
    System.out.println(c.toString());
    
    Card c4 = new Card();
    c4.setColor("red");
    c4.setSuit("dimond");
    c4.setRank('3');
    System.out.println(c.toString());
    
    Card c5 = new Card();
    c5.setColor("black");
    c5.setSuit("spade");
    c5.setRank('K');
    System.out.println(c.toString());
      
  }
  
  
}//end of class